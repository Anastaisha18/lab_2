package lab2;

import java.util.HashMap;  // HashMap хранит пары "Город-стоимость"
import java.util.Map; // ключ - значение

public class City {
    private String cityname; // название города
    private Map<City, Integer> routes;  // ключ - город, значение - стоимость

    // конструктор города
    public City(String name) {
        this.cityname = name;
        this.routes = new HashMap<>();
    }

    // односторонний маршрут
    public void add(City city, int cost) {
        routes.put(city, cost); //put добавление пары
    }

    // двусторонний маршрут
    public void link(City city, int cost) {
        this.add(city, cost);
        city.add(this, cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nГород: ").append(cityname).append("\n");
        sb.append("Маршруты:\n");

        if (routes.isEmpty()) {
            sb.append("  (нет маршрутов)\n");
        } else {
            // Проходим по всем маршрутам в карте
            for (Map.Entry<City, Integer> entry : routes.entrySet()) {
                // entry.getKey() - город назначения
                // entry.getValue() - стоимость поездки
                sb.append("  -> ").append(entry.getKey().cityname)
                        .append(" (стоимость: ").append(entry.getValue()).append(")\n");
            }
        }

        return sb.toString();
    }
}