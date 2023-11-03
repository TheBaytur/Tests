public class showNumbersDividedByNumbers {
    public static void main(String[] args) {
        showNumbersDivededByNumbers (100, 2);
    }

    public static void showNumbersDivededByNumbers(int max, int arg){
        for (int i = 0; i < max; i +=arg){
            System.out.println(i);
        }
    }
}
