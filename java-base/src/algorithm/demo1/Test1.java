package algorithm.demo1;

/**
 * @author：xy
 */
public class Test1 {
    public static void main(String[] arys) {

    }

    // 二分法查找
    public static int biSearch(int[] ary,int a){
        int lo = 0;
        int hi = ary.length - 1;
        int mid;
        while (lo < hi) {
            mid = (lo + hi)/2;
            if (ary[mid] == a) {
                return mid + 1;
            }else if(ary[mid] < a){
               lo = mid + 1;
            }else {
                hi = mid -1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] ary){
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = 0; j < ary.length - 1; j++) {
                if(ary[i] > ary[i + 1]){
                    int temp = ary[i+ 1];
                    ary[i + 1] = ary[i];
                    ary[i] = temp;
                }
            }
        }
    }
}


