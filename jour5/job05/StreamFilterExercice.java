package jour5.job05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExercice {
    public static void main(String[] args) {

        int compareur = 25;

        List<Integer> arguments = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
        arguments.stream()
                .filter(number -> number > compareur)
                .forEach(System.out::println);


    }
}
