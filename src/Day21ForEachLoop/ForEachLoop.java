package Day21ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50,60,70,80};
        for (int i = 0; i < numbers.length; i++) {//for i ile yapama önceki hali i=index of array
            int eachelement=numbers[i];
            System.out.print( eachelement);
        }
        System.out.println();
        System.out.println("-----------for each loop la yazdırma-------------");
        for (int each:numbers){
            System.out.print(" "+ each);
        }
        
        
    }
    
}
