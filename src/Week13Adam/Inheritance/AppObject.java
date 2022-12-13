package Week13Adam.Inheritance;

public class AppObject {
    public static void main(String[] args) {
        Instagram instagram=new Instagram(5.6);
        System.out.println(instagram);
        instagram.postPhoto();
        instagram.useTheApp(20);
    }
}
