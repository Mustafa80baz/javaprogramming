package Day13Practise1;
import java.util.Scanner;
public class UzunOlanCumletıYazdır {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a cumle");
        String cm1= scan.nextLine();
        System.out.println("Enter a cumle again");;
        String cm2= scan.nextLine();
        int cma=cm1.length()-1;
        int cmb=cm2.length()-1;
        if (cma>cmb){
            System.out.println(cm1);

        } else if (cmb>cma) {
            System.out.println(cm2);
        }else{

            System.out.println("eşitler");

        }
scan.close();
    }
    }
