public class Greeting {
    public static void main(String[] args) {
        // Check if an argument was actually provided to avoid an error
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello User");
        }
    }
}