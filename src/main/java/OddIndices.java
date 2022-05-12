public class OddIndices {

    public int[] oddIndicesAlgorithm(int[] numbers) {

        int length = (numbers.length / 2);
        int[] oddIndices = new int[length];
        for(int i = 1, j = 0; i < numbers.length ; i += 2) {
            oddIndices[j] = numbers[i];
            j++;
        }

        return oddIndices;
    }
}
