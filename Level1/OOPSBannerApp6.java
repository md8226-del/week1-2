/**
 * OOPSBannerApp UC6 OOPS Banner Display Application
 *
 * This class refactors UC5 by using static helper methods to generate
 * character patterns. This promotes code reuse and modularity.
 *
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp6 {

    public static void main(String[] args) {
        // Use static methods to build each line of the banner in the array
        String[] bannerLines = {
            String.join("", getO(0), getO(0), getP(0), getS(0)),
            String.join("", getO(1), getO(1), getP(1), getS(1)),
            String.join("", getO(2), getO(2), getP(2), getS(2)),
            String.join("", getO(3), getO(3), getP(3), getS(3)),
            String.join("", getO(4), getO(4), getP(4), getS(4)),
            String.join("", getO(5), getO(5), getP(5), getS(5)),
            String.join("", getO(6), getO(6), getP(6), getS(6))
        };

        // Enhanced for-loop to display the final patterns
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Static helper method for the letter 'O'
    public static String getO(int line) {
        String[] pattern = {"  *** ", " * *", " * *", " * *", " * *", " * *", "  *** "};
        return pattern[line];
    }

    // Static helper method for the letter 'P'
    public static String getP(int line) {
        String[] pattern = {" **** ", " * *", " * *", " **** ", " * ", " * ", " * "};
        return pattern[line];
    }

    // Static helper method for the letter 'S'
    public static String getS(int line) {
        String[] pattern = {" **** ", " * ", " * ", " **** ", "    * ", "    * ", " **** "};
        return pattern[line];
    }
}