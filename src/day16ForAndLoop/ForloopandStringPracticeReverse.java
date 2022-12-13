package day16ForAndLoop;

public class ForloopandStringPracticeReverse {
    public static void main(String[] args) {
      // wRİTE A PROG THAT CAN revers a string
        // input :Wooden Spoon    output:noops nedooW
        String str="Wooden Spoon";
        str.charAt(str.length()-1);// bize son harfi veririr"n" yazdırınca n cıkar
        String result="";// we create  for revers of wooden spoon
     result  +=str.charAt(str.length()-1);// basına  result + = dediğimizde resulta buformulu atayoruz. Yani formulun
     //karşılıgı olan " n" atıryouz   bir nevi result =n oldu n= charart  olarak =11 yani result 11
       // result+=str.charAt(11);// n  bu harf olarak n ye eşit
        //result+=str.charAt(10);//o
        //result+=str.charAt(9);//o
        //result+=str.charAt(8);//p böy her sefirini tek tek yazamak yerine forloop yapacaz
       // result+=str.charAt(7);//S
       // result+=str.charAt(6);// " "
        for (int i = str.length()-1; i >=0 ; i--) {// i suan  11 biri  yani indeks numberı temsil ediyor
            result +=str.charAt(i);
        }
        System.out.println("result = " + result);
        System.out.println(" --------------------------------------");
        String as="bu işi ögrenmekten baska çarem yok";
        String bu="";
        for (int i = as.length()-1; i >=0 ; i--) {
            bu +=as.charAt(i);

        }
        System.out.println("bu = " + bu);


        String ters="koy meraç aksab netkemnergö işi ub";
        String de="";
        for (int i = ters.length()-1; i >= 0; i--) {
            de +=ters.charAt(i);

        }
        System.out.println("de = " + de);
        }

    }

