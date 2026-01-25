package lab2;

public class Name {
    private String lastName;
    private String firstName;
    private String patronymic;

    // Конструктор 1: только имя
    public Name(String firstName) {
        this.firstName = firstName;
    }

    // Конструктор 2: имя и фамилия
    public Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Конструктор 3: все параметры
    public Name(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    // Геттеры
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getPatronymic() { return patronymic; }

    // Сеттеры
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }
    public void setMiddleName(String middleName) { this.patronymic = middleName; }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            result.append(lastName);
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(firstName);
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(patronymic);
        }

        return result.toString();
    }
}