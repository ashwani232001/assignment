package String;

public class StringAssi {
    public static void main(String[] args) {
        String str = "Welcome to Java World";
        String str1 = "Welcome";
        String str2 = " Let us learn";
        System.out.println("char at 5th position "+str.charAt(4));
        System.out.println("compare the to strings ");
        if (str1.compareTo(str)>0){
            System.out.println("equal");
        }
        else {
            System.out.println("unequal");
        }
        System.out.println("concate the 2 strings "+str.concat(str2));
        System.out.println("position of first 'a' "+str.charAt(12));
        System.out.println("substring between 4th position to 10th position "+str.substring(4,11));
        System.out.println("relacement of char 'a' to 'e': "+str.replace('a','e'));
        System.out.println("Lower case of string "+str.toLowerCase());
    }
}
