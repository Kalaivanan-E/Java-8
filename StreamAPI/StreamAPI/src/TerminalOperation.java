import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation {
    static void main() {
//        1) forEach() - performs an action on each elements
        List<String> names = Arrays.asList("TVK","DMK","ADMK","BJP");
        names.stream().forEach(System.out::println);

//        2) collect() - collect element into collection like (list, set,map)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> collectednumbers = numbers.stream().collect(Collectors.toList());
        System.out.println(collectednumbers);

//        3) count() - Returns the numbers of elements in the stream
        long count = numbers.stream().count();
        System.out.println(count);

//        4) reduce() - combine element into a single vales
        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
