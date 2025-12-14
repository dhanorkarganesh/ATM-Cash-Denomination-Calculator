import java.util.Scanner;

public class ATMCashDenomination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ATM denominations
        int[] denom = {2000, 500, 200, 100};

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        System.out.println("\nATM Cash Denomination Breakdown:");

        for (int i = 0; i < denom.length; i++) {
            if (amount >= denom[i]) {
                int count = amount / denom[i];
                amount = amount % denom[i];
                System.out.println("₹" + denom[i] + " x " + count);
            }
        }

        sc.close();
    }
}
