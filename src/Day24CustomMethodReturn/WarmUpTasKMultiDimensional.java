package Day24CustomMethodReturn;

public class WarmUpTasKMultiDimensional {
    public static void main(String[] args) {
        initials("Mustafa","Baz");
        domain("cydeo@hıtmail.com");
        System.out.println("---------------------");
        String []emails={"Josh@gmail.com","Josh@hotmail.com","Jeny@yahoo.com","alı@cydeo.com","Gulşen@gmail.com"};
       // domain(emails[0]); sadece birincinin domainnini alır
        for (String email : emails) {
            domain(email);

        }
        System.out.println("---------------------");
        nameOfmonth(11);
    }

        //Create a method that can display the initials of the person   initials[String Name,StringLastName)
    public static void initials(String Name,String LastName){
        String initial=Name.charAt(0)+"."+LastName.charAt(0);
       // initial=initial.toUpperCase(); eger harflar kucukle baslarsa böylece
        System.out.println("initial = " + initial);
    }
        //Create a method that can display the domain of the person  lets analize...
    //domain(String email)
    public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf(".") );
        System.out.println("domain = " + domain);

    }
    //benzer örnekler aşagıda verilen maillerin domainlerini  yazdır

   // String []emails={"Josh@gmail.com","Josh@hotmail.com","Jeny@yahoo.com","alı@cydeo.com","Gulşen@gmail.com"};

//Create a method that can display the name of the  month based on the given number to the method
    public static void nameOfmonth(int number){
        String name="";
        if (number>1 && number<=12){

           name=(number==1)?"Jan":(number==2)?"feb":(number==3)?"marc":(number==4)?"apr":(number==5)?"may":
                   (number==6)?"jun":(number==7)?"jul":(number==8)?"aug":(number==9)?"sept":(number==10)?"oct":
                           (number==11)?"nov":(number==12)?"decm":"invalid";

        }else {
            name="invalid";
        }
        System.out.println("Month name ="+name);
    }
    //Create a method that can display the name of the day based on the given number to the method
    public static void nameOfDay(int num){

    }

       }





