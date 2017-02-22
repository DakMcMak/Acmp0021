import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calculation;
        int salary1 = scanner.nextInt();
        int salary2 = scanner.nextInt();
        int salary3 = scanner.nextInt();
        if (salary1 > 10000 || salary2 > 10000 || salary3 > 10000) {
            System.out.println("Ошибка");
        } else {
            if (salary1 > salary2 & salary2 > salary3) {
                calculation = salary1 - salary3;
                System.out.println(calculation);
            }

            if (salary1 > salary3 & salary3 > salary2) {
                calculation = salary1 - salary2;
                System.out.println(calculation);
            }

            if (salary2 > salary1 & salary1 > salary3) {
                calculation = salary2 - salary3;
                System.out.println(calculation);
            }
            if (salary2 > salary3 & salary3 > salary1) {
                calculation = salary2 - salary1;
                System.out.println(calculation);
            }
            if (salary3 > salary2 & salary2 > salary1) {
                calculation = salary3 - salary1;
                System.out.println(calculation);
            }
            if (salary3 > salary1 & salary1 > salary2) {
                calculation = salary3 - salary2;
                System.out.println(calculation);
            }

            }
        }
    }