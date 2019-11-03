import main.fizzbuzz.FizzBuzzConvertor;
import org.junit.Test;

public class ActualFizzBuzzTest {
  @Test
  public void outputTheHundredFizzBuzzes() {

    FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
    for(int i=1; i<=100; i++) {
      System.out.println(fizzBuzz.convert(i));
    }
  }
}
