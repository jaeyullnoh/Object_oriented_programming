import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Map<String, String> a = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String id = "";
        String passwd = "";
        int flag = 0;
        a.put("myId", "myPass");
        a.put("myId2", "myPass2");
        a.put("myId3", "myPass3");
        
        while(flag != 1) {
            System.out.printf("id와 password를 입력해주세요.\nid : ");
            id = sc.nextLine().trim();

            if(a.containsKey(id)) {
                System.out.printf("password : ");
                passwd = sc.nextLine().trim();
                if(a.get(id).equals(passwd)){
                    flag = 1;
                }
                else {
                    flag = 2;
                }
            }
            
            if(flag == 1) {
                System.out.printf("id와 비밀번호가 일치합니다.");
            }
            else if(flag == 2){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        }
    }
}