package lab2;


public class People {
    private Name name;
    private int height;
    private People father;

    // Конструктор 1: без отца
    public People(Name name, int height) {
        this.name = name;
        this.height = height;
        this.father = null;
    }

    // Конструктор 2: с отцом
    public People(Name name, int height, People father) {
        this.name = name;
        this.height = height;
        this.father = father;
        inheritFromFather();
    }

    // Метод наследования от отца (только "ович")
    private void inheritFromFather() {
        if (father != null) {
            Name fatherName = father.getName();

            // Наследуем фамилию
            if (name.getLastName() == null || name.getLastName().isEmpty()) {
                if (fatherName.getLastName() != null && !fatherName.getLastName().isEmpty()) {
                    name.setLastName(fatherName.getLastName());
                }
            }

            // Создаем отчество (только "ович")
            if (name.getPatronymic() == null || name.getPatronymic().isEmpty()) {
                if (fatherName.getFirstName() != null && !fatherName.getFirstName().isEmpty()) {
                    String patronymic = fatherName.getFirstName() + "ович";
                    name.setPatronymic(patronymic);
                }
            }
        }
    }

    // Геттеры
    public Name getName() { return name; }
    public int getHeight() { return height; }
    public People getFather() { return father; }

    // Сеттеры
    public void setName(Name name) {
        this.name = name;
        if (father != null) inheritFromFather();
    }
    public void setHeight(int height) { this.height = height; }
    public void setFather(People father) {
        this.father = father;
        inheritFromFather();
    }

    @Override
    public String toString() {
        return name.toString() + ", рост " + height + " см";
    }
}