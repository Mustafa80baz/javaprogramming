package day17While_DoWhileLoop;

public class FrequencyOfCharacterHarfKackereGeçiyor {
    public static void main(String[] args) {
        //Write a prog. taht can return the frequency of a char from String
        //Ex: str="AAABBBC" ch='A'  out put=3  formululunu yaz//A kackere tekrar etmiş
        //önce bütün karakterleri alacaz
        String str ="AAABBBCAA";
        char ch='A';// yazıda aranacak harf
        int frequency=0;// kackere gecti ..sayı olacagından her zaman int
        for (int i = 0; i <str.length() ; i++) {
            char eachChar= str.charAt(i);//yazının butun harflerini temsil eder  ecchchar=AAABBBC demek
            //'A'=='A' bu eşitlik 5 kere tekrar ediyor eşitlik bozulunca tekrar durur
            if (ch==eachChar){//verilen char yani('A') yazının içinde geçiyorsa frequency 1 artır
        frequency ++; //frequency+=+1 eşittir   //if ifadesi kac kere  dogrulanırsa (ki 5 kere burda) o kadar frequncy bir bir artır.
        }
    }
        System.out.println("frequency = " + frequency);
        System.out.println("--------------------------");
String nm="Mnenemegeldem";
int say=0;
char chr='e';
        for (int i = 0; i < nm.length(); i++) {
         char  herf=nm.charAt(i);
         if (chr==herf){
             say ++;
         }

        }
        System.out.println(say);

            }
        }


