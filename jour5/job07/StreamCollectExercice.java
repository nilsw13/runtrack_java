package jour5.job07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExercice {
    public static void main(String[] args) {
        int comparateur = Integer.parseInt(args[0]);
        List<Integer> arguments = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
        arguments.stream().filter(number -> number < comparateur ).forEach(System.out::println);


    }
}
