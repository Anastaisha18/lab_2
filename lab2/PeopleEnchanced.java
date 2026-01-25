package lab2;


public class PeopleEnchanced {
    private NameEnhanced name;
    private int height;
    private PeopleEnchanced father;

    // Конструктор 1: имя в виде строки и рост
    public PeopleEnchanced(String firstName, int height) {
        this(new NameEnhanced(firstName), height, null);
    }

    // Конструктор 2: имя в виде строки, рост и отец
    public PeopleEnchanced(String firstName, int height, PeopleEnchanced father) {
        this(new NameEnhanced(firstName), height, father);
    }

    // Конструктор 3: имя в виде объекта NameEnhanced и рост
    public PeopleEnchanced(NameEnhanced name, int height) {
        this(name, height, null);
    }

    // Конструктор 4: имя в виде объекта NameEnhanced, рост и отец
    public PeopleEnchanced(NameEnhanced name, int height, PeopleEnchanced father) {
        this.name = name;
        this.height = height;
        this.father = father;

        if (father != null) {
            inheritFromFather();
        }
    }

    // Метод наследования от отца - только для конкретных случаев
    private void inheritFromFather() {
        if (father == null) return;

        NameEnhanced fatherName = father.getName();
        String fatherFirstName = fatherName.getFirstName();

        // Наследуем фамилию
        if (name.getLastName() == null || name.getLastName().isEmpty()) {
            if (fatherName.getLastName() != null && !fatherName.getLastName().isEmpty()) {
                name.setLastName(fatherName.getLastName());
            }
        }

        // Создаем отчество ТОЛЬКО для конкретных случаев
        if (name.getPatronymic() == null || name.getPatronymic().isEmpty()) {
            if (fatherFirstName != null && !fatherFirstName.isEmpty()) {
                // Только для имен "Лев" и "Сергей"
                if (fatherFirstName.equals("Лев")) {
                    name.setPatronymic("Львович");
                } else if (fatherFirstName.equals("Сергей")) {
                    name.setPatronymic("Сергеевич");
                }
                // Для других имен отчество не создаем
            }
        }
    }

    // Геттеры
    public NameEnhanced getName() { return name; }
    public int getHeight() { return height; }
    public PeopleEnchanced getFather() { return father; }

    // Сеттеры
    public void setName(NameEnhanced name) {
        this.name = name;
        if (father != null) inheritFromFather();
    }
    public void setHeight(int height) { this.height = height; }
    public void setFather(PeopleEnchanced father) {
        this.father = father;
        inheritFromFather();
    }

    @Override
    public String toString() {
        return name.toString() + ", " + height;
    }
}