package Day25CustomMethot_overLoading;

import java.util.Arrays;

public class AddChar {
    public static void main(String[] args) {
        char [] ch={'A','B','C','G'};
        ch=addchar(ch,'K');
        System.out.println(Arrays.toString(ch));
    }

    public static char[]addchar(char[]array,char element){
        char []result=new char[array.length+1];
        int i=0;
        for (char each:array) {
            result[i++]=each;


        }
        result[i]=element;
        return result;
    }



    }


