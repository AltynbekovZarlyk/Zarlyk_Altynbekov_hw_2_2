public class Xiaomi extends Telephone{
    private int numberOfWorkers;
    private String performanceOtherPhone;

    public Xiaomi(String name, String founder, int yearOfIssue, int numberOfWorkers, String performanceOtherPhone) {
        super(name, founder, yearOfIssue);
        this.numberOfWorkers = numberOfWorkers;
        this.performanceOtherPhone = performanceOtherPhone;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear: " + getYearOfIssue() +
                "\nNumber of workers: " + numberOfWorkers +
                "\nPerformance other than phone: " + performanceOtherPhone +
                "\n--------------------");
    }
}
