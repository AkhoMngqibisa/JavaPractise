package ControlFlowStatements;

public class IfElseStatements {

    public static void main(String [] args) {
        weather("raining");
    }

    public static void weather(String weather){
        if(weather.equalsIgnoreCase("raining")){
            System.out.println("Take an umbrella");
        } else {
            System.out.println("Wear Sunglasses");
        }
    }
}
