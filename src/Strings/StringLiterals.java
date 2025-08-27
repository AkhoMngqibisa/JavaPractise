package Strings;

public class StringLiterals {

    static void main() {
        stringLiteral();
        stringEscapeCharacters();
    }

    public static void stringLiteral() {
        String myString = new String("Hello World");
        System.out.println("My String " + myString);
    }

    public static void stringEscapeCharacters () {
        System.out.println(" Translated into a single \\ character in the String");
        System.out.println(" Translated into a single \ttab character in the string");
        System.out.println(" Translated into a single \r carriage return character in the string");
        System.out.println(" Translated into a single \n new line character in the string");

    }
}
