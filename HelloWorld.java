import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("What's your name?   ");
        String name = io.nextLine();
        System.out.println("Hello! " + name);
        io.close();
    }
}
