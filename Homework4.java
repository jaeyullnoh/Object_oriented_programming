import java.util.Scanner;

public class Homework4 {

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
    
    public static int gcd_while(int m, int n) {
        int div = n;

        if(n == 0) {
            return m;
        }
        while (div != 0) {
            if(n%div == 0 && m%div == 0) {
                break;
            }
            else
                div--;
        }        
        return div;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0, answer = 0, tmp = 0;
        
        System.out.print("두 수를 입력하세요: ");
        m = sc.nextInt();
        n = sc.nextInt();

        if(n>m) {
            tmp = n;
            n = m;
            m = tmp;
        }

        answer = gcd(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.(재귀)\n", answer);

        answer = gcd_while(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.(반복문)", answer);
    }
}