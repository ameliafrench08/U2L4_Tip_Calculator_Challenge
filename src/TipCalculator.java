public class TipCalculator {
    private double totalBill;
    private int tipPercent;
    private int numPeople;

    public TipCalculator(double totalBill, int tipPercent, int numPeople)
    {
        this.totalBill = totalBill;
        this.tipPercent = tipPercent;
        this.numPeople = numPeople;
    }
    public double totalTipCalc()
    {
        double totalTip = (double) tipPercent/100;
        totalTip *= totalBill;
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        return totalTip;
    }
    public double billTipCalc()
    {
        double billAndTip = totalTipCalc() + totalBill;
        return billAndTip;
    }
    public double tipPersonCalc()
    {
        double tipPerPerson = totalTipCalc()/numPeople;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
        return tipPerPerson;
    }
    public double totalPersonCalc()
    {
        double totalPerPerson = billTipCalc() / numPeople;
        totalPerPerson = Math.round(totalPerPerson * 100.0)/100.0;
        return totalPerPerson;
    }

    public void output()
    {
        double billTipRound = Math.round(billTipCalc() * 100.0) / 100.0;

        // Output:

        System.out.println();
        System.out.println();
        System.out.print("Total tip: $" );
        System.out.printf("%.2f%n", totalTipCalc());
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.print("Total bill + tip: $");
        System.out.printf("%.2f%n", billTipRound);
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.print("Tip per person: $");
        System.out.printf("%.2f%n", tipPersonCalc());
        System.out.println();

        System.out.println("________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.print("Total per person: $");
        System.out.printf("%.2f%n", totalPersonCalc());
        System.out.println();

        System.out.println("________________________________________________________");
    }
}
