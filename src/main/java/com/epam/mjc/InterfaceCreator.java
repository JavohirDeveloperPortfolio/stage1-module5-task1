package com.epam.mjc;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {

        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {

        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Supplier<List<String>> filterCollection(List<String> values) {

        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {

        throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {

        throw new UnsupportedOperationException("You should implement this method.");
    }
}
