/**
 * OOPSBannerApp UC4 OOPS Banner Display Application
 *
 * This class refactors UC3 to use a String array and a loop.
 * This improves modularity and reduces code repetition.
 *
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp4 {
    public static void main(String[] args) {
        // Initialize a String array to store each line of the 7-line grid
        String[] bannerLines = new String[7];

        // Populate the array using String.join for memory efficiency
        bannerLines[0] = String.join("", "  *** ", " *** ", " **** ", " **** ");
        bannerLines[1] = String.join("", " * *", " * *", " * *", " * ");
        bannerLines[2] = String.join("", " * *", " * *", " * *", " * ");
        bannerLines[3] = String.join("", " * *", " * *", " **** ", " **** ");
        bannerLines[4] = String.join("", " * *", " * *", " * ", "    *");
        bannerLines[5] = String.join("", " * *", " * *", " * ", "    *");
        bannerLines[6] = String.join("", "  *** ", " *** ", " * ", " **** ");

        // Use an enhanced for-loop to print each line in the array
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}