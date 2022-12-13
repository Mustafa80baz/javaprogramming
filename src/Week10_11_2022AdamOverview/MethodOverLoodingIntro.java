package Week10_11_2022AdamOverview;

public class MethodOverLoodingIntro {
    public static void main(String[] args) {
        //add two number
        int a=23;
        double b=24.5;
        float c=23.5f;
        sum(a,b);
    }
//we cant use method  over loadıng
public static void sum(float c,double b){

}

    public static int sum(int a,double b){
    return 0;
}
}