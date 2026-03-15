public class HelloUser {
    public static void main(String[] args) {
        // Step 1: Define a variable with a default value
        String name = "World";

        // Step 2: If an argument exists, override the default
        if (args.length > 0) {
            name = args[0];
        }

        // Step 3: Display the greeting
        System.out.println("Hello " + name);
    }
}