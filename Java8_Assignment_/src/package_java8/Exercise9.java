package package_java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//9. Collect all the even numbers from an integer list.

public class Exercise9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,12,14,13,45,65,34,54);
        for(Integer a:list)
        {
            System.out.println(a);
        }
        System.out.println("List of even numbers: "+list.stream().filter(e->e%2==0).collect(Collectors.toList()));
    }
}
