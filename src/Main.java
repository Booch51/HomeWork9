//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("Задача 1");

        int[] pay = new int[5];
        pay[0] = 1200;
        pay[1] = 120;
        pay[2] = 115;
        pay[3] = 190;
        pay[4] = 170;

        int totalPayments = 0;
        for (int i = 0; i < pay.length; i++) {
            totalPayments += pay[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalPayments + " рублей.");

        System.out.println("Задача 2");

        int minPay = pay[0];
        int maxPay = 0;
        for (int i = 0; i < pay.length; i++) {
            if (pay[i] > maxPay) {
                maxPay = pay[i];
            }
            if (pay[i] <= minPay) {
                minPay = pay[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPay + " рублей.");

        System.out.println("Задача 3");

        double averagePay = totalPayments / pay.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePay + " рублей.");

        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length/2; i++) {
            int leftI = i;
            int rightI = reverseFullName.length - i - 1;

            char tempI = reverseFullName[leftI];
            reverseFullName[leftI] = reverseFullName[rightI];
            reverseFullName [rightI] = tempI;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }




    }
}