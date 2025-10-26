import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourthSum {

    public static void main (String [] args){

//int [] arr = {1, 0 ,-1, 0 , -2, 2 };
        int [] arr = {2, 2 ,2, 2 , 2, 2 };
//int target = 0;
        int target = 8;

         List<List<Integer>> res = fourthsum(arr , target);

        System.out.println(res);

    }
public static      List<List<Integer>> fourthsum(int [] arr, int target){

    HashSet<List<Integer>>  result = new HashSet<>();


    Arrays.sort(arr);

    for (int i = 0 ; i<arr.length-3 ; i++){
        for ( int j = i + 1; j <arr.length-2; j++) {

            int li = j + 1;
            int ri = arr.length - 1;

            while (li < ri) {

                int sum = arr[i] + arr[j] + arr[li] + arr[ri];

                if (sum < target) {
                    li++;

                } else if (sum > target) {
                    ri--;

                } else {

                    result.add(Arrays.asList(arr[i], arr[j], arr[li], arr[ri]));
                    li++;
                    ri--;
                }
            }
        }}

    return new ArrayList<>(result);
    }







}
