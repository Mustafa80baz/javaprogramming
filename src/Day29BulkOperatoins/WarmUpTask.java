package Day29BulkOperatoins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {
        // write a prog that can swap the first and last element of arrayList
        ArrayList<Integer>number=new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("number = " + number);
        Collections.swap(number,0,number.size()-1);
        System.out.println("number = " + number);

        //write a program that can remove all zero from the Arraylist
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println("list = " + list);
        int size= list.size();
        list.removeAll(Arrays.asList(0));//bütün 0 ları sil
        System.out.println(list);
        int newSize =list.size();// su ankı size bulup kac sıfır sildik onubulacaz
        int totalzero=size-newSize;
        System.out.println("totalzero = " + totalzero);

        for (int i = 0; i <totalzero ; i++) {//litenin sonuna 0 ları eklemek için
            list.add(0);
        }
        System.out.println(list);


        System.out.println("--------------ikinci yolu---");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer>result=new ArrayList<>();
        System.out.println("list2 = " + list2);
        for (Integer each : list2) {
            if (each!=0){//0 ları atar
                result.add(each);

        }
        }
        for (Integer each : list2) {
                    if (each==0){
                        result.add(each);
            }

        }
        System.out.println("result = " + result);
        System.out.println("----------3.task--------------------");
        //Write a rprogrram taht can extract the special charters ,digit and letters from a strinf and stores them in to sepate Arraylist

        String  str="ABCD123$%#&456EFG!";//normal String
        ArrayList<Character>chars=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));

        }
        ArrayList<Character>letters=new ArrayList<>(chars);//add all karakters
        System.out.println("letters = " + letters);
        letters.removeIf(p-> !Character.isLetter(p));////harf dısındakıleri at

        ArrayList<Character>digit=new ArrayList<>(chars);
        digit.removeIf(p->!Character.isDigit(p));
        System.out.println("digit = " + digit);

        ArrayList<Character>specialChar=new ArrayList<>(chars);//special karakter böyle bulunur
        specialChar.removeAll(letters);
        specialChar.removeAll(digit);
        System.out.println("specialChar = " + specialChar);








        }


    }

