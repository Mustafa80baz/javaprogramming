package weekday09IfDevam;

public class switchSay {
    public static void main(String[] args) {


        int number=9; // print the day of number
        String gun;

        if (number >=1  && number<=7){
            switch (number){

                case 1:
                    System.out.println("pazratesi");
                    break;
                case 2:
                    System.out.println("salı");
                    break;

                case 3:
                    System.out.println("çarşamba");
                    break;

                case 4:
                    System.out.println("Perşembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;

                case 6:
                    System.out.println("Cumaertesi");
                    break;

                default:
                    System.out.println("Pazar");

            }


        }else{
            System.out.println("böyle gün yok");
        }

       }


    }
