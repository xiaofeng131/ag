package _8;
import java.util.Arrays;

public class getNearLess {
    public int[][] rightWay(int[] arr){
        int[][] res = new int[arr.length][2];
        for (int i = 0; i<arr.length;i++){
            int leftLessIndex = -1;
            int rightLessIndex = -1;
            int cur = i -1;
            while(cur >= 0){
                if(arr[cur]<arr[i]){
                    leftLessIndex = cur;
                    break;
                }
                cur--;
            }
            cur = i+1;
            while(cur<arr.length){
                if(arr[cur]<arr[i]){
                    rightLessIndex=cur;
                    break;
                }
                cur++;
            }
            res[i][0] = leftLessIndex;
            res[i][1] = rightLessIndex;
        }
        return res;
    }

    public static void main(String[] args) {
        getNearLess example = new getNearLess ();
        int[][] result;
        result = example.rightWay(new int[]{3,4,1,5,6,2,7});
        System.out.println(Arrays.deepToString(result));
//        for (int i=0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
    }
}
