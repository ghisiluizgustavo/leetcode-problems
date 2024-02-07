package problems;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args){
        System.out.println(
            ValidAnagram.isAnagram("anagram", "nagaram")
        );

        System.out.println(
            ValidAnagram.isAnagram("rat", "car")
        );
    }

    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
  }
}
