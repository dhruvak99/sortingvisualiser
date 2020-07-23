package sortvisualizer.util;
import sortvisualizer.SortArray;

public class Util {
    public static int findMaxvalueIndex(SortArray array,int uptoindex)
    {
        int maxindex =0 ;
        for ( int i=0;i<uptoindex;i++)
        {
            if(array.getValue(i) > array.getValue(maxindex))
                maxindex=i;
        }
        return maxindex;
    }
}
