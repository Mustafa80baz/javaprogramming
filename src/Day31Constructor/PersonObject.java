package Day31Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObject {
    public static void main(String[] args) {
       Person person1=new Person("Daniel",'M',32);

       Person person2=new Person("mustafa",'F',45);
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        //Offer[]myOffers={offer1,offer2,offer3,offer4};
        Person[]myperson={person1,person2};
        System.out.println(Arrays.toString(myperson));
        //ArrayList<Offer> fulltimesOffers=new ArrayList<>(Arrays.asList(myOffers));
        ArrayList<Person>genderM=new ArrayList<>(Arrays.asList(myperson));
        genderM.removeIf(p-> !(p.equals("M")));
        System.out.println(genderM.size());
    }
}
