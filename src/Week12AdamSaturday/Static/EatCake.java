package Week12AdamSaturday.Static;

public class EatCake {
    public  static int totalSlices=10;

    public  void eatCake(int eatSlice){
        totalSlices-=eatSlice;
        System.out.println("Remainning slice: "+totalSlices);
    }
}
