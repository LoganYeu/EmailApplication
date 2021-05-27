/**
 * The email class defines what attributes a email has and gives methods to set and retrieve them.
 *
 * @version (Version 1)
 * @author (Logan Yeubanks)
 */

public class Email {
    //things a email has
    private String firstName;
    private String lastName;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private String password;
    private String emailAddress;

    public Email(String firstName, String lastName, String department, int mailboxCapacity, String alternateEmail, String password, String emailAddress) {
        //initializing the variables.
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.mailboxCapacity = mailboxCapacity;
        this.alternateEmail = alternateEmail;
        this.password = password;
        this.emailAddress = emailAddress;
    }


    //method to validate password to email

    //method to show info of a email


    //setters and getters in order as listed above.
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void showInfo() {

    }


}
