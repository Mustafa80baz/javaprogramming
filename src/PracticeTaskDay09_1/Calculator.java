package PracticeTaskDay09_1;

public class Calculator {
    public static void main(String[] args) {
/*
2. Create a class called Calculator, Given two double variables named n1
& n2, and a char variable named mathOperator, write a program that can
calculate result of n1&n2 based on the given math Operator.
char operator -> -, +, *, /
when operator is + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
for any other operators: print "invalid operator"
Ex:
n1 = 10, n2= 20, mathOperator = '+'
output:
30

 */
         double n1=200.5;
         double n2=10.8;

        char operator='+';

        boolean valid =operator=='+'  || operator =='-' || operator =='*' || operator=='/';

         if(valid){// yani operator + -/ * ise doğru

             switch (operator){
                 case '+':
                     System.out.println(n1+n2);
                     break;
                 case'_':
                     System.out.println(n1-n2);
                     break;
                 case'*':
                     System.out.println(n1*n2);
                 default:
                     System.out.println(n1/n2);

             }



        }else{
            System.err.println("yanlış");
        }

    }
}