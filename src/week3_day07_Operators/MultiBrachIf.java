package week3_day07_Operators;

public class MultiBrachIf {
    public static void main(String[] args) {
        //makes decision among sevearal alternatives
 /*
if(condition1){
statement
}else  if (contdion2){
statement
}else{
    statement
}


    }
}


  */
    int a=-100;
    if(a>0){

        System.out.println("a is positive");
            }else if(a<0){
        System.out.println("a is negative " );
    }else{

    }

        System.out.println("-------------");

        int not=45;
        char grade;   //A,B,C,D,F

        if(not>=90){
            grade='A';
            System.out.println("A");
        } else if ( not >=80) {
            grade='B';
                        System.out.println("B");

        } else if (not>=70) {
            grade='C';
            System.out.println(grade);
            
        }else if(not>=60){
            grade='D';
            System.out.println("D");
    } else{
            System.out.println("Notları\"Yetersiz\" sınıfta kaldı");
        }

        System.out.println("------------------------------");




    }
}

