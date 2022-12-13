package Day21ArrayMetods;

import java.util.Arrays;

public class CopyOfMetghod {
    public static void main(String[] args) {
        String [] student={"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String []kusiyer= Arrays.copyOf(student,3);//kacını kopya edeceksen numrasıyı ona göre yaz
        System.out.println(Arrays.toString(kusiyer));
        System.out.println("-----syılarla yapma--------");

        int [] numbers={1,2,3,4,5,6,7,8,9,0};
      numbers=Arrays.copyOf(numbers,4);
        System.out.println(Arrays.toString(numbers));




    }
}
