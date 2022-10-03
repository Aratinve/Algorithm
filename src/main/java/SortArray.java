public class SortArray {

    private int smallestInd(int[] numbers) {
        if (numbers.length < 2) {

            return 0;
        } else {
            int smallest = numbers[0];
            int smallestIndex = 0;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < smallest) {
                    smallest = numbers[i];
                    smallestIndex = i;
                }
            }

            return smallestIndex;
        }
    }

    public int[] sortArraySelectionAlgorithm(int[] numbers) {
        if (numbers.length > 1) {
            int[] resArray = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                int smallestIndex = smallestInd(numbers);
                resArray[i] = numbers[smallestIndex];
                numbers[smallestIndex] = Integer.MAX_VALUE;
            }

            return resArray;
        } else {

            return numbers;
        }
    }


    public int[] sortArrayQuickAlgorithmIncreased(int[] numbers) {
        if (numbers.length < 2) {

            return numbers;
        } else if (numbers.length == 2) {
            if (numbers[0] > numbers[1]) {
                int temp = numbers[1];
                numbers[1] = numbers[0];
                numbers[0] = temp;
            }

            return numbers;
        } else {
            int pivot = numbers[0];
            int[] baseLess = new int[numbers.length];
            int[] baseGreater = new int[numbers.length];
            int countLess = 0;
            int countGreater = 0;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] <= pivot) {
                    baseLess[countLess] = numbers[i];
                    countLess++;
                } else {
                    baseGreater[countGreater] = numbers[i];
                    countGreater++;
                }
            }

            int[] less = new int[countLess];
            int[] greater = new int[countGreater];
            for (int i = 0; i < less.length; i++) {
                less[i] = baseLess[i];
            }
            for (int i = 0; i < greater.length; i++) {
                greater[i] = baseGreater[i];
            }

            less = sortArrayQuickAlgorithmIncreased(less);
            greater = sortArrayQuickAlgorithmIncreased(greater);

            int countAll;
            for (countAll = 0; countAll < less.length; countAll++) {
                numbers[countAll] = less[countAll];
            }

            numbers[countAll] = pivot;
            countAll++;

            for (int k = 0; k < greater.length; k++, countAll++) {
                numbers[countAll] = greater[k];
            }

            return numbers;
        }
    }


/*    public static void main(String[] args) {
        // , 7, 5, 2, 9, 23, 1
        int[] numbers = {3, 4, 5, 7, 2, 1};

        for (int num : numbers) {
            System.out.print("" + num + " ");
        }
        System.out.println();

        numbers = sortArrayQuickAlgorithmIncreased(numbers);


//            numbers = sortArraySelectionAlgorithm(numbers);
        for (int num : numbers) {
            System.out.print("" + num + " ");
        }
    }*/
}


