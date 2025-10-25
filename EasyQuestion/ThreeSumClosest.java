import java.util.Arrays;

public class ThreeSumClosest {


    public static void main(String [] args ){
        int [] nums = {-1, 2 , 1 , -4};
//        int [] nums = {0,0,0,0};

        int target = 1 ;

      int  result =  threesumcloses( nums , target);
      System.out.println(result);

    }


    static  int  threesumcloses(int [] nums , int target) {

        int res = 0;

        int gap = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int ngap = Math.abs(target - sum);

                if (sum < target) {


                    if (ngap < gap) {

                        gap = ngap;

                        res = sum;
                    }
                    left++;
                } else if (sum > target) {
                    if (ngap < gap) {
                        gap = ngap;
                        res = sum;

                    }
                    right--;

                } else return sum;
            }



        }

        return res;
    }}
