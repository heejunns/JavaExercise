package javaexercise;

import java.util.Scanner;

public class JavaExercise_7 {
    public static void main(String[] args) { // 식당 주문 프로그램 만들기.

        int menu = 0;
        int number = 0;
        int money = 0, menu1 = 1000, menu2 = 1000, menu3 = 1500;
        Scanner sc = new Scanner(System.in);

       loop: while (true) {
            System.out.println("1.김치찌개");
            System.out.println("2.된장찌개");
            System.out.println("3.돈까스");
            System.out.println("원하는 메뉴를 입력하세요.프로그램 종료는 0번 입니다.");

            number = sc.nextInt();

            if (number == 0) {
                break;
            } else if (!(1 <= number && number <= 3)) {
                System.out.println("메뉴가 없습니다. 다시 선택 해 주세요.");
                continue;
            }
            System.out.println("선택하신 메뉴는" + number + "입니다.");

            for (; ; ) {
                System.out.println("선택하신 메뉴의 계산을 진행 합니다. 돈을 지불 해주세요 : ");
                money = sc.nextInt();
                if (number == 1) {
                    if (money >= menu1) {
                        System.out.printf("선택하신 메뉴는 김치찌개 입니다. 받은 금액은 %d 이고 거스름돈은 %d원 입니다.\n", money, money - menu1);
                        break loop;
                    } else {
                        System.out.printf("선택하신 메뉴는 김치찌개 입니다. 김치찌개의 가격은 %d원 입니다. 지불하신 금액이 부족합니다.\n", menu1);
                    }
                } else if (number == 2) {
                    if (money >= menu2) {
                        System.out.printf("선택하신 메뉴는 된장찌개 입니다. 받은 금액은 %d 이고 거스름돈은 %d원 입니다.\n", money, money - menu2);
                        break loop;
                    } else {
                        System.out.printf("선택하신 메뉴는 된장찌개 입니다. 된장찌개 가격은 %d원 입니다. 지불하신 금액이 부족합니다.", menu2);
                    }
                } else if (number == 3) {
                    if (money >= menu3) {
                        System.out.printf("선택하신 메뉴는 돈까스 입니다. 받은 금액은 %d 이고 거스름돈은 %d원 입니다.\n", money, money - menu3);
                        break loop;
                    } else {
                        System.out.printf("선택하신 메뉴는 돈까스 입니다. 돈까스의 가격은 %d원 입니다. 지불하신 금액이 부족합니다.", menu3);
                    }
                }
            }
        }
        System.out.println("프로그램을 종료 합니다. 감사합니다.");
    }
}

