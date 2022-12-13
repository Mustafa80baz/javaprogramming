package Day15ForLoop;

public class Fınrayazımı {
    public static void main(String[] args) {

       // out oput =1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FIRNA 16 17 FIN sayı terina bu harler


        for ( int i =1;i<=100;i++){
          if (i%15==0){//15 e bölüünce kalan 0 olan sayılarda "fınra"
              System.out.print("FIRNA ");
          } else if (i%3==0) {// 3 e bölününce kalan sıfırsa "fın"
              System.out.print("FIN ");

          } else if (i%5==0) {// 5 bölünüp kalan 0 olursa RA yazdır
              System.out.print("RA ");

          }else {
              System.out.print(i+" ");
          }


        }

    }
}
