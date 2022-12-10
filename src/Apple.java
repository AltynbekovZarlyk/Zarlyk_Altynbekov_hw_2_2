public class Apple extends Telephone{
    private double turnoverPerYear;
    private int sales;

    public Apple(String name, String founder, int yearOfIssue, double turnoverPerYear, int sales) {
        super(name, founder, yearOfIssue);
        this.turnoverPerYear = turnoverPerYear;
        this.sales = sales;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear: " + getYearOfIssue() +
                "\nTurnover Per Year: " + turnoverPerYear + "Million $" +
                "\nUnit sales per year: " + sales +
                "\n--------------------");
    }
}
