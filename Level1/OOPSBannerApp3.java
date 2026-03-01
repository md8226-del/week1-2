/**
 * OOPSBannerApp UC3 OOPS Banner Display Application
 *
 * This class refactors UC2 to use String.join() for better memory efficiency
 * when creating the large "OOPS" banner.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp3 {
    public static void main(String[] args) {
        // Using String.join() to construct lines without the + operator
        System.out.println(String.join("", "  *** ", " *** ", " **** ", " **** "));
        System.out.println(String.join("", " * *", " * *", " * *", " * "));
        System.out.println(String.join("", " * *", " * *", " * *", " * "));
        System.out.println(String.join("", " * *", " * *", " **** ", " **** "));
        System.out.println(String.join("", " * *", " * *", " * ", "    *"));
        System.out.println(String.join("", " * *", " * *", " * ", "    *"));
        System.out.println(String.join("", "  *** ", " *** ", " * ", " **** "));
    }
}