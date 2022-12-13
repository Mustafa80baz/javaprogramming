package ReplitCozumleri;

public class Agactakip {
    public static void main(String[] args) {
        int size=0;
        for (int i = 1; i <=10; i++) {
        if (i<=3){
            size +=1;
            System.out.println("year "+ i+" - growth 1 cm\n" +
                    "tree size:"+ size+"cm");
        }else {
            size +=2;
            System.out.println("year "+ i+" - growth 2 cm\n" +
                    "tree size:"+ size+"cm");
        }

        }
    }
}
