import java.util.Scanner;

class Student {
    int num;
    long phone;
    String name;
    String major;
    public void setnum(int Newnum) {
        this.num = Newnum;
    }
    public void setphone(long Newphone) {
        this.phone = Newphone;
    } 
    public void setname(String Newname) {
        this.name = Newname;
    }
    public void setmajor(String Newmajor) {
        this.major = Newmajor;
    }
    public int getnum() {
        return this.num;
    }
    public long getphone() {
        return this.phone;
    }
    public String getname() {
        return this.name;
    }
    public String getmajor() {
        return this.major;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] st = new Student[3];

        String[] c = {"첫", "두", "세"};

        for(int i = 0; i<3; i++) {
            st[i] = new Student();
            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int num = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextInt();
            st[i].setnum(num);
            st[i].setname(name);
            st[i].setmajor(major);
            st[i].setphone(phone);
        }
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for(int i = 0; i<3; i++) {
            int num = st[i].getnum();
            long phone = st[i].getphone();
            String name = st[i].getname();
            String major = st[i].getmajor();
            String phone_string = Long.toString(phone);
            System.out.printf("%s번째 학생: %d %s %s 0%s-%s-%s\n", c[i], num, name, major, phone_string.substring(0,2), phone_string.substring(2,6), phone_string.substring(6,10));
        }
    }
}
