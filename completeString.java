/**
 * -------------------------String handling in java----------------------------
 * Syllabus
 * ======================================================================
 * 
 * String class, methods of String class,
 * implementation of String class methods, String
 * array
 * The following String class methods are to be
 * covered:
 * String trim ()
 * String toLowerCase()
 * String toUpperCase()
 * int length( )
 * char charAt (int n)
 * int indexOf(char ch)
 * int lastIndexOf(char ch)
 * example = "R I SH 11 ABH"
 * String concat(String str)
 * boolean equals (String str)
 * boolean equalsIgnoreCase(String str)
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 * String replace (char oldChar,char newChar)
 * String substring (int beginIndex)
 * String substring (int beginIndex, int endIndex)
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * String valueOf(all types)
 * Programs based on the above methods, extracting
 * and modifying characters of a string, searching
 * for a string using linear search technique.
 * ======================================================================
 * String
 * char literal = 'A'
 * string literal = "5994874ouugha"(constant )
 * string variable (string identifier)
 * 
 * String name;
 * 
 * Syntax to initialize a string :-
 * 
 * String varibale_name = string literal/constant;
 * 1. String varibale_name;
 * 2. variable_name = string literal/constant;
 * 
 * 
 * Example => String name = "rishabh";
 * Example => String name;
 * name = "rishabh";
 * =========================================================================
 * Que 1. wap to initialize two strings and print them in different lines as
 * well as in the same line with one space between them.
 * =========================================================================
 * String class :
 * The String class represents character strings. All string literals in Java
 * programs, such as "abc", are implemented as instances of this class.
 * 
 * Strings are constant; their values cannot be changed after they are created.
 * String buffers support mutable strings. Because String objects are immutable
 * they can be shared. For example:
 * 
 * String str = "abc";
 * is equivalent to:
 * 
 * String array declaration =>
 * char data[] = {'a', 'b', 'c'};
 * String str = new String(data);
 * 
 * =========================================================================
 *
 * 
 */
public class helloWithString {

    public static void main(String[] args) {
        /*
         * // Que 1
         * 
         * String name = "Rishabh";
         * String surName = "Mishra";
         * // in same line
         * 
         * System.out.println(name + " " + surName);
         * 
         * // in diff line
         * System.out.println(name);
         * System.out.println(surName);
         * 
         */

        // * String trim ()

        String myString = "                    HELLO WELCOME TO LUCKNOW            ";
        String myString2 = "HELLO WELCOME TO Zoo            ";

        // System.out.println(myString.trim());
        // System.out.println(myString2.trim());

        // ! * String toLowerCase()
        // * String toUpperCase()

        System.out.println(myString2.toLowerCase());

        System.out.println(myString2.toUpperCase());

        String a = "VARIBALE";
        String b = "variable";
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());

        // * int length( )
        // it return the number of elements in an array =>

        System.out.println(a.length());
        System.out.println(myString2.length());
        System.out.println(myString.length());

        // * char charAt (int n)

        // charAt return a character at the given int index in place of argument ;

        System.out.println(a.charAt(7)); // E
        System.out.println(a.charAt(7)); // E

        // * int indexOf(char ch)

        String str1 = "Amaaan";
        System.out.println(str1.indexOf('a')); // E
        System.out.println(str1.indexOf('A')); // E

        // * int lastIndexOf(char ch)
        System.out.println(str1.lastIndexOf('a')); // E

        // * String concat(String str)
        // it returns the combination of two strings

        System.out.println(str1.concat(myString.trim()));
        System.out.println(str1 + " " + myString.trim());

        // * boolean equals (String str)
        // * boolean equalsIgnoreCase(String str)

        String m1 = "hello ji";
        String m2 = "hello ji";
        String m3 = "HELLO JI";
        String m4 = "hellO    Ji";

        System.out.println(m1.equals(m2)); // true
        System.out.println(m1.equals(m3));
        System.out.println(m1.equalsIgnoreCase(m3)); // true
        System.out.println(m1.equalsIgnoreCase(m4));

        // * int compareTo(String str)
        /**
         * ! if there're three strings M1,M2,M3;
         * ! then 3 conditions can occur -
         * ! 1. if M1 > M2 , it return a positive number
         * ! 2. if M1 < M2 , it return a negative number
         * ! 3. if M1 == M2 , it return 0
         */

        String M1 = "hello";
        String M2 = "Hello";
        String M3 = "meklo";
        String M4 = "hemlo";
        String M5 = "flag";
        // A B C D E F G *H I J K L *M N O P Q R S T U V W X Y Z
        System.out.println(M1.compareTo(M2)); // 0
        System.out.println(M1.compareTo(M3)); // -VE -5
        System.out.println(M1.compareTo(M4)); // -VE -1
        System.out.println(M1.compareTo(M5)); // +VE 2

        // * int compareToIgnoreCase(String str)
        String iGNOREString1 = "Hello";
        String iGNOREString2 = "HeLLo";
        String iGNOREString3 = "meklo";
        String iGNOREString4 = "hemlo";
        String iGNOREString5 = "flag";
        // A B C D E F G *H I J K L *M N O P Q R S T U V W X Y Z
        System.out.println(iGNOREString1.compareToIgnoreCase(iGNOREString2)); // 0
        System.out.println(iGNOREString1.compareToIgnoreCase(iGNOREString3)); // -VE -5
        System.out.println(iGNOREString1.compareToIgnoreCase(iGNOREString4)); // -VE -1
        System.out.println(iGNOREString1.compareToIgnoreCase(iGNOREString5)); // +VE 2

        // ! String replace (char oldChar,char newChar)

        String mName = "llllllll";

        System.out.println(mName.replace('l', 'D'));

        String tLString = "aaa";

        System.out.println(tLString.replace('a', 'b'));

        // * String substring (int beginIndex)

        String statement = "Hello my name is Amaan from CMS";

        System.out.println(statement.substring(17));

        // * String substring (int beginIndex, int endIndex)
        System.out.println(statement.substring(17, 22));
        System.out.println(statement.substring(6, 22));
        // print "hello my name is amaan"
        // String mstr = statement.replace("H", "h");
        // // mstr = mstr.replace("A", "a");

        System.out.println(statement.replace("A", "a").replace("H", "h").substring(0, 22));

        // * boolean startsWith(String str)
        // * boolean endsWith(String str)
        String statement1 = "Hello my name is Amaan from CMS";
        System.out.println(statement1.startsWith("Hello"));
        System.out.println(statement1.startsWith("hello"));
        System.out.println(statement1.startsWith("Hello my name is Amaan"));
        System.out.println(statement1.startsWith("my name is Amaan"));
        System.out.println(statement1.endsWith("CMS"));
        System.out.println(statement1.endsWith("Amaan from CMS"));
        System.out.println(statement1.endsWith("is Amaan from"));
        System.out.println(statement1.endsWith("Hello my name is Amaan"));
        // * String valueOf(all types)

        int x = 20;
        int y = 22;

        System.out.println(x + y);

        String s = "";

        System.out.println(s.valueOf(x) + s.valueOf(y));

        String s2 = "";

        System.out.println(s2.valueOf(x) + s2.valueOf(y));

    }

}
