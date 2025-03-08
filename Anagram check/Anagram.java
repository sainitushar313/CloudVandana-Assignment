import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean itisAnagram(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        
        if(str1.length() != str2.length()){
            return false;
        }
        
        char[] chArr1=str1.toCharArray();
        char[] chArr2=str2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        
        return Arrays.equals(chArr1,chArr2);
    }
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 =scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 =scanner.nextLine();
        
        if(itisAnagram(str1,str2)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        scanner.close();
    }
}
