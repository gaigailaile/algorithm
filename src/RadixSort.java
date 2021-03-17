import java.util.Arrays;

public class RadixSort {

    public static int[] sort(int[] arr){
        //获取最长位数
        int maxDigit = getMaxDigit(arr);
        radixSort(arr,maxDigit);
        return arr;
    }

    private static int getMaxDigit(int[] arr){
        //获取最大值
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if(num > max) max = num;
        }

        //获取最大值的位数
        if(max == 0){
            return 1;
        }
        int length = 0;
        for (long temp = max; temp != 0; temp /= 10){
            length++;
        }
        return length;
    }

    private static void radixSort(int[] arr,int maxDigit){
        int mod = 10;
        int dev = 1;

        for (int i = 0; i < maxDigit; i++,dev*=10,mod*=10){
            int[][] counter = new int[mod * 2][0];

            for (int j = 0; j < arr.length; j++){
                int bucket = ((arr[j] % mod) / dev) + mod;
                counter[bucket] = arrayAppend(counter[bucket],arr[j]);
            }

            int pos = 0;
            for (int[] bucket : counter){
                for (int value : bucket){
                    arr[pos++] = value;
                }
            }
        }
    }

    private static int[] arrayAppend(int[] arr,int value){
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = sort(new int[]{1,56,7,5,304,12,102,45,183,3,345,123});
        for (int num:arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
