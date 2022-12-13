package ZulphikarWeek4ifStatement;

public class switchStatement {
    public static void main(String[] args) {
        int num=1;
        switch (num){//break is mendatory but default is not
            case 1:
                System.out.println("action one");
    break;
            case 2:
                System.out.println("action 2");
                break;
            default:
                System.out.println("bir yanlışlık var");
        }
    }
}
