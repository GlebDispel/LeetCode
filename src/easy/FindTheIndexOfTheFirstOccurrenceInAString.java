package easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {

        int result = -1;
       char[] a = haystack.toCharArray();
      char[] b =  needle.toCharArray();
      if (needle.length()>haystack.length())
          return result;

        for (int i = 0; i <= haystack.length()-needle.length(); i++) {

            for (int j = 0; j < needle.length() ; j++) {
                if (a[i+j] != b[j]) {
                    result = -1;
                    break;
                } else
                    result = 0;

            }
            }
        return result;
        }
    }


