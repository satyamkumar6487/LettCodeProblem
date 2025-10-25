import java.util.*;

public class ThreeSum {

    public static void main (String [] args){
        int [] arr = {-1,0, 1, 2, -1,-4};

        List<List<Integer>> result = ThreeSum( arr);
System.out.println(result);


    }

    public static List<List<Integer>> ThreeSum(int [] arr){



        if (arr == null && arr.length < 3) return new ArrayList<>();


        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(arr);


        for (int i = 0; i < arr.length-2; i++){
            int left = i + 1 ;
            int right = arr.length -1;

            while (left < right){

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0){

                     res.add(Arrays.asList(arr[i] , arr[left] , arr[right]));
                     left++;
                     right--;
                } else if (sum < 0)
                    left++;

                else
                    right --;

            }

        }

return  new ArrayList<>(res);









    }

}
