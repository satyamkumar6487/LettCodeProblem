import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // Step 1: find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: if no pivot found, sort array
        if (pivot == -1) {
            Arrays.sort(nums);
            return;
        }

        // Step 3: find rightmost element greater than pivot
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // Step 4: reverse the part after pivot
        int i = pivot + 1, j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
