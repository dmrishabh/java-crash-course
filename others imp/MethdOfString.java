
public class MethdOfString {

    public static void main(String[] args) {

        String string = "Hello my name is niyati gupta stella";
        String string2 = " I live in lucknow";
        String string3 = " and I'll be a programmer";

        // * The following String class methods are to be
        // * covered:
        // * String trim ()

        // System.out.println("without using trim method " + string);
        // System.out.println("with using trim method " + string.trim());

        // * String toLowerCase()
        // * String toUpperCase()

        System.out.println("Normal                 -> " + string);
        System.out.println("With using toLowercase -> " + string.toLowerCase());
        System.out.println("With using toUppercase -> " + string.toUpperCase());

        // * int length( )

        System.out.println(string.length());

        // * char charAt (int n)

        System.out.println(string.charAt(10));

        // * int indexOf(char ch)
        System.out.println(string.indexOf('y'));

        // * int lastIndexOf(char ch)
        System.out.println(string.lastIndexOf('y'));
        // * String concat(String str)

        System.out.println("ORIGINAL          ============> " + string);
        String cString = string.concat(string2);
        System.out.println("String  + String2 ============> " + cString);
        System.out.println("cString + String3 ============> " + cString.concat(string3));

        // * boolean equals (String str)

        String SameString = "Hello my name is Niyati Gupta Stella";

        System.out.println(string.equals(SameString));

        // * boolean equalsIgnoreCase(String str)

        System.out.println(string.equalsIgnoreCase(SameString));

        // * int compareTo(String str)

        String str1 = "hello";
        String str2 = "hello";
        String str3 = "Mello";
        String str4 = "Aello";

        System.out.println(str1.compareTo(str2)); // 0
        System.out.println(str1.compareTo(str3)); // 27
        System.out.println(str1.compareTo(str4));// 39

        /**
         * 
         * A,a = 65,97
         * BCDEFGHIJKL
         * M =77
         * 
         * A=65+32=97
         * 
         * h= 104-77 = 27
         * 104-109 = - 5
         */

        // * int compareToIgnoreCase(String str)

        String str1e = "hello";
        String str2e = "hello";
        String str3e = "Mello";
        String str4e = "Aello";

        System.out.println(str1.compareToIgnoreCase(str2e)); // 0;

        System.out.println(str1.compareToIgnoreCase(str3e)); // -5;

        System.out.println(str1.compareToIgnoreCase(str4e)); // 7;

        // * String replace (char oldChar,char newChar)

        System.out.println(str1e.replace('h', 'm')); // mello

        // * String substring (int beginIndex)
        // * String substring (int beginIndex, int endIndex)

        String stringTest = "Hello my name is niyati gupta stella";

        System.out.println(stringTest.substring(6, 23)); // my name is niyati
        System.out.println(stringTest.substring(6)); // my name is niyati gupta stella

        // * String valueOf(all types)

        String strValue = "";

        int x1 = 20;
        String myintValue = strValue.valueOf(x1);

        // * boolean startsWith(String str)

        String s1 = "hello";

        System.out.println(s1.startsWith("h"));
        System.out.println(s1.startsWith("n"));

        // * boolean endsWith(String str)

        System.out.println(s1.endsWith("h"));
        System.out.println(s1.endsWith("o"));

    }

}