import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class IntermediateOperation {
    public static void main(String[] args){

//        1) filter() => it will filter the element based on conditions
        List<String> names = Arrays.asList("Vijay","Ajith","Surya","Dhoni","Rahul");
        List<String> filterNames = names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filterNames);

//        2) map() = transform each element in the stream
        List<String> listNames = Arrays.asList("Vijay","Ajith","Surya","Dhoni");
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseNames);

//        3) sorted() - sorts elements in natural order or comparator
        List<Integer> number = Arrays.asList(2,54,36,48,96,78,78,2,11);
        List<Integer> sortednumber = number.stream().sorted().collect(Collectors.toList());
        System.out.println(sortednumber);

//        4) distinct() - remove the duplicates elements
        List<Integer> distinctNumbers = number.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }
}
