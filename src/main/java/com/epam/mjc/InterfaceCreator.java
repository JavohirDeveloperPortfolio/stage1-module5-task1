package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return x-> {
            for (String s : x){
                if (!(Character.isAlphabetic(s.charAt(0)) && Character.isUpperCase(s.charAt(0)))){
                    return false;
                }
            }
            return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x -> {
            int len = x.size();
            for (int i = 0; i < len; i ++){
                if (x.get(i) % 2 == 0){
                    x.add(x.get(i));
                }
            }
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            values.removeIf(item -> !(Character.isUpperCase(item.charAt(0)) && item.charAt(item.length() - 1) == '.' && (item.split(" ").length > 3)));
            return values;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return x -> {
            Map<String,Integer> map = new HashMap<>();
            for (String s : x) {
                map.put(s, s.length());
            }
            return map;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> list = new ArrayList<>();
            list.addAll(list1);
            list.addAll(list2);
            return list;
        };
    }
}
