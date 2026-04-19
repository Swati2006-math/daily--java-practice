import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "programming";
      HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating: " + ch);
                return;
            }
        }
      System.out.println("No non-repeating character");
    }
}
