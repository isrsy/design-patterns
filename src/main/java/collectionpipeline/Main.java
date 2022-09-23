package collectionpipeline;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: rensiyu
 * @createTime: 2022/09/20
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        List<Car> cars = CarFactory.createCars();
        List<String> modelsAfter2000 = FunctionalProgramming.getModelsAfter2000(cars);
        log.info(modelsAfter2000.toString());

        Map<Category, List<Car>> groupingOfCarsByCategory = FunctionalProgramming.getGroupingOfCarsByCategory(cars);
        log.info(groupingOfCarsByCategory.toString());
        Person person = new Person(cars);
        List<Car> sedanCarsOwnedSortedByDate = FunctionalProgramming.getSedanCarsOwnedSortedByDate(Arrays.asList(person));
        log.info(sedanCarsOwnedSortedByDate.toString());
    }
}
