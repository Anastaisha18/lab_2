// Name.java - класс для имени
public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Name(String firstName, String lastName) {
        this(lastName, firstName, null);
    }

    public Name(String firstName) {
        this(null, firstName, null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName).append(" ");
        }

        if (firstName != null && !firstName.isEmpty()) {
            sb.append(firstName).append(" ");
        }

        if (middleName != null && !middleName.isEmpty()) {
            sb.append(middleName);
        }

        return sb.toString().trim();
    }
}