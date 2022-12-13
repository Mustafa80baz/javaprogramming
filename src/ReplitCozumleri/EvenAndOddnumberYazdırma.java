package ReplitCozumleri;

public class EvenAndOddnumberYazdırma {
    public static void main(String[] args) {

        String evenStr = "";
        String oddStr = "";
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                if (i == 20) {
                    evenStr = evenStr + i;
                } else {
                    evenStr = evenStr + i + " ";
                }

            } else if (i % 2 != 0) {
                if (i == 19) {
                    oddStr = oddStr + i;
                } else {
                    oddStr = oddStr + i + " ";
                }
            }

        }
        System.out.println(evenStr);
        System.out.println(oddStr);

    }

    }

