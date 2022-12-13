package Day28ArrayList;

public class StrongPassword2Countla {
    public static void main(String[] args) {
        String pasword="cLdeo1990@";
        int countUppercase=0;
        int countLowerCase=0;
        int countDigit=0;
        int countSpecialChar=0;
        for (int i = 0; i <pasword.length() ; i++) {//indexlerini alarak
            char each=pasword.charAt(i);//her karakterin indexini cağırdık
            if (Character.isUpperCase(each)){
                countUppercase ++;
            } else if (Character.isLowerCase(each)) {
                        countLowerCase++;

            } else if (Character.isDigit(each)) {
                countDigit++;

            }else {
                countSpecialChar++;
            }

        }
       /* System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUppercase = " + countUppercase);
        System.out.println("countDigit = " + countDigit);
        System.out.println("countSpecialChar = " + countSpecialChar);

        */
        boolean hasUppercase=countUppercase>0;
        boolean hasLowercase=countLowerCase>0;
        boolean hasDigitCase=countDigit>0;
        boolean hasSpecialCase=countSpecialChar>0;
        boolean strongPassword=pasword.length()>=0 &&!pasword.contains(" ")  && hasSpecialCase && hasDigitCase &&
                hasLowercase && hasUppercase;

        System.out.println("strongPassword = " + strongPassword);
    }
}
