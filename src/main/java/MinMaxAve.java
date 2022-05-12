public class MinMaxAve {

    public int[] minMaxAveAlgorithm(int[] numbers, int firstI, int secondI) {
        if(numbers.length != 0 && firstI >= 0 && secondI >= firstI
                && firstI < numbers.length && secondI < numbers.length)
        {
            int[] result = {numbers[firstI], numbers[firstI], numbers[firstI]};

            for (int i = firstI + 1; i <= secondI; i++) {
                if (result[0] > numbers[i]) {
                    result[0] = numbers[i];
                }
                if (result[1] < numbers[i]) {
                    result[1] = numbers[i];
                }

                result[2] += numbers[i];
            }
            result[2] = result[2] / (secondI - firstI + 1) ;

            return result;
        } else {

            return new int[]{};
        }
    }

//    public static int[] minMaxAverArray(int[] arr) {
//
//        if(arr.length != 0) {
//            int[] result = {arr[0], arr[0], arr[0]};
//
//            for (int i = 1; i < arr.length; i++) {
//
//                if (result[1] > arr[i]) {
//                    result[1] = arr[i];
//                }
//
//                if (result[2] < arr[i]) {
//                    result[2] = arr[i];
//                }
//
//                result[0] += arr[i];
//            }
//            result[0] = result[0] / arr.length;
//
//            return result;
//        } else {
//
//            return new int[]{};
//        }
//    }
//
//    public static int[] subArray(int[] numbers, int firstI, int secondI) {
//
//        if (firstI >= 0 && firstI < numbers.length
//                && secondI >= 0 && secondI < numbers.length) {
//            if(firstI <= secondI) {
//                int[] res = new int[secondI - firstI + 1];
//                for(int i = 0; i < res.length; i++){
//                    res[i] = numbers[i+firstI];
//                }
//
//                return res;
//            } else {
//                int[] res = new int[firstI - secondI + 1];
//                for(int i = 0; i < res.length; i++){
//                    res[i] = numbers[i+secondI];
//                }
//
//                return res;
//            }
//        } else {
//
//            return new int[]{};
//        }
//    }
//
//    public int[] minMaxAveAlgorithm(int[] numbers, int firstI, int secondI) {
//
//        if(numbers.length == 0
//                || firstI < 0 || secondI < 0
//                || firstI >= numbers.length || secondI >= numbers.length) {
//
//            return new int[]{};
//
//        } else if (firstI == secondI) {
//
//            return new int[] {numbers[firstI], numbers[firstI], numbers[firstI]};
//        } else {
//            int[] scrapArray = subArray(numbers, firstI, secondI);
//
//            return minMaxAverArray(scrapArray);
//        }
//    }
}
