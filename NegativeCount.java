//import static java.lang.VersionProps.print;

// Проверка на пустоту и после чего циклом проходим по массиву.
public class NegativeCount {
    public static void main(String[] args) {
        System.out.println(negativeCount(new int[]{-1, 3, 2, -2}));
        System.out.println(negativeCount(new int[]{1, 3, 2, -2}));
        System.out.println(negativeCount(new int[]{-1, -3, -2, -2}));
        System.out.println(negativeCount(new int[]{}));

    }

    private static void print(int negativeCount) {
    }

    private static int negativeCount(int[] array) {
        int count = 0;
        if (array.length < 1){
            System.out.println(("array is empty"));
            count = -1;
        } else {
            for (int number : array) {
                if (number < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
