package easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        char[] arr1 = strs[0].toCharArray();
        char[] arr2 = strs[1].toCharArray();
        char[] arr3 = strs[2].toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i] && arr2[i] == arr3[i]) {
                result.append(arr1[i]);
            } else break;
        }
        return result.toString();
    }
}
