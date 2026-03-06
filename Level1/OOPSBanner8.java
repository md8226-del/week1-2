import java.util.HashMap;
import java.util.Map;

public class OOPSBanner8 {
    // Centralized storage for character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Initialize patterns for 'O', 'P', 'S'
        patternMap.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });
        patternMap.put('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        });
        patternMap.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word.toUpperCase());
    }

    /**
     * Renders the word by retrieving patterns from the Map
     * and assembling them line-by-line.
     */
    public static void renderBanner(String input) {
        int patternHeight = 5; // Fixed height for all patterns

        for (int i = 0; i < patternHeight; i++) {
            StringBuilder lineOutput = new StringBuilder();
            
            for (char c : input.toCharArray()) {
                if (patternMap.containsKey(c)) {
                    // Append the i-th line of the current character's pattern
                    lineOutput.append(patternMap.get(c)[i]).append("  ");
                }
            }
            System.out.println(lineOutput.toString());
        }
    }
}