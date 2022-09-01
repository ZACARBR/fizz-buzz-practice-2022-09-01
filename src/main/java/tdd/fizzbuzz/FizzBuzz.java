package tdd.fizzbuzz;

import static java.lang.Integer.valueOf;

public class FizzBuzz {
    public String countOff(int order) {

        if (order % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(order);
    }
}
