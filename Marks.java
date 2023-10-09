//import static java.lang.VersionProps.print;

public class Marks {

    public static void main(String[] args) {
        checkMarks (new int[]{5,4,5,5});

    }

    public static void checkMarks(int[] marks){
        int average;
        int sum = 0;
        for (int i=0; i < marks.length; i++){
            sum += marks[i];
            System.out.println ("i = " + i + " marks[i = " +marks[i] + ", sum: "
            + sum);
        }

        average = sum / marks.length;

        if (average == 5){
            System.out.println("Отличник");
        } else {
            System.out.println("Не отличник");
        }
    }
}
