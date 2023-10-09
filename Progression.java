public class Progression {

    public static void main(String[] args) {
        System.out.println(isProgressive(new int[] {5, 8, 11, 14, 17}));
        System.out.println(isProgressive(new int[] {4, 8, 10, 12, }));

    }

    private static boolean isProgressive(int[] numbers){
        boolean result = true;
        if (numbers.length == 0){
            System.out.println("Empty");
            result = false;
        } else if (numbers.length > 2){
            int difference = numbers[1] - numbers[0];
            for (int i=1; i<numbers.length - 1; i++){
                int diff = numbers[i+1] - numbers[i];
                if (diff != difference){
                    result = false;
                }
            }
        } else {
            System.out.println("Not enough information");
            result = false;
        }
        return result;
    }
}
