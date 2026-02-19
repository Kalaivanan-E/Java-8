import javax.naming.Name;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIPractice {

    static void main() {
//        1) Print all elements using Stream
        List<String> names = Arrays.asList("Vijay","Ajith","Surya","Dhoni");
        names.stream().forEach(System.out::println);

//        2) Print even numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        numbers.stream().filter(num->num%2==0).forEach(System.out::println);

//        3) Convert all names to uppercase
        List<String> Names = Arrays.asList("vijay","ajith","surya");
        Names.stream().map(String::toUpperCase).forEach(System.out::println);

//        4)Count total elements
        List<Integer> num = Arrays.asList(10,20,30,40,50);
        long countednum = num.stream().count();
        System.out.println(countednum);

//        5)Print names starting with "S"
        List<String> usernames = Arrays.asList("Vijay","Surya","Siva","Ajith");
        usernames.stream().filter(name-> name.startsWith("S")).forEach(System.out::println);

//        6)Square each number
        List<Integer> squarednumber = num.stream().map(n-> n*n).collect(Collectors.toList());
        System.out.println(squarednumber);

//        7)Remove duplicate numbers
        List<Integer> nums = Arrays.asList(1,22,55,22,35,98,2,3,4,4,5);
        List<Integer> withoutduplicates = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(withoutduplicates);

//        8)Sort numbers in ascending order
        List<Integer> sortednums = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortednums);

//        9)Find maximum number
        int maximumno = nums.stream()
                .max(Integer::compare)
                        .orElse(0);
        System.out.println(maximumno);


    }
}
