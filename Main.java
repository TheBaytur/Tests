public class Main {
    public static void main(String[] args) {
        print (drink(true,true));
        print (drink(true,false));
        print (drink(false,true));
        print (drink(false,false));

    }

    private static boolean drink(boolean isFriday, boolean haveMoney){
        boolean goToDrink = false;

        return isFriday || haveMoney;
    }

    private static void print(boolean result){
        System.out.println(result);
    }
}