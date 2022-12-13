package day16ForAndLoop;

public class FindingUniqs {
    public static void main(String[] args) {
        //Write a prograsm that can return the unique chareacters from String
        // input =  AABCCD   output=BD indexof ve lastindexof kullan
        //çok önemli  indexof('A') ==> 0 yanı harf numarası 0   indexof'B'=2   lastIndexOf 'B'== 2 başka yok çünki
        // lastIndexof('A') ==> 1 cünki 2 sırada ve başka a yok
        String str="aaabccc";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            System.out.println("ch = " + ch);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result +=ch;
            }
        }
                System.out.println("result = " + result) ;
            }

        }

   // }
//}
