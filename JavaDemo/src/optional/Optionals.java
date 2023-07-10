package optional;

import java.util.Optional;

public class Optionals {

    Optional<String> optional1 = Optional.empty();

    public static void main(String[] args) {

        Optionals op = new Optionals();

        System.out.println(op.optional1); // Optional.empty
        System.out.println(op.optional1.isPresent()); // false

    }

}
