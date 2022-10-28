public class ReverseArray {

    public int[] reverseArrayAlgorithm(int[] numbers){
        int[] result = new int[numbers.length];
        for(int i = 0, j = result.length - 1; i < numbers.length; i++, j--) {
            result[j] = numbers[i];
        }

        return result;
    }
}
