package tdd.fizzbuzz;

import static java.lang.Integer.valueOf;

public class FizzBuzz {
    public String countOff(int order) {
        String FIZZ = "Fizz";
        final String buzz = "Buzz";

        if (order % 3 == 0) {
            return FIZZ;
        }

        if (order % 5 == 0){
            return buzz;
        }

        if (order % 7 == 0){
            return "Whizz";
        }

        return String.valueOf(order);
    }
}
