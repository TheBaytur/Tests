import java.util.Scanner;


public class Salary {

    private static final int CREDIT_MAX = 150000;
    private static final int SALARY_MIN = 25000;
    private static final int DURATION_MAX = 12;
    private static final String DENIED = "Вам отказано в кредите";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добрый день, желаете взять в кредит? Какая у вам зарплата?");
        int salary = scanner.nextInt();
        System.out.println("Какой срок?");
        int duration = scanner.nextInt();
        System.out.println("Какая сумма?");
        int credit = scanner.nextInt();
        if (salary < SALARY_MIN || duration > DURATION_MAX || credit > CREDIT_MAX){
            System.out.println(DENIED);
                } else {
            System.out.println("Вам одобрен кредит на сумму " + CREDIT_MAX + "!");
            }

            }
}

    //     System.out.println("Добрый день, желаете взять в кредит? Какая у вам зарплата?");
    //     int salary = scanner.nextInt();
    //     if (salary < SALARY_MIN) {
    //         System.out.println(DENIED);
    //     } else {
    //         System.out.println("Какой срок?");
    //         int duration = scanner.nextInt();
    //         if (duration > DURATION_MAX) {
    //             System.out.println(DENIED);
    //     } else {
    //             System.out.println("Какая сумма?");
    //             int credit = scanner.nextInt();
    //             if (credit > CREDIT_MAX) {
    //                 System.out.println(DENIED);
    //             } else {
    //                 System.out.println("Вам одобрен кредит на сумму " + CREDIT_MAX + "!");
    //             }
    //         }

    //         }
    // }
// }
