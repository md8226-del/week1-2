/**
 * OOPSBannerApp UC7 OOPS Banner Display Application
 * * This class refactors UC6 by encapsulating character patterns into 
 * a dedicated CharacterPattern class for better organization and scalability.
 *
 * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp7 {

    // Inner class to encapsulate character data and patterns
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getLine(int line) {
            return pattern[line];
        }
    }

    public static void main(String[] args) {
        // Define patterns for O, P, and S
        CharacterPattern charO = new CharacterPattern('O', new String[]{"  *** ", " * *", " * *", " * *", " * *", " * *", "  *** "});
        CharacterPattern charP = new CharacterPattern('P', new String[]{" **** ", " * *", " * *", " **** ", " * ", " * ", " * "});
        CharacterPattern charS = new CharacterPattern('S', new String[]{"  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "});

        // Array to hold the final banner lines
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            // Retrieve lines from the CharacterPattern objects
            bannerLines[i] = String.join("", 
                charO.getLine(i), 
                charO.getLine(i), 
                charP.getLine(i), 
                charS.getLine(i)
            );
        }

        // Print the final banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}