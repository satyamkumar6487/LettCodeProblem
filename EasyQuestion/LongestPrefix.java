import java.util.Arrays;

public class LongestPrefix {

    public static void main(String[] args) {

        String strs[] = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String strs[]) {
        // Sort the array so first and last strings will have min & max difference
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        int index = 0;

        // Compare characters of first and last string
        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        // Return substring of common prefix
        return index == 0 ? "" : str1.substring(0, index);
    }
}
