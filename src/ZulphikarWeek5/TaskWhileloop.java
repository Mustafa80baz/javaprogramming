package ZulphikarWeek5;

public class TaskWhileloop {
    public static void main(String[] args) {
three();
four();
fife5();

    }

    public static void two(){

        int count=100;

    }
    public static void three(){
        int i=1;
        do{
            if (i%2==0)
                System.out.println(" "+i);
            i++;
        }while (i<11);

    }
public static void four(){
    for (int i = 1; i <50 ; i++) {
        if (i%5!=0){//i 5 tam bölünemdinde atla
           continue;
        }
        System.out.print(" "+i);
    }
    System.out.println();
}

public static void fife5(){
      String dat ="";
      String str="abcdefkjkwsgopkaşrılapzaa";
      String result="";
    for (int i = 0; i <str.length() ; i++) {
        char ch=str.charAt(i);
        if (ch=='a'||ch=='e' || ch =='u' ||ch =='i' || ch=='o'){
            result+=ch;
        }

    }

    System.out.println(result);

    }


    //while loop password checker,3 guess

}


