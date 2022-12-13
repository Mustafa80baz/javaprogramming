package Day19Loop;

public class ExitSystemMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i==3){
                //break;// 3 e kadar yzdırır durur loop u terminate eder yani loop tan cıkar  wooden u yazdırır
                //continue;// 3 ü atlar yazmaya devam eder  wooden u da yazdırı
                System.exit(0);//calışırsa herşeyi durdur  i=3 e eşit oldugunda wooden u yazdırmaz hata olmadıgını da gösteriri
            }
            System.out.println("i = " + i);
        }
        System.out.println("wooden");
    }
}
