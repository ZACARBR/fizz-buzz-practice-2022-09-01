package tdd.fizzbuzz;

import static java.lang.Integer.valueOf;

public class FizzBuzz {
    public String countOff(int order) {
        StringBuilder message = new StringBuilder();
        String fizz = "Fizz";
        String buzz = "Buzz";
        String whizz = "Whizz";

            if (order % 3 == 0){
                message.append(fizz);
            }

            if (order % 5 == 0){
                message.append(buzz);
            }

            if (order % 7 == 0){
                message.append(whizz);
            }

        if (message.length() == 0){
            message.append(order);
        }

        return message.toString();
    }
}
