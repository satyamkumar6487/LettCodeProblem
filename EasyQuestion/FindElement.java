import java.util.Arrays;

public class FindElement {
    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] res = searchelement(nums, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] searchelement(int[] nums, int target) {

        int arr[] = new int[2];
        arr[0] = arr[1] = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                arr[0] = i;

                while (i < nums.length - 1 && nums[i + 1] == target) {
                    i++;
                }

                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
