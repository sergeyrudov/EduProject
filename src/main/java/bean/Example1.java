package bean;

import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.collect;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,8,2,8,3,9,4,9);

        System.out.println(checkRes(list));


    }

    public static Set<Integer> checkRes(List<Integer> list) {
        return new LinkedHashSet<Integer>(list);
    }

}
