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

        TipCalculator tipCalcOne = new TipCalculator(totalBill, tipPercentage, numPeople);
        tipCalcOne.output();




    }
}