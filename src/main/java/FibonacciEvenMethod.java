public class FibonacciEvenMethod {

    public int eulerEven(int number) {
        int a = 1; //pierwszy obiekt ciągu
        int b = 2; //drugi obiekt ciągu
        int sumEven = 2;
        for (int i = 3; i < number; i++) { //czwarty i kolejne obiekty ciągu
            if (i == a + b) {
                a = b;
                b = i;
                if (i % 2 == 0) {
                    sumEven += i;
                }
            }
        }
        return sumEven;
    }
}

