package Day24CustomMethodReturn;

public class Return_ExitMethod {
    public static void main(String[] args) {
        //return ila exite arasındaki farkı anlatacak

        nameOfmonth(30);
        System.out.println("hello word");// return yerine asagıda exit kullanırsak hello word u yazdırmaz
        //butun systemi dudurur. retun sadece iiçinde bulundugu  if saya loop ondan cıkarırı
    }
    //Create a method that can display the name of the  month based on the given number to the method
    public static void nameOfmonth(int number){


        if (number<1 || number>12){
            System.out.println("invalid ");
            return;//metod dan cıkmak için kullanılır Void içinde sadece bu amaçla kullanılabılır
           // System.exit(0);
        }

        String  name=(number==1)?"Jan":(number==2)?"feb":(number==3)?"marc":(number==4)?"apr":(number==5)?"may":
                (number==6)?"jun":(number==7)?"jul":(number==8)?"aug":(number==9)?"sept":(number==10)?"oct":
                        (number==11)?"nov":"Decm";

        System.out.println("Month name ="+name);
    }

}
