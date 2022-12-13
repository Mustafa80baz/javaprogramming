package DaycumaertesiNestedLoop;

public class Task3İntervievQıestion {
    public static void main(String[] args) {
        /*
        Task 3: Count each name in sentence.
      input :
  String names = "Adam Adam Barry Aysun Aysun";
    output:
    Adam-2 Barry-1 Aysun-2
         */

        String cumle="Adam Adam Barry Aysun Aysun";
        String word="Adam";
        int count=0;
        for (int i = 0; i <=cumle.length()-4; i++) {
            String bul=cumle.substring(i,i+4);

            if (bul=="Adam"){
                count ++;

            }

        }
        System.out.print(count);






    }
}
