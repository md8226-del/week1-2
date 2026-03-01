/**
 * OOPSBannerApp UC5 OOPS Banner Display Application
 *
 * This class refactors UC4 to use inline array initialization.
 * This makes the code more compact and readable while keeping the modularity.
 *
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp5 {
    public static void main(String[] args) {
        // UC5: Combining declaration and initialization in one statement
        String[] bannerLines = {
            String.join("", "  *** ", " *** ", " **** ", " **** "),
            String.join("", " * *", " * *", " * *", " * "),
            String.join("", " * *", " * *", " * *", " * "),
            String.join("", " * *", " * *", " **** ", " **** "),
            String.join("", " * *", " * *", " * ", "    *"),
            String.join("", " * *", " * *", " * ", "    *"),
            String.join("", "  *** ", " *** ", " * ", " **** ")
        };

        // Use an enhanced for-loop to iterate and print the character patterns
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}