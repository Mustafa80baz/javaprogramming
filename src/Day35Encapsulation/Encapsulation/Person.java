package Day35Encapsulation.Encapsulation;

public class Person {

    private   String name;//bunu başka yerde kullanamzsın kullanmak için public yapıyoruz
        private int age;


        public String getName(){//bölece name herden girebiliriz.. get
            return  name;

        }
        public void  setName(String name){//set i void la yapıtoyurz

this.name=name;
        }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
            if (age<=0 ||age>139){
                System.err.println("Invalid age"+age);
                System.exit(0);
            }

            this.age=age;
    }
}
