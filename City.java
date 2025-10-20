// City.java - класс города
import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> routes;

    public City(String name) {
        this.name = name;
        this.routes = new HashMap<>();
    }

    public void addRoute(City city, int cost) {
        routes.put(city, cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Город: ").append(name).append("\n");
        sb.append("Маршруты:\n");

        for (Map.Entry<City, Integer> entry : routes.entrySet()) {
            sb.append("  -> ").append(entry.getKey().name)
                    .append(" (стоимость: ").append(entry.getValue()).append(")\n");
        }

        return sb.toString();
    }
}