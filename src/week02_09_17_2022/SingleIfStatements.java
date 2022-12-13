package week02_09_17_2022;

public class SingleIfStatements {

    public static void main(String[] args) {
      //  if(condition){ Statemen
        int number= 301;

        //System.out.println("Odd Number"); eger 2ikye bölnüp kalan =0 olmasaydı even number olamayacaktı

        boolean evenNumber=number%2==0;
        boolean oddNumber=!evenNumber;
        if(evenNumber){//true
            System.out.println(number+"=is even number");
        }

        if(oddNumber){//! işareti koyarak kalan 0 değilse dedik// false
            System.out.println(number+"=  oddNumber");
            System.out.println("------------------------------------------------");

            int r = 200;  //positive //negative//zero 3 şekilde yazdırılır  //kaç şekilde positive olduğunu anlatırız

            if (r > 0) {  // eger 0 dan büyükse pozitif
                System.out.println(r + "is positif = ");

            }


            if (r < 0) {// eger 0 dan k&uuml;&ccedil;&uuml;kse negatif

                System.out.println(r + "is negativ ");


            }
            if (r == 0) { //eger 0 a eşitse 0 dır
                System.out.println(r + " is zero");


            }

        }
    }









        }



