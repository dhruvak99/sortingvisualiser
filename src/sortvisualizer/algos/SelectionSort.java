package sortvisualizer.algos;

import sortvisualizer.SortArray;
import sortvisualizer.SortArray;
public class SelectionSort implements ISortAlgorithm{

    private long stepDelay = 120;

    @Override
    public void runSort(SortArray array)
    {
        int len = array.arraySize();
        for ( int i =0;i<len-1;i++){
            int minindex = i;
            for ( int j=i+1;j<len;j++)
            {
                if (array.getValue(j) < array.getValue(minindex)){
                    minindex=j;
                }
            }
            array.swap(i,minindex,getDelay(),true);
        }
    }

    @Override
    public String getName(){
        return "Selection Sort";
    }

    @Override
    public long getDelay(){
        return stepDelay;
    }

    @Override
    public void setDelay(long delay)
    {
        this.stepDelay = stepDelay;
    }
}
