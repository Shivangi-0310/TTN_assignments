package package_java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
//5.Implement following functional interfaces from java.util.function using lambdas:
//(1) Consumer
//(2) Supplier
//(3) Predicate
//(4) Function

public class Exercise5 {
    public static void main(String[] args) {
        //Consumer
        Consumer<Integer> consumer =
                e -> System.out.println("Consumer takes the value but do not return anything " + e);
        consumer.accept(10);
        int a = 10;

        //Supplier
        Supplier supplier = () -> "Value returned by supplier: " + (a + 9);
        System.out.println(supplier.get());

        //Predicate
        Predicate<Integer> predicate = e -> {
            System.out.print("number is odd: ");
            return (e % 2 != 0);
        };
        System.out.println(predicate.test(10));

        //Function
        Function<Integer, Integer> function = e ->
        {
            System.out.print("Square of " + e + " is: ");
            return e * e;
        };
        System.out.println(function.apply(109));

    }
}
