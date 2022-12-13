package day17While_DoWhileLoop;

public class KelimeKackereGeciyor {
    public static void main(String[] args) {
        //Writ a prog. that can retun the freq of the word java from teh sentence  / java kac kere geçiyor
       String sentece="JavaJavaJavaJavaJava";
       //String str="Java ";// javayı kac kere getiğini bulacaz
       int frequency=0;
        for (int i = 0; i <= sentece.length()-4; i++) {
            String each=sentece.substring(i,i+4);
            //System.out.println("each = " + each);
            if (each.equals("Java")){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
        System.out.println("--------------------");
     String ö="erer er er  er erer";
     int er=0;
        for (int i = 0; i <ö.length()-2 ; i++) {
            String eri=ö.substring(i,i+2);
            if (eri.equalsIgnoreCase("er")){
                er ++;


        }
            }

        System.out.println("er = " + er);
        }





}