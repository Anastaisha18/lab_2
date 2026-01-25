package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.3 Имена
        System.out.println("1.3 Имена");
        Name cleopatra = new Name("Клеопатра");
        Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
        Name mayakovskiy = new Name("Маяковский", "Владимир");
        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(mayakovskiy);
        System.out.println();

        // 2.2 Человек с именем
        System.out.println("2.2 Человек с именем");
        People people1 = new People(cleopatra, 152);
        People people2 = new People(pushkin, 167);
        People people3 = new People(mayakovskiy, 189);
        System.out.println(people1);
        System.out.println(people2);
        System.out.println(people3);
        System.out.println();

        // 2.3 Человек с родителем
        System.out.println("2.3 Человек с родителем");
        Name ivanName = new Name("Чудов", "Иван");
        Name petrName = new Name("Чудов", "Петр");
        Name borisName = new Name("Борис");

        People ivan = new People(ivanName, 175);
        People petr = new People(petrName, 180, ivan);
        People boris = new People(borisName, 185);
        boris.setFather(petr); // Петр - отец Бориса

        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(boris);
        System.out.println();

        // 3.3 Города
        System.out.println("3.3 Города");
        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F");

        // Двусторонние связи
        cityA.link(cityB, 5);  // A <-> B стоимость 5
        cityB.link(cityC, 3);  // B <-> C стоимость 3
        cityC.link(cityD, 4);  // C <-> D стоимость 4
        cityA.link(cityD, 6);  // A <-> D стоимость 6
        cityF.link(cityE, 2);  // F <-> E стоимость 2
        cityF.link(cityB, 1);  // F <-> B стоимость 1

        // Односторонние связи
        cityD.add(cityE, 2);   // D -> E стоимость 2
        cityA.add(cityF, 1);   // A -> F стоимость 1

        System.out.print(cityA);
        System.out.print(cityB);
        System.out.print(cityC);
        System.out.print(cityD);
        System.out.print(cityE);
        System.out.print(cityF);
        System.out.println();

        // 4.5 Создаем Имена
        System.out.println("\n4.5 Создаём имена");

        NameEnhanced name1 = new NameEnhanced("Клеопатра");
        System.out.println("1. " + name1);

        NameEnhanced name2 = new NameEnhanced("Александр", "Пушкин", "Сергеевич");
        System.out.println(name2);

        NameEnhanced name3 = new NameEnhanced("Владимир", "Маяковский");
        System.out.println(name3);

        NameEnhanced name4 = new NameEnhanced("Христофор", "Бонифатьевич");
        System.out.println(name4);

        //4.6 Создаём человека
        System.out.println("\n4.6 Создаём человека");
        PeopleEnchanced lev = new PeopleEnchanced("Лев", 170);
        System.out.println(lev);

        NameEnhanced sergeiName = new NameEnhanced("Сергей", "Пушкин");
        PeopleEnchanced sergei = new PeopleEnchanced(sergeiName, 168, lev);
        System.out.println(sergei);

        PeopleEnchanced alexander = new PeopleEnchanced("Александр", 167, sergei);
        System.out.println(alexander);

        // 5.2 Кот мяукает
        System.out.println("\n5.2 Кот мяукает");
        System.out.print("Введите имя кота: ");
        String catName = scanner.nextLine().trim();
        if (catName.isEmpty()) catName = "Пушик";

        Cat cat = new Cat(catName);
        System.out.println(cat);
        cat.meow();
        cat.meow(3);
        cat.meow(5);

        scanner.close();
    }
}