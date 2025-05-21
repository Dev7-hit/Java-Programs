package Practise;
import java.util.Scanner;
public class VowelConsonantCounter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine().toLowerCase();
        String vowels="aeiou";
        int vowelcount=0;
        int consonantcount=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(Character.isLetter(ch)) {
                if (vowels.contains(String.valueOf(ch))) {
                    vowelcount += 1;
                } else {
                    consonantcount += 1;
                }
            }
        }
        System.out.println(vowelcount);
        System.out.println(consonantcount);
    }
}
