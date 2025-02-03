package Strings;

import java.util.HashMap;

public class String_manipulation {
    public static void main(String[] args) {
        //we will use two hashmaps 
        //charfreq: to store the frequency of each character in s2
        //windowcount:  to store the frequency of characters of the current window of s1
        //use two pointers start and end to demote current window size.
        //expand the window by moving the end [pointer] until akll chartacters in s2 covered
        //onve a valid window is found , shrink it from the left by moving the start to minimize the window size

        String s1 = "Swastik";
        String s2 = "Swak";
        System.out.println(minWindow(s1, s2));

    }

    public static String minWindow(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() < s2.length()) {
            return "";
        }

        // Frequency map for characters in s2
        HashMap<Character, Integer> charfreq = new HashMap<>();
        for (char c : s2.toCharArray()) {
            charfreq.put(c, charfreq.getOrDefault(c, 0) + 1);
        }

        // Frequency map for the current window in s1
        HashMap<Character, Integer> windowcount = new HashMap<>();
        int start = 0;
        int matched = 0;
        int minlength = Integer.MAX_VALUE;
        int minstart = 0;

        // Sliding window approach
        for (int end = 0; end < s1.length(); end++) {
            char endchar = s1.charAt(end);
            windowcount.put(endchar, windowcount.getOrDefault(endchar, 0) + 1);

            // Check if the current character matches the frequency in s2
            if (charfreq.containsKey(endchar) && windowcount.get(endchar).equals(charfreq.get(endchar))) {
                matched++;
            }

            // Once all characters from s2 are matched, shrink the window from the left
            while (matched == charfreq.size()) {
                if (end - start + 1 < minlength) {
                    minlength = end - start + 1;
                    minstart = start;
                }

                // Remove the character at the start of the window
                char startchar = s1.charAt(start);
                windowcount.put(startchar, windowcount.get(startchar) - 1);
                if (charfreq.containsKey(startchar) && windowcount.get(startchar) < charfreq.get(startchar)) {
                    matched--;
                }
                start++;
            }
        }

        // If no valid window found, return empty string
        if (minlength == Integer.MAX_VALUE) {
            return "";
        }

        // Return the minimum window substring
        return s1.substring(minstart, minstart + minlength);
    }

}
