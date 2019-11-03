import main.fizzbuzz.FizzBuzzConvertor;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void fizzBuzzConvertorLeavesNormalNumbersAlone() {
    FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();

    Assert.assertEquals("1", fizzBuzz.convert(1));
    Assert.assertEquals("2", fizzBuzz.convert(2));
    Assert.assertEquals("97", fizzBuzz.convert(97));
    Assert.assertEquals("98", fizzBuzz.convert(98));
  }

  @Test
  public void fizzBuzzConvertorMultiplesOfThree() {
    FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();

    Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    Assert.assertEquals("Fizz", fizzBuzz.convert(99));
  }

  @Test
  public void fizzBuzzConvertorMultiplesOfFive() {
    FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();

    Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    Assert.assertEquals("Buzz", fizzBuzz.convert(100));
  }

  @Test
  public void multipleOfBothThreeAndFive() {
    FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();

    Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
  }
}
