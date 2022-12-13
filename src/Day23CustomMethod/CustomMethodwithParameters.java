package Day23CustomMethod;

public class CustomMethodwithParameters {
    public static void main(String[] args) {
oddOrEven(3);//ir need addtional info
        ageOfPerson( 1995);
        IsEligible(23);
        printnumbers(20,30);
    }
    //create a function that can checek if  number is odd or even
    public static void oddOrEven(int number){
      if (number%2==0){
          System.out.println(number+" is even number");
      }else {
          System.out.println(number+" is odd number");
      }
    }

//create a function that can display the age of person
    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("Yor age is "+age);

        //create a function if someone eligible to buy cigarette or not
            }

public static void IsEligible(int eligibler){

        if (eligibler>18){
            System.out.println("You are eligible");
        }else {
            System.out.println("Buyu de gel");
        }
}


//create a function that can print all the numbers between X and Y
     public static void printnumbers(int X,int Y){
        // System.out.println(printnumbers(20,30)
     }
    }
