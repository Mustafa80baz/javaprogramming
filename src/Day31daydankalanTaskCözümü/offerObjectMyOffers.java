package Day31daydankalanTaskCözümü;

import java.util.ArrayList;
import java.util.Arrays;

public class offerObjectMyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon","Sdet",45000,true,true,true,true);
        Offer offer2=new Offer();
        offer2.setInfo("CA","Sony","QA",12000,true,false,true,false);
        Offer offer3=new Offer();
        offer3.setInfo("Nevada","Apple","Engineer",230000, true,true,false,true);

Offer offer4=new Offer();
offer4.setInfo("Florida","Nj","press",3400,true,true,false,false);
        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer4 = " + offer4);
        Offer []myOffers={offer1,offer2,offer3,offer4};//arraya aldık şimdi arrayliste almamız lazım
        System.out.println(Arrays.toString(myOffers));
        ArrayList<Offer>fulltimesOffers=new ArrayList<>(Arrays.asList(myOffers));
        fulltimesOffers.removeIf(p-> !p.isFulltime);//fulltime olmayanları removes
        System.out.println("fulltimesOffers = " + fulltimesOffers.size());

ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));


localOffers.removeIf(p-> !(p.location.equals("VA") || p.location.equals("Nevada")));//VA dan olmayanları removes
        System.out.println("localOffers = " + localOffers.size());

        for (Offer localOffer : localOffers) {//her offerı tek tek ınceler

            
        }





    }
}
