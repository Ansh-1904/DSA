class largestOddNum {
    public static String largestOddNumber(String num) {
        int i = 0;
        int n = num.length();
        int j = n - 1;
        String result = "";

        if (num.equals("")) return num;

        while (j >= i) {  // Use '>= i' to ensure all digits are checked
            if (i == j && num.charAt(i) % 2 != 0) {
                return num.substring(i, j + 1);
            }

            // Get the last digit as an integer
            int ans = num.charAt(j) ;

            if (ans % 2 == 0) {
                j--;  // Move left if the current digit is even
            } else {
                result = num.substring(i, j + 1);  // Found an odd digit, update the result
                break;  // Since we've found the largest odd, we can break the loop
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "4207"; //35427 //52 //4206
        System.out.print(largestOddNumber(str));  // Output: "35427"
    }
}
