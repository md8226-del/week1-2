import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        int currentYear = 2026;   
        int birthYear = currentYear - age;

        System.out.println("Your birth year is: " + birthYear);

        sc.close();
    }
}