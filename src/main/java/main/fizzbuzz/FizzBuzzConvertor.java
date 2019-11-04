package main.fizzbuzz;

public class FizzBuzzConvertor {
    private static String Buzz = "Buzz";
    private static String Fizz = "Fizz";

    private static Boolean isDivisibleBy(int numerator, int denominator) {
        return numerator % denominator == 0;
    }

    /**
     * For multiples of three print "Fizz".
     * For the multiples of five print "Buzz".
     * For numbers which are multiples of both three and five print "FizzBuzz".
     * For rest print toConvertFizzBuzz value.
     */
    public String convert(int toConvertFizzBuzz) {
        if (isDivisibleBy(toConvertFizzBuzz, 15)) {
            return Fizz + Buzz;
        }

        if (isDivisibleBy(toConvertFizzBuzz, 5)) {
            return Buzz;
        }

        if (isDivisibleBy(toConvertFizzBuzz, 3)) {
            return Fizz;
        }

		return String.valueOf(toConvertFizzBuzz);
	}
}
