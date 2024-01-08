public class TestClass { // выводит числа от 0 до 1000, которые делятся на 3,
    // но не делятся на 5, и сумма цифр в которых меньше десяти.

    public static final int MAX_LIMIT = 1000;

    public static void main(String[] args) {
        for(int i = 0; i < MAX_LIMIT; i++) {
            boolean enabled = true;
            if (i % 3 != 0) {
                enabled = false;
            }
            if (i % 5 == 0) {
                enabled = false;
            }
            if (!testSum(i)) {
                enabled = false;
            }
            if (enabled == true) {
                System.out.println("Число: " + i);
            }
        }
    }

    public static boolean testSum(int in) {
        int res = 0;
        while (in > 0) {
            res += in % 10;
            in = in / 10;
        }
        return res < 10;
    }
}
