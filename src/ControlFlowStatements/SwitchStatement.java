package ControlFlowStatements;

public class SwitchStatement {

    public static void main (String [] args){
        getDay(2);
    }

    public static void getDay(int day){
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }
    }
}
