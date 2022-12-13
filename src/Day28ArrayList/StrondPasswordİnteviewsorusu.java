package Day28ArrayList;

public class StrondPasswordİnteviewsorusu {
    public static void main(String[] args) {
        String pasword="Cydeo1990@";//aşagıdakı şartlara göre bir password
        boolean r1=pasword.length()>=8 &&  !pasword.contains(" ");
        boolean r2=false;//temp verialbel//Haqs upper case
        boolean r3=false;//has lower case
        boolean r4=false;//has special char
        boolean r5=false;//has digit
        char []chars=pasword.toCharArray();//each char ı böylece elde edip for each loop kurabiliriz
        for (char each  : chars) {
            if (Character.isUpperCase(each)){
                r2=true;
            } else if (Character.isLowerCase(each)) {
                r3=true;
            } else if (Character.isDigit(each)) {
                r5=true;
            }else{// special character
                r4=true;

        }

        }
boolean İsStarongPassword=r1 && r2 && r3 && r4 && r5;
        System.out.println("İsStarongPassword = " + İsStarongPassword);
    }

    /*
    Write a program that can  verify if apassword is a strong pasword.charecteristic of a password
    paswors must be at least have 8 characers long and should not contain space
    paswors must be at least contain one uppercase letter
    paswors must be at least contain one lower letter
    password should at least contain one special character
    paswors must be at least contain one digit character
     */


    //cotum Methodla yapama
    public static boolean isStarongpasswor(String pasword){

        boolean r1=pasword.length()>=8 &&  !pasword.contains(" ");
        boolean r2=false;//temp verialbel//Haqs upper case
        boolean r3=false;//has lower case
        boolean r4=false;//has special char
        boolean r5=false;//has digit
        char []chars=pasword.toCharArray();//each char ı böylece elde edip for each loop kurabiliriz
        for (char each  : chars) {
            if (Character.isUpperCase(each)){
                r2=true;
            } else if (Character.isLowerCase(each)) {
                r3=true;
            } else if (Character.isDigit(each)) {
                r5=true;
            }else{// special character
                r4=true;

            }
    }
        boolean İsStarongPassword=r1 && r2 && r3 && r4 && r5;
        return İsStarongPassword;
}
}