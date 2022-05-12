public class FizzBuzz {

    public String fizzBuzzAlgorithm(int number) {

        if(number % 3 == 0 && number % 5 == 0) {

            return "Good Number";
        } else if(number % 3 == 0) {

            return "Bad Number";
        } else if(number % 5 == 0) {

            return "Poor Number";
        } else {

            return "-1";
        }
    }
}
