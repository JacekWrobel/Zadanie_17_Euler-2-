import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciEvenMethodTest {

    /*
    number 22 >> (2 + 8); result 10
    number 56 >> (2 + 8 + 34); result 44
    number 90 >> (2 + 8 + 34); result 44
        */

    @Test
    public void fibonacciTest22() {
        FibonacciEvenMethod test = new FibonacciEvenMethod();
        //given
        int number = 22;

        //when
        int result = test.eulerEven(number);

        //than
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void fibonacciTest56() {
        FibonacciEvenMethod test = new FibonacciEvenMethod();
        //given
        int number = 56;

        //when
        int result = test.eulerEven(number);

        //than
        Assertions.assertThat(result).isEqualTo(44);
    }

    @Test
    public void fibonacciTest90() {
        FibonacciEvenMethod test = new FibonacciEvenMethod();
        //given
        int number = 90;

        //when
        int result = test.eulerEven(number);

        //than
        Assertions.assertThat(result).isEqualTo(44);
    }
}
