package PracticeTaskDay09_1;

public class NumberToWord {
    public static void main(String[] args) {
         int a=2;
        String result;
          if(a==1);{
      result="one";

        }
        if(a==2);{
        result="two";
            System.out.println(result);
        }

        System.out.println("------------------------");

        //tureria kullanılarak yazılacak  0 dan 9 kadar sayı kacsa yazı ile sayı yazılacak

        int number=52;




 String eger =(number>=0 && number<=9)?
         (number==0)?"zero":(number==1)?"one":(number==2)?"two":(number==3)?"three"
            :(number==4)?"four":(number==5)?"five":(number==6)?"six":(number==7)?"seven":(number==8)?"eight":"nine"
            :"gecersiz numara";


        System.out.println(eger);


        }



    }

