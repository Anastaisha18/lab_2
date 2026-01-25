package lab2;


public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(name + ": мяу!");
    }

    public void meow(int times) {
        System.out.print(name + ": ");
        for (int i = 0; i < times; i++) {
            System.out.print("мяу");
            if (i < times - 1) {
                System.out.print("-");
            }
        }
        System.out.println("!");
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}