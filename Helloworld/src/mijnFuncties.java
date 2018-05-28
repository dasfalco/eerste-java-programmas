import java.util.Scanner;

public class mijnFuncties {

    public static void main(String[] args) {
        String myString = "Dit is een lange tekst " +
                "die hier alleen maar staat om oefeningen op te maken";


        System.out.println(myString.toUpperCase());


     System.out.print("Wat is je naam");
        Scanner userinput = new Scanner(System.in);
        String username = userinput.next();
    }
}
