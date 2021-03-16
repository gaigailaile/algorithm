public class ShellSort {

    public static int[] shellSort(int[] arr){
        int dk = arr.length / 3 + 1;
        while (dk != 1){
            shellInsertSort(arr,dk);
            dk = dk / 3 + 1;
        }
        if(dk == 1) shellInsertSort(arr,dk);
        return arr;
    }

    public static void shellInsertSort(int[] arr,int dk){
        for (int i = dk; i < arr.length; i++){
            if(arr[i] < arr[i - dk]){
                int x = arr[i];
                arr[i] = arr[i - dk];
                arr[i - dk] = x;
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{21,25,49,26,16,8,8,19,50,18,101,30};
//        arr = shellSort(arr);
//        for (int a: arr){
//            System.out.print(a + " ");
//        }
//        System.out.println();
    int[] array = new int[1000000];
    for (int i = 0; i < 1000000; i++) {
        array[i] = (int) (Math.random() * 8000000);
    }
    long begin = System.currentTimeMillis();
    shellSort(array);
    System.out.println("总耗时="+(System.currentTimeMillis()- begin));
    }
}
