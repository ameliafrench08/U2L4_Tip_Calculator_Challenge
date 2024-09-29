import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("________________________________________________________");
        System.out.println("In the following program: DO NOT USE SYMBOLS");
        System.out.println("________________________________________________________");

        System.out.println();

        // User inputs data:

        System.out.print("Enter the total bill: $");
        String totalBillStr = s.nextLine();
        double totalBill = Double.parseDouble(totalBillStr);

        System.out.println();
        System.out.println();

        System.out.print("Enter the tip percentage: %");
        String tipPercentStr = s.nextLine();
        int tipPercentage = Integer.parseInt(tipPercentStr);

        System.out.println();
        System.out.println();

        System.out.print("Enter the number of people: ");
        String totalPplStr = s.nextLine();
        int numPeople = Integer.parseInt(totalPplStr);

        System.out.println();

        System.out.println("________________________________________________________");

        // Calculations using data:

        double totalTip = (double) tipPercentage/100;
        totalTip *= totalBill;
        totalTip = Math.round(totalTip * 100.0) / 100.0;

        double billAndTip = totalTip + totalBill;

        double tipPerPerson = totalTip/numPeople;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

        double totalPerPerson = billAndTip / numPeople;
        totalPerPerson = Math.round(totalPerPerson * 100.0)/100.0;

        // Rounding billAndTip later because it messes up the calculations if earlier.

        billAndTip = Math.round(billAndTip * 100.0) / 100.0;

        // Output:

        System.out.println();
        System.out.println();
        System.out.print("Total tip: $" );
        System.out.printf("%.2f%n", totalTip);
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.print("Total bill + tip: $");
        System.out.printf("%.2f%n", billAndTip);
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.print("Tip per person: $");
        System.out.printf("%.2f%n", tipPerPerson);
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.print("Total per person: $");
        System.out.printf("%.2f%n", totalPerPerson);
        System.out.println();

        System.out.println("________________________________________________________");





    }
}