package without;

import with.Calculatr;

import java.util.LinkedList;
import java.util.Scanner;

public class WithoutMain {
    public static void main(String[] args) {
        Calculatr calculatr = new Calculatr();
        calculatr.calculate();

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> results = new LinkedList<>();

        while (true) {
            System.out.println("찻번째 숫자를 입력하세요.(종료하려면 exit 입력)");
            String first = sc.next();

            if (first.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            int i = Integer.parseInt(first);

            // 첫 번째 값을 LinkedList에 추가
            results.add(i);

            System.out.println("연산기호를 입력하세요.");
            String second = sc.next();

            System.out.println("두번째 숫자를를 입력하세요.");
            String third = sc.next();
            int j = Integer.parseInt(third);

            if (second.equals("+")) {
                System.out.println("답: " + (i + j));
            } else if (second.equals("-")) {
                System.out.println("답: " + (i - j));
            } else if (second.equals("*")) {
                System.out.println("답: " + (i * j));
            } else if (second.equals("/")) {
                System.out.println("답: " + (i / j));
                if (j != 0) {
                    System.out.println(i / j);
                } else {
                    System.out.println("0으로 나눌수 없습니다");
                }
            } else {
                System.out.println("잘못입력했습니다.");
            }

            // LinkedList에서 첫 번째 값 삭제
            if (!results.isEmpty()) {
                results.removeFirst();  // 첫 번째 값 제거
                System.out.println("첫번째 입력값이 삭제되었습니다. 현재 리스트: " + results);


            }
        }
    }
}




