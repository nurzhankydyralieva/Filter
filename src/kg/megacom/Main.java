package kg.megacom;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota",
                5000,
                Colors.GRAY,
                Types.SEDAN,
                List.of("Rico", "Kowalsky")));
//        cars.add(new Car("Honda", 4500, Colors.SILVER, Types.HATCHBACK));
//        cars.add(new Car("Subaru", 7000, Colors.GRAY, Types.SUV));
//        cars.add(new Car("Toyota", 9000, Colors.GRAY, Types.JEEP));
//        cars.add(new Car("Toyota", 5000, Colors.BLACK, Types.SEDAN));

        Gift cheap = new Gift("cheap", 20);
        Gift middle = new Gift("middle", 50);
        Gift expensive = new Gift("expensive", 100);
        List<Gift> gifts = cars.stream()
                .map(car -> {
                    if (car.getPrice() <= 5000) {
                        return cheap;
                    } else if (car.getPrice() <= 7000) {
                        return middle;
                    } else {
                        return expensive;
                    }
                }).collect(Collectors.toList());
        System.out.println(gifts);

    }
}
