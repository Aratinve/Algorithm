public class Intersection {
    public int[] intersectionAlgorithm(int[] numbersFirst, int[] numbersSecond) {
        if(numbersFirst.length > 0 && numbersSecond.length > 0){
            int[] intersectionArray = new int[numbersFirst.length];
            int count = 0;

            for(int i = 0; i < numbersFirst.length; i++) {
                for(int j = 0; j < numbersSecond.length; j++) {
                    if(numbersFirst[i] == numbersSecond[i]) {
                        intersectionArray[count] = numbersFirst[i];
                        count++;
                    }
                }
            }

            int[] result = new int[count];
            for(int i = 0; i < count; i++) {
                result[i] = intersectionArray[i];
            }

            return result;
        } else {

            return new int[]{};
        }

    }
}
