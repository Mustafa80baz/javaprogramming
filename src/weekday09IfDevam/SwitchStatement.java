package weekday09IfDevam;

public class SwitchStatement {
    public static void main(String[] args) {
                int number=9; // print the name of day
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Tursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sundayday");
                break;
            case 7:
                System.out.println("Mondayday");
                break;

            default:
                System.out.println("Sallama böyle bir gün yok salak");
                System.out.println("------------------------------");
                break;
        }

        int t=5;
        if (t>=1 && t<=5){
            switch (t){
                case 1:
                    System.out.println("sen haklısın");
                    break;

                case 2:
                    System.out.println("ben haklıyım");
                    break;
                default:
                    System.out.println("ikimiz de haksızız");

            }

        }
        System.out.println("-----------------------------");


           int as =2;
        switch (as){
            case 1:
                System.out.println("Mustafa BAZ");
                break;
            case 2:
                System.out.println(" Seviyorum len seni  Fatma BAZ");
                break;
            case 3:
                System.out.println("NUman haklı");
                break;
            case 4:
                System.out.println("Salih");
                break;
            case 5:
                System.out.println("Nihal");
                break;
            default:
                System.out.println("Bu  aileden Değil");



        }


    }



}
