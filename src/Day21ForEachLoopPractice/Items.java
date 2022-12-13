package Day21ForEachLoopPractice;

public class Items {
    public static void main(String[] args) {
        String  items[]={"Shoes","Jakets","Gloves","Airpods", "ipad","  iphone 12 case"};
        //                 0         1       2       3           4          5
        double []prices={99.99,   150.0,   9.99,      250.0,   439.50,     39.99};
        //                 0         1       2       3           4          5
        int []itemID   ={12345,   12346,  12347,       12348,  12349,      123450};
        //                 0         1       2       3           4          5

        //hepsinde aynı sayıda index nurası 0-5 oldugundan tek loopla hallettik

        for (int i = 0; i < items.length ; i++) {
            String item=items[i];;
            double price=prices[i];
            int itemId=itemID[i];
            System.out.println(item+" - "+itemId+" - $ "+price);

        }




    }
}
