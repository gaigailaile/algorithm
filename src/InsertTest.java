public class InsertTest {

    public static void insert(int[] array){
        for (int i = 1; i < array.length; i++){
            int num = array[i];
            int index = i-1;
            while (index >= 0 && num < array[index]) {
                array[index+1] = array[index];
                index --;
            }
            array[index+1] = num;
        }
    }

    public static void insert2(int[] array){
        for (int i=1;i<array.length;i++) {
            for(int j=i;j>0 && array[j] < array[j-1];j--) {
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,5,7,1,6,10,8,2,9,4};
//        InsertTest.insert(array);
//        for (int a : array) {
//            System.out.println(a);
//        }
        InsertTest.insert2(array);
        for (int a : array) {
            System.out.println(a);
        }
    }
}
