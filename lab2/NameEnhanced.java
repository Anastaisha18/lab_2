package lab2;


public class NameEnhanced {
    private String lastName;
    private String firstName;
    private String patronymic;

    // Конструктор 1: только личное имя
    public NameEnhanced(String firstName) {
        this.firstName = firstName;
        this.lastName = null;
        this.patronymic = null;
    }

    // Конструктор 2: имя и фамилия
    public NameEnhanced(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = null;
    }

    // Конструктор 3: все три параметра
    public NameEnhanced(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
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

        // Формат: Имя Фамилия Отчество
        if (firstName != null && !firstName.isEmpty()) {
            result.append(firstName);
        }

        if (lastName != null && !lastName.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(lastName);
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(patronymic);
        }

        return result.toString();
    }
}