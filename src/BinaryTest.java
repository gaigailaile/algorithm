public class BinaryTest {

    public static int binary(int[] array,int value){
        int low = 0;
        int high = array.length-1;
        while (high >= low) {
            int middle = (high + low)/2;
            if(array[middle] == value){
                return middle;
            }else if(array[middle] > value){
                high = middle - 1;
            }else if(array[middle] < value){
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,5,9,13,17,18,19,20};
        int index = BinaryTest.binary(array,17);
        System.out.println(index);
    }
}
