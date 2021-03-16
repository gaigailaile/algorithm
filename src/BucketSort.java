public class BucketSort {

    public static int[] sort(int[] data){

        return data;
    }

    private static void bucketSort(int[] data){
        if(data.length == 0){
            return;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //获取最大值、最小值
        for (int value : data){
            if (value < min){
                min = value;
            }else if(value > max){
                max = value;
            }
        }

        https://www.runoob.com/w3cnote/bucket-sort.html

    }

    public static void main(String[] args) {

    }
}
