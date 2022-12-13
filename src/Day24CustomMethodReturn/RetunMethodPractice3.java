package Day24CustomMethodReturn;

public class RetunMethodPractice3 {
    public static void main(String[] args) {
        //find the uniq caracter from teh string

        String str="aabccdee";
        for (int i = 0; i <str.length() ; i++) {

            int frequency=frequency(str, str.charAt(i));
            if (frequency==1){
                System.out.println(str.charAt(i));
            }
        }


    }

    public static int frequency(String str,char ch){
        int count=0;

        for (char each : str.toCharArray()) {
            if (each==ch){
                count++;
            
        }

        }
        return  count;
    }

}

