package Day37InheritanceSuperKeyword.Inheritance;
class A{
    public A(int a){//A nın içinde bir parameter varsa Spuer()  B nın ,
        System.out.println("A");
    }
//parent class parameter  varsa default değilse child class a super () key yaz
}
class B extends A{
   public B (){
       super(9);//buraya bunu  manuelly biz yazacaz
       System.out.println("B");


    }
}
public class ConstructorPractice {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println( obj);
    }

}
