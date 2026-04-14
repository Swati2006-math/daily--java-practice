public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        str = str.toLowerCase();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                char ch = (char) (i + 'a');
                System.out.println(ch + " appears " + freq[i] + " times");
            }
        }
    }
}
