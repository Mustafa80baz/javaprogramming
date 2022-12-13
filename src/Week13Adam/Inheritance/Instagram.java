package Week13Adam.Inheritance;

public class Instagram extends MobileApp {

    public Instagram( double version) {
        super("Intagram", version);
    }
    public void postPhoto(){
        System.out.println("the user is posting photo");

    }

}
