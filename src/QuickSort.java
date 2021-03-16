public class QuickSort {

    public static int[] quickSort(int[] arr,int low,int high){
        int start = low;
        int end = high;
        //获取基准值
        int key = arr[low];
        while (end > start){
            //从后向前比较，找到第一个比基准值小的数
            while (end > start && arr[end] >= key)
                end--;
            if(arr[end] < key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            //从后向前比较，找到第一个比基准值大的数
            while (end > start && arr[start] <= key)
                start++;
            if(arr[start] > key){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        if(start > low) quickSort(arr,low,start - 1);
        if(end < high) quickSort(arr,end + 1,high);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,9,5,7,8};
        arr = quickSort(arr,0,arr.length-1);
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
}
