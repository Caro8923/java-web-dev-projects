public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Double yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, Double yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    private void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getYearsTeaching() {
        return yearsTeaching;
    }

    private void setYearsTeaching(Double yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
