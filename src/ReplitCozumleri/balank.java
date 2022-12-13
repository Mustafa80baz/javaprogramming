package ReplitCozumleri;

import java.util.Scanner;

public class balank {
    public static void main(String[] args) {
        /*
        ### Use `String methods` to check if the given `word` starts with the letter `a` and ends with the letter `e`.
       Print two boolean values to represent each:
> Starts with a: $boolean
> Ends with e: $boolean
Main topics: String manipulation, Scanner, methods, primitive datatypes
```         */
        Scanner input = new Scanner(System.in);
        String status = input.nextLine();
switch (status){
    case "200":
        System.out.println("OK");
        break;
    case "201":
        System.out.println("Created");
        break;
    case "202":
        System.out.println("Accepted");
        break;
    case "307 ":
        System.out.println("Temporary Redirect");
        break;
    case "400":
        System.out.println("Bad Request");
        break;
    case "401 ":
        System.out.println(" Unauthorized");
        break;
    case "403":
        System.out.println("Forbidden");
        break;
    case "404":
        System.out.println("Not Found");
        break;
    case "410":
        System.out.println("Gone");
        break;
    case "500":
        System.out.println("Internal Server Error");
        break;
    case "303":
        System.out.println("Service Unavailable");
        break;

    default:
        System.out.println("Not a valid version");






}

    }

}
