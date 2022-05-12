public class SumOfTwo {

    public int[][] sumOfTwoAlgorithm(int[] numbers, int n){
        if(numbers.length > 1){
            int[][] sumOfTwo = new int[numbers.length/2][2];
            int count = 0;

            for(int i = 0; i < numbers.length; i++) {
                for(int j = i+1; j < numbers.length; j++) {
                    if((numbers[i] + numbers[j]) == n) {
                        sumOfTwo[count][0] = numbers[i];
                        sumOfTwo[count][1] = numbers[j];
                        count++;
                    }
                }
            }

            if(count != 0) {
                int[][] result = new int[count][2];
                for(int i = 0; i < count; i++) {
                    result[i][0] = sumOfTwo[i][0];
                    result[i][1] = sumOfTwo[i][1];
                }

                return result;
            } else {

                return new int[][]{};
            }
        } else {

            return new int[][]{};
        }
    }
}
