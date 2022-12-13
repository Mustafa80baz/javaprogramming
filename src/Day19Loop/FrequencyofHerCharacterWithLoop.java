package Day19Loop;

public class FrequencyofHerCharacterWithLoop {
    public static void main(String[] args) {
        //Write a prog that can find the frequency of the characters from string
        //str="aabcccd"   ourput=a2b1c3d1  olsun
        String str="aabcccdeef ";
        String result="";
        int count=0;
        char ch=str.charAt(0);
        for (int i = 0; i <str.length() ; i++) {
            char each =str.charAt(i);

            if (each==ch){
                count++;
            }

        }
        System.out.println("a: "+count);
    }

}

