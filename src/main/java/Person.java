
public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private String login;
    private String passwordHash;
    private String email;

    public Person(long id, String firstName, String lastName, String login, String passwordHash, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.passwordHash = passwordHash;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getEmail() {
        return email;
    }


}
