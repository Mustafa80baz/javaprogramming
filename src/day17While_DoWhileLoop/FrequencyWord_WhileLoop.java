package day17While_DoWhileLoop;

public class FrequencyWord_WhileLoop {
    public static void main(String[] args) {
        String str="Java Java Python Python";
        int frequency=0;

while (str.contains("Java")){
   str= str.replaceFirst("Java","");
   frequency ++;

}

        System.out.println( frequency);
        System.out.println("-------------------------------");


        String as="cat CAt Cat dog DOg";
       as= as.toLowerCase();
  int count=0;

  while (as.contains("cat")){
      as=as.replaceFirst("cat","");
           count ++;

        }
        System.out.println(count);
    }

}


      /*

        for (int i = 0; i < str.length()-3; i++) {

             String eachsub=str.substring(i,i+4);
             if (eachsub.equals("Java")){
                 frequency ++;
                   System.out.println("frequency = " + frequency);
       */



