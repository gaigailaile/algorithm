import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static int[] sort(int[] data){
        bucketSort(data);
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
        //获取桶的个数、创建桶
        int bucketCount = (max - min) / data.length + 1;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++){
            buckets.add(new ArrayList<>());
        }

        //把数据分配到桶里
        for (int i = 0; i < data.length; i++){
            int num = (data[i] - min) / data.length;
            buckets.get(num).add(data[i]);
        }

        //对每个桶排序整合。
        int index = 0;
        for (ArrayList<Integer> bucket : buckets){
            if(bucket == null || bucket.size() == 0)
                continue;
            Collections.sort(bucket);
            for (int num : bucket){
                data[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = sort(new int[]{3,6,5,9,7,8});
        for (int a:data){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
