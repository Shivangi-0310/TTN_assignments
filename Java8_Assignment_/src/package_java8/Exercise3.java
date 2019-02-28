package package_java8;

//3. Using (instance) Method reference create and apply add
// and subtract method and using (Static) Method reference create
// and apply multiplication method for the functional interface created.

@FunctionalInterface
interface NumberOperations {
    int performSomething(int a, int b);

}

public class Exercise3 {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        NumberOperations numberOperations = Exercise3::multiply;
        NumberOperations numberOperations1 = new Exercise3()::add;
        NumberOperations numberOperations2 = new Exercise3()::subtract;

        System.out.println("Product: " + numberOperations.performSomething(2, 3));
        System.out.println("Sum: " + numberOperations1.performSomething(2, 3));
        System.out.println("Difference: " + numberOperations2.performSomething(2, 3));
    }
}
