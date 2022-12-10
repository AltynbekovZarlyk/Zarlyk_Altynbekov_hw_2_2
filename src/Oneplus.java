public class Oneplus extends Telephone{
    private int wasReleased;
    private String companyAddress;

    public Oneplus(String name, String founder, int yearOfIssue, int wasReleased, String companyAddress) {
        super(name, founder, yearOfIssue);
        this.wasReleased = wasReleased;
        this.companyAddress = companyAddress;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear: " + getYearOfIssue() +
                "\nWas released: " + wasReleased + " things" +
                "\nCompany address: " + companyAddress +
                "\n--------------------");
    }
}
