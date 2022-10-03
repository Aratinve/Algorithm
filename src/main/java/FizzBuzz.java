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

    public static String fizzBuzzSequence(int number) {
        StringBuilder sequence = new StringBuilder();

        for(int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sequence.append("FizzBuzz");
            } else if (i % 3 == 0) {
                sequence.append("Fizz");
            } else if (i % 5 == 0) {
                sequence.append("Buzz");
            } else {
                sequence.append(i);
            }
            sequence.append(" ");
        }

        return sequence.toString();
    }
/*
    public static void main(String[] args) {
        System.out.println(fizzBuzzSequence(20));
    }*/
}
