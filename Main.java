import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Luffy luf = new Luffy(scn.next(), scn.next(), scn.next(), scn.nextInt());
        Zoro zor = new Zoro(scn.next(), scn.next(), scn.next(), scn.nextInt());
        Sanji san = new Sanji(scn.next(), scn.next(), scn.next(), scn.nextInt());
        Ace ace = new Ace(scn.next(), scn.next(), scn.next(), scn.nextInt());
        boolean a = true;
        while (a) {
            System.out.println("查看魯夫資料請按1");
            System.out.println("查看索龍資料請按2");
            System.out.println("查看香吉士資料請按3");
            System.out.println("查看艾斯資料請按4");
            System.out.println("結束請按5");
            int b = scn.nextInt();
            switch (b) {
                case 1:
                    luf.showAll();
                    luf.showSkill();
                    break;
                case 2:
                    zor.showAll();
                    zor.showSkill();
                    break;
                case 3:
                    san.showAll();
                    san.showSkill();
                    break;
                case 4:
                    ace.showAll();
                    ace.showSkill();
                    break;
                case 5:
                    a = false;
                    System.out.println("謝謝您的使用!");
                    break;
            }
        }
    }
}