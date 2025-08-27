package Strings;

public class StringLiterals {

    static void main() {
        stringLiteral();
        stringEscapeCharacters();
        stringConcatinate();
    }

    public static void stringLiteral() {
        String myString = new String("Hello World");
        System.out.println("My String " + myString);
    }

    public static void stringEscapeCharacters() {
        System.out.println(" Translated into a single \\ character in the String");
        System.out.println(" Translated into a single \ttab character in the string");
        System.out.println(" Translated into a single \r carriage return character in the string");
        System.out.println(" Translated into a single \n new line character in the string");

    }

    public static void stringConcatinate() {
        String[] strings = new String[]{"one", "two", "three"};
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : strings) {
            stringBuilder.append(string).append(", ");
        }

        System.out.println("String : " + stringBuilder.toString());
    }
}
