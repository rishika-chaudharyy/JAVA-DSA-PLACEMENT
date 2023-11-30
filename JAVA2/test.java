public class test {

    public static String[] KEYS = {
        "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return;
        }
        generateCombinations("", digits, 0);
    }

    public static void generateCombinations(String current, String digits, int index) {
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }
        String letters = KEYS[digits.charAt(index) - '2'];
        for (char c : letters.toCharArray()) {
            generateCombinations(current + c, digits, index + 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23"; // Change the input here for different digit combinations
        System.out.println("Possible letter combinations for " + digits + ":");
        letterCombinations(digits);
    }
}
