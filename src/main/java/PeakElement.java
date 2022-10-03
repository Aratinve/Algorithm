public class PeakElement {

    public int[] peakElementAlgorithm(int[] numbers){
        if (numbers.length > 2) {

            int[] peakArray = new int[numbers.length];
            int count = 0;
            if(numbers[0] > numbers[1]) {
                peakArray[count] = numbers[0];
                count++;
            }
            for(int i = 1; i < numbers.length - 1; i++) {
                if(numbers[i-1] < numbers[i] && numbers[i] > numbers[i+1]) {
                    peakArray[count] = numbers[i];
                    count++;
                }
            }
            if(numbers[numbers.length-2] < numbers[numbers.length-1]) {
                peakArray[count] = numbers[numbers.length-1];
                count++;
            }

            int[] result = new int[count];
            for(int i = 0; i < count; i++) {
                result[i] = peakArray[i];
            }

            return result;
        } else if(numbers.length == 2){
            if (numbers[0] > numbers[1]) {

                return new int[]{numbers[0]};
            } else {

                return new int[]{numbers[1]};
            }
        } else if(numbers.length == 1){

            return numbers;
        } else {

            return new int[]{};
        }
    }
}
