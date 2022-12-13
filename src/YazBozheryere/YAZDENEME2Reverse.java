package YazBozheryere;

public class YAZDENEME2Reverse {
    public static void main(String[] args) {
      String a="amazon";
      String reverse="";
        for (int i = a.length()-1; i >=0 ; i--) {
            if (i==0){
                System.out.println(a.charAt(i));
            }
            else {
                System.out.print(a.charAt(i) + "-");
            }
        }

        }


    }

