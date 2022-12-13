package Day19Loop;

public class UniqIndexOlmadan {
    public static void main(String[] args) {
        //indexof metodunu kullanmadan unıq bulma
        String str="aabccdeef";
        String result="";
        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            int count=0;
            for (int i = 0; i < str.length() ; i++) {
                char each =str.charAt(i);
                if (each==ch){
                    count ++ ;
        }
            }
         //   if (count==1){// 1.yolu bir kere geciyorsa bu harf uniq
            //    result+=ch;

            if (count!=1){//ikinci yolu
                continue;
            }
result+=ch;

        }
        System.out.println(result);

    }
}
