package tdd.fizzbuzz;

import static java.lang.Integer.valueOf;

public class FizzBuzz {
    public String countOff(int order) {
        String FIZZ = "Fizz";
        final String buzz = "Buzz";
        final String whizz = "Whizz";

        if (order % 3 == 0 && order % 5 == 0) {
            return "FizzBuzz";
        } else if (order % 3 == 0 && order % 7 == 0) {
            return "FizzWhizz";
        } else if (order % 5 == 0 && order % 7 == 0){
            return "BuzzWhizz";
        } else {
            if (order % 3 == 0) {
                return FIZZ;
            }

            if (order % 5 == 0) {
                return buzz;
            }

            if (order % 7 == 0) {
                return whizz;
            }

            return String.valueOf(order);
        }

    }
}
