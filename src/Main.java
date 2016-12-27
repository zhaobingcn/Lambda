import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public void testPeek(){
        List<String> a = Stream.of("one", "two", "three", "four")
                .filter(string -> string.length() > 3)
                .peek(e -> System.out.println("filtered value :" + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value:" + e))
                .collect(Collectors.toList());
        a.forEach(s -> System.out.println(s));
    }

    public void testStream(){
        Stream<Integer>  stream = Arrays.stream(new Integer[]{1,2,3,4,5}) ;
        long out = stream.map(a -> a*a)
                .reduce(0, Integer::sum).longValue();
        System.out.println(out);
    }

    public static void main(String[] args) {

        Main a = new Main();
//        a.testPeek();
        a.testStream();
    }

}
