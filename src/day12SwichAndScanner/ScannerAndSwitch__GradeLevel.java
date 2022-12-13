package day12SwichAndScanner;

public class ScannerAndSwitch__GradeLevel {
    /*Ceate a class called GradeLevel ,given a number (byte) grade level determine and print which number type someone is in.
    grade level and types are;
    1-5 :Elementry   6-8:Middele number   9-12:Hight number  13-16 :college  17-8:Grad number
    for any other garde :invalid gradelevel given
    note:
    solution 1:use switch statement
    solution  2:use if and switch both

     */

    public static void main(String[] args) {
      byte number=10;

        String result="";


            if ((number >= 1 && number <= 18)){

                switch (number){
                case 1:case 2:case 3: case 4: case 5:
                   result=("Elementry");
                    break;
                case 6: case 7: case 8:
                    result =("Middle school");
                    break;
                case  9: case 10: case 11: case 12:
                   result=("high school");
                    break;
                case 13: case 14: case 15: case 16:
                  result=("coolege");
                    break;
                default:
                    result=("grad school");
            }


        }else {

                result="invalid";
            }

        System.out.println(result);
    }

}






