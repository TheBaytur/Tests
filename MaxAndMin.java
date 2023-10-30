public class MaxAndMin {

    public static void main(String[] args) {
        System.out.println(differenceBetweenMaxAndMin(new int[]{5,1}));
        System.out.println(differenceBetweenMaxAndMin(new int[]{10, 24, 5, 1, -10}));
    }

    private static int differenceBetweenMaxAndMin(int[]array){
        int difference = 0;
        if (array.length < 2){
            System.out.println("Array doesn't contain at least 2 items");
        } else  {
            final int item0 = array[0];
            final int lastItem = array[array.length - 1];

            boolean isFirstItemMin = item0 < lastItem;
            int min = isFirstItemMin ? item0 : lastItem;
            int max = isFirstItemMin ? lastItem : item0;

            for (int i = 1; i < array.length - 1; i++){
                if (array[i] < min){
                    min = array[i];
                } else if (array[i] > max){
                    max = array[i];
                }
            }
            difference = max - min;
        }
        return difference;

    }

}
