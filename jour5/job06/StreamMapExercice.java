package jour5.job06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExercice {
    public static void main(String[] args) {
        List<String> arguments = Arrays.stream(args).collect(Collectors.toList());
        arguments.stream().map(String::toUpperCase).forEach(argument -> System.out.print(argument + ", "));

    }
}
