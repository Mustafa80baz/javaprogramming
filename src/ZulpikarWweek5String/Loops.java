package ZulpikarWweek5String;

public class Loops {
    public static void main(String[] args) {
        //count from 0 to 10

        for (int i = 0; i <11 ; i++) {// i 11 den kucuk se calış bir artır takii 11 den kucuk olamyı gecene kadar
            System.out.print(i) ;
            System.out.println("-------------------------");
            //birden 10 na kadar olan dogal sayıları topla

            int sum=0;
            for (int j = 1; j <=10; j++) {//dogal sayılarda 0 yoktur
                sum+=j;
            }
            System.out.println(sum);

        }
    }
}