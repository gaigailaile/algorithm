public class BubbleTest {

    public static void bubbleSort(int arr[]) {
        for(int i =0 ; i<arr.length-1 ; i++) {
            for(int j=0 ; j<arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,5,7,1,6,10,8,2,9,4};
        BubbleTest.bubbleSort(array);
        for (int a : array) {
            System.out.println(a);
        }
    }
}
