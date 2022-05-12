public class OddEven {

    public String OddEvenAlgorithm(long number) {

        if(number > Integer.MIN_VALUE && number < Integer.MAX_VALUE) {
            if (number % 2 == 0 ) {

                return "Even";
            } else {

                return "Odd";
            }
        } else {

            return "Undefined";
        }
    }
}
