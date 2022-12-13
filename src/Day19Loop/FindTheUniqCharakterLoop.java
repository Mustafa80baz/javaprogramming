package Day19Loop;

public class FindTheUniqCharakterLoop {
    public static void main(String[] args) {
        //eger bır harfin baştan ve sondan indexof ları birbirine eiştse o harf uniq dir
        //indexof  ve last indexof u kullanmadan unıq bulma

        String str="aaabcccicsdeef";//unuıq olanı bul
    String result="";

        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);

            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;

        }



        }
        System.out.println(result);
        }



}

      /*  for (int i = 0; i <str.length() ; i++) {//sıfırdan balıyor
            char ch=str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){ //eger eşitse
                result +=ch;
            }


        }
        System.out.println("result = " + result);

       */



