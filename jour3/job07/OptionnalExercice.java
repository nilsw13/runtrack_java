package jour3.job07;

import java.util.Optional;

public class OptionnalExercice {

    public static void main(String[] args) {
        Optional<String> input = Optional.ofNullable(args.length > 0 ? args[0] : null);

        input.ifPresentOrElse(
                inputs -> System.out.println("longueur de la chaine : " + inputs.length()),
                () -> System.out.println("chaine non fournie")
        );

    }
}

