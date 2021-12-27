package edu.umb.cs680.hw011;

import java.util.*;
import java.util.stream.*;
import java.lang.*;

public class SortTest implements Comparator<car> {
    public int compare(car car1, car car2) {
        int compVal =
            car1.getPrice().value() - car2.getPrice().value();
        if (compVal != 0)
            return compVal;
        else
            return car1.getPrice().value() - car2.getPrice().value(); 
    }
}

StandardCollection myCollection = new StandardCollection();

collection.sort(new SortTest());
StandardCollection myCollection = new StandardCollection();

collection.sort(
    Comparator.comparing(car1, car2) -> {
        int compare =
            car1.getPrice().value() - car2.getPrice().value();
        if (compare != 0)
            return compare;
        else
            return car1.getPrice().value() - car2.getPrice().value();
    }      
collection.sort(carList, (
    Comparator.comparing(Car::getPrice)
        .thenComparing(Comparator.comparing(Car::setPrice))));
collection.sort(carList, (
    Comparator.comparing(Car::getPrice)
        .reversed()
        .thenComparing(Comparator.comparing(Car::Price))));
