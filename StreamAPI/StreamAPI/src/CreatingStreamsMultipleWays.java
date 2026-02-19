import java.util.Arrays;
import java.util.*;
import java.util.stream.IntStream;

public class CreatingStreamsMultipleWays {
    public static void main(String[] args){
//        1) from collections(List, set, map)
//        Collections in java have a stream() method
        List<String> names = Arrays.asList("Vijay","Siva","Ajith");
        names.stream().forEach(System.out::println);

//        2) from arrays
//        Arrays.stream() to create a stream from an array
        int[] numbers = {2,4,5,6,58};
        IntStream numberstream = Arrays.stream(numbers);
        numberstream.forEach(System.out::println);
    }
}
