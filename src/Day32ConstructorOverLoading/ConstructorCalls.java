package Day32ConstructorOverLoading;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default Cunstructor");
    }
    public ConstructorCalls(int a){
        this();//prnt de  yine default constructer u yazdırır
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructorCalls obj1=new ConstructorCalls();
        System.out.println("---------------------");

        ConstructorCalls objt2=new ConstructorCalls(10);
        System.out.println("-----------------------------------");
        ConstructorCalls objt3=new ConstructorCalls("java");


    }
}
