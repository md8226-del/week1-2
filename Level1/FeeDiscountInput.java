import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {
        double fee;
        double discountPercent;

        Scanner input = new Scanner(System.in);

        // Take user inputs
        fee = input.nextDouble();
        discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println(
                "The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee
        );

        input.close();
    }
}