package ControlFlowStatements;

public class Loops {
    static void main() {
        count3();
    }

    public static void count(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Count "+i);
        }
    }

    public static void count2(){
        int count = 1;

        while(count <= 5) {
            System.out.println("Count "+count);
            count ++;
        }
    }

    public static void count3(){
        int count = 1;

        do {
            System.out.println("Count "+count);
            count ++;
        } while (count <= 5);
    }
}
