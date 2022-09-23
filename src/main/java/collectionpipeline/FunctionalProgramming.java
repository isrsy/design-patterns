package collectionpipeline;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: rensiyu
 * @createTime: 2022/09/20
 * @description: 函数式编程
 */
public class FunctionalProgramming {
    private FunctionalProgramming() {
    }

    public static List<String> getModelsAfter2000(List<Car> cars) {
        return cars.stream()
                   .filter(car -> car.getYear() > 2000)
                   .sorted(Comparator.comparing(Car::getYear))
                   .map(Car::getModel)
                   .collect(Collectors.toList());
    }

    public static Map<Category, List<Car>> getGroupingOfCarsByCategory(List<Car> cars) {
        return cars.stream()
                   .collect(Collectors.groupingBy(Car::getCategory));
    }

    public static List<Car> getSedanCarsOwnedSortedByDate(List<Person> persons) {
        return persons.stream()
                      .map(Person::getCars)
                      .flatMap(List::stream)
                      .filter(car -> Category.SEDAN.equals(car.getCategory()))
                      .sorted(Comparator.comparing(Car::getYear))
                      .collect(Collectors.toList());
    }

}
