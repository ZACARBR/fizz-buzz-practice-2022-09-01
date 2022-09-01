package tdd.fizzbuzz;

import static java.lang.Integer.valueOf;

public class FizzBuzz {
    public String countOff(int order) {
        String FIZZ = "Fizz";

        if (order % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(order);
    }
}
