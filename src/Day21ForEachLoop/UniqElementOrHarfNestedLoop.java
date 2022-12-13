package Day21ForEachLoop;

public class UniqElementOrHarfNestedLoop {
    public static void main(String[] args) {
        String []word={"Layan" ,"Layan","Oleksandr","Olga","Adam","Adam","Adam","Cihad","Cihad","Cydeo"};
        for (String each : word) {
            int count=0;
          for (String element:word){//Layan ın kac kere gectiğini bulur
              if (element.equals(each)){
                  count++;
              }

            }
          if (count==1){
              System.out.println(each);
          }

        }



    }
}
