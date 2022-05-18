import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 6, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria green", "Alex blue", "bob black");
        System.out.println(Arrays.toString(st2.toArray()));

    }

}
