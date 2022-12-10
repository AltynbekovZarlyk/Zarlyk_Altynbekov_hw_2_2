public abstract class Telephone implements Printable {
    private String name;
    private String founder;
    private int yearOfIssue;

    public Telephone(String name, String founder, int yearOfIssue) {
        this.name = name;
        this.founder = founder;
        this.yearOfIssue = yearOfIssue;
    }

    public String getName() {
        return name;
    }

    public String getFounder() {
        return founder;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
