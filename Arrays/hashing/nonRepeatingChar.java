// import java.util.HashMap;
// import java.util.Map;

// public class nonRepeatingChar {

//     static int FindIndex(char[] str, int n) {
//         Map<Character, Integer> charCount = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             char currentChar = str[i];
//             charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
//         }

//         for (int i = 0; i < n; i++) {
//             if (charCount.get(str[i]) == 1) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         String s = "ztyulkjzlkty";
//         int ans = FindIndex(s.toCharArray(), s.length());
//         System.out.println(ans);
//     }
// }


import java.util.HashMap;
import java.util.Map;

public class nonRepeatingChar {

    static int FindIndex(String str) {
        // Create a map to store the count of each character in the string
        Map<Character, Integer> charCount = new HashMap<>();

        // Iterate through the string and update the count in the map
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
        }

        // Iterate through the string again to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String s = "defhegmdgtsehtf";
        int ans = FindIndex(s);
        System.out.println(ans);
    }
}
