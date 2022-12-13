package Day37InheritanceSuperKeyword.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone1=new Iphone("IPHONE 12 PRO","6,7 inches",1000,"black");
       // iphone1.faceTime(long phoneNumber);

        Samsung samsung=new Samsung("galaxy","4 inches",50,"white");
        Nokıa nokıa=new Nokıa("Brick","4 inches",67,"black");
        System.out.println("iphone1 = " + iphone1);
        System.out.println("samsung = " + samsung);
        System.out.println("nokıa = " + nokıa);

        iphone1.call(911);
        iphone1.text(1232435);
        iphone1.faceTime("yahoo.@gmail");
        iphone1.faceTime(2362748);
        System.out.println("---------------------------------");
        samsung.call(834);
        samsung.text(8746235);
        samsung.freeze();
        System.out.println("------------------------");
        nokıa.call(87454763);
        nokıa.text(834866323);
        nokıa.selfDefence();



    }
}
