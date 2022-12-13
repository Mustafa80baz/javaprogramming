package DaycumaertesiNestedLoop;

public class Task2replacement {
    public static void main(String[] args) {
        String word="I love cats! ı lhave a cat named coco.My cat's very smart";
      //  System.out.println(word.replace("cat","dog"));;


        //bunu birde indexof ve substringle cözecez
       String search="cat";
       String change="dog";
       String result="";
       int birincicat=word.indexOf("cat");
        System.out.println("birinci :" +birincicat);
      //  System.out.println("indxoffirtscat: " +indexoffirstcat);
      //  System.out.println("endofword");

// buraya kadar birinci cat i buldu
        while (word.contains("cat")){

            int indexoffirstcat=word.indexOf(search);
            int endofword=indexoffirstcat+search.length();
            word = word.substring(indexoffirstcat,indexoffirstcat+search.length());

        }

        System.out.println( word);







       }
    }

