// Main.java - главный класс для запуска программы
public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== ЛАБОРАТОРНАЯ РАБОТА №2 ===");
        System.out.println("=== Вариант: 3, 2-3, 3, 5-6, 2 ===\n");

        // ЗАДАНИЕ 1.3: Имена
        System.out.println("1.3 Имена:");
        Name cleopatra = new Name("Клеопатра");
        Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
        Name mayakovskiy = new Name("Маяковский", "Владимир");

        System.out.println("• " + cleopatra);
        System.out.println("• " + pushkin);
        System.out.println("• " + mayakovskiy);
        System.out.println();

        // ЗАДАНИЕ 2.2: Человек с именем
        System.out.println("2.2 Человек с именем:");
        Person person1 = new Person(cleopatra, 152);
        Person person2 = new Person(pushkin, 167);
        Person person3 = new Person(mayakovskiy, 189);

        System.out.println("• " + person1);
        System.out.println("• " + person2);
        System.out.println("• " + person3);
        System.out.println();

        // ЗАДАНИЕ 2.3: Человек с родителем
        System.out.println("2.3 Человек с родителем:");

        // Создаем имена
        Name ivanName = new Name("Чудов", "Иван");
        Name petrName = new Name("Чудов", "Петр");
        Name borisName = new Name("Борис");

        // Создаем людей
        PersonFather ivan = new PersonFather(ivanName, 175);
        PersonFather petr = new PersonFather(petrName, 180, ivan);
        PersonFather boris = new PersonFather(borisName, 185);

        // Устанавливаем отцовство
        boris.setFather(petr);

        System.out.println("• " + ivan);
        System.out.println("• " + petr);
        System.out.println("• " + boris);
        System.out.println();

        // ЗАДАНИЕ 3.3: Города
        System.out.println("3.3 Города:");

        // Создаем города
        City moscow = new City("Москва");
        City spb = new City("Санкт-Петербург");
        City kazan = new City("Казань");
        City sochi = new City("Сочи");

        // Создаем маршруты
        moscow.addRoute(spb, 500);
        moscow.addRoute(kazan, 600);
        spb.addRoute(moscow, 500);
        spb.addRoute(sochi, 800);
        kazan.addRoute(moscow, 600);
        kazan.addRoute(sochi, 700);
        sochi.addRoute(spb, 800);
        sochi.addRoute(kazan, 700);

        System.out.println(moscow);
        System.out.println(spb);
        System.out.println(kazan);
        System.out.println(sochi);

        // ЗАДАНИЕ 5.6: Студент-отличник
        System.out.println("5.6 Студент-отличник:");
        int[] vasyaGrades = {3, 4, 5, 4};
        int[] petyaGrades = {5, 5, 5, 5};

        Student vasya = new Student("Вася", vasyaGrades);
        Student petya = new Student("Петя", petyaGrades);

        System.out.println("• " + vasya);
        System.out.println("• " + petya);
        System.out.println();

        // ЗАДАНИЕ 5.2: Кот мяукает
        System.out.println("5.2 Кот мяукает:");
        Cat barsik = new Cat("Барсик");
        System.out.println(barsik);
        barsik.meow();      // Мяукает один раз
        barsik.meow(3);     // Мяукает три раза
    }
}