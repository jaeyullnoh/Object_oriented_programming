import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int min = 1000000000;
        int max = -1000000000;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ary = new int[num];
        for(int i = 0; i<num; i++) {
            ary[i] = sc.nextInt();
            if(ary[i] < min) {
                min = ary[i];
            }
            if(ary[i] > max) {
                max = ary[i];
            }
        }
        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+ min);
    }
}
