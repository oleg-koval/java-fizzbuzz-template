package main.fizzbuzz;

public class FizzBuzzConvertor {
  private String Buzz = "Buzz";
  private String Fizz = "Fizz";

  private Boolean isDivisibleBy(int numerator, int denominator) {
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
      return this.Buzz;
    }

    if (isDivisibleBy(toConvertFizzBuzz, 3)) {
      return this.Fizz;
    }

		return String.valueOf(toConvertFizzBuzz);
	}

}
