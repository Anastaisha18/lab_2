// PersonWithFather.java - класс человека с отцом
public class PersonFather {
    private Name name;
    private int height;
    private PersonFather father;

    public PersonFather(Name name, int height) {
        this.name = name;
        this.height = height;
        this.father = null;
    }

    public PersonFather(Name name, int height, PersonFather father) {
        this.name = name;
        this.height = height;
        this.father = father;
        inheritFromFather();
    }

    private void inheritFromFather() {
        if (father != null) {
            if ((name.toString().contains(" ") == false) &&
                    father.name.toString().contains(" ")) {
                String fathersName = father.name.toString();
                String fathersLastName = fathersName.split(" ")[0];
                String currentFirstName = name.toString();
                name = new Name(fathersLastName, currentFirstName, null);
            }
        }
    }

    @Override
    public String toString() {
        return name + ", рост: " + height + (father != null ? " (сын)" : "");
    }

    public void setFather(PersonFather father) {
        this.father = father;
        inheritFromFather();
    }
}