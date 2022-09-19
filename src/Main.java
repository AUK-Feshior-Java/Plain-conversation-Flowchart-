import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int personAge = Integer.parseInt(sc.nextLine());
        if(personAge < 6)
            System.out.println("You have home, walk and kindergarten activities");
        else if(personAge < 17)
            System.out.println("You have school activity");
        else if(personAge < 22)
            System.out.println("You have university activity");
        else if(personAge < 60)
            System.out.println("You have work activity");
        else
            System.out.println("You are retired!");
    }
}