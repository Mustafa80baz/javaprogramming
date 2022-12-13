package day16ForAndLoop;

public class RemoveDublicates {
    public static void main(String[] args) {
     // write a prog. taht can remove the dublicates from string   like AABBaaCC

     String str="aabbaacc";
     String result ="";// abc resultın içinde olmayanları buraya ekleyeceğiz
      int str1=str.length();
        System.out.println("str1 = " + str1);
        for (int i = 0; i <=7 ; i+=2) {
            String ch=""+str.charAt(i);
            if (!result.contains(ch)){
                result +=ch;
            }
        }
        System.out.println("result = " + result);
    }
}


/*

     String str="aabbaacc";
     String result ="";// resultın içinde olmayanları buraya ekleyeceğiz
        for (int i =0 ; i <=str.length()-1 ; i++) {// less then kullanırsan length 8// index numbero veriri 0 dan başlar
        String ch  ="" +str.charAt(i);// harfleri almak için sonra bunları reslta ekleyeceğiz
    if(!result.contains(ch));{// eger if ch( yani harf) içermiyorsa Calış
                result +=ch;//result a  harfleri ekle diyoruz

        }
        System.out.println("result = " + result);
    }
 */