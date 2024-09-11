package with;


import java.util.Scanner;

public class WithMain {

    public static void main(String[] args) {
        Calculatr calculatr = new Calculatr();
        calculatr.calculate();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("찻번째 숫자를 입력하세요.(종료하려면 exit 입력)");
            String first = sc.next();

            if (first.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            int i = Integer.parseInt(first);

            System.out.println("연산기호를 입력하세요.");
            String second = sc.next();

            System.out.println("두번째 숫자를를 입력하세요.");
            String third = sc.next();
            int j = Integer.parseInt(third);


        }
    }

}
