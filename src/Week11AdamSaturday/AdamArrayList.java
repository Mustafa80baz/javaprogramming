package Week11AdamSaturday;

import java.util.ArrayList;

public class AdamArrayList {
    public static void main(String[] args) {
        //how to creat  an ArrayList
        ArrayList<String>cities=new ArrayList<>();
        //how to add element in it
        cities.add("Londan");
        cities.add("Paris");
        cities.add("İstanbul");
        cities.add("Roma");
        System.out.println("cities = " + cities);
//how to add one element at the beginning
        cities .add(1,"Vieanna");
        System.out.println("cities = " + cities);
        // how to get element
        cities.get(0);//ilk elementi alaır  hangi elemnet nosunu yazarsan onu verir.
        System.out.println(cities.get(0));
        //how to update array list
       cities.set(2, "Osmaniye");//returning element which you abddate/set metod returns String
        System.out.println("cities 2= " + cities);
        cities.set(3,"Angara");
        System.out.println("cities 3= " + cities);
        //how to learn index of element or position of element
        cities.indexOf("Osmaniye");
        System.out.println( cities.indexOf("Osmaniye"));;// olamayan bir elementi cagırdıgında it retun -1
        //last indexof
        System.out.println(cities.lastIndexOf("Londan"));
        cities.add("Londan");
        cities.add("Monravia");
        cities.add("Siereleone");
        System.out.println("cities 5= " + cities);
        System.out.println(cities.indexOf("Londan"));//starts cek form beginning
        System.out.println(cities.set(3,"Londan"));//it statrts the check from last
        System.out.println("cities = " + cities);
        System.out.println(cities.indexOf("Londan"));
        System.out.println(cities.lastIndexOf("Londan"));


    }


}
