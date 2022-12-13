package Day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UpperCaseBaşlayanlarıRemove {
    public static void main(String[] args) {
        String [] names={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
        //buyuk 'M' Harfle başlayanları remove.. Önce array liste cevirecez.Arrayda removeAll yok
        ArrayList<String>remoc=new ArrayList<>(Arrays.asList(names));
        System.out.println("remoc = " + remoc);
        remoc.removeIf(p->p.charAt(0)=='M');
        System.out.println("remoc = " + remoc);
        //tekrar arraya cevirelim
        names=remoc.toArray(remoc.toArray(new String[0]));
        System.out.println(Arrays.toString(names));
    }
}
