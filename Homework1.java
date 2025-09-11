import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0, i, num;

        for(i = 0; i<5; i++) {
            System.out.printf("정수를 입력하세요 : ");
            num = sc.nextInt();
            total += num;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", total);
        }
    }
}
