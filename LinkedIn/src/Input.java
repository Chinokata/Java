// Importálja a scanner-t a java fájlba
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Készít egy scanner-t
        Scanner input = new Scanner(System.in);

        // A program megáll és vár a felhasználói input-ra, illetve utána az enter megnyomására
        String userInput1 = input.nextLine();

        // Utána kiírja a felhasználó által beírt sor egészét
        System.out.println(userInput1);

        // A program megáll és vár a felhasználói input-ra (ami egy egész szám), illetve utána az enter megnyomására
        int userInput2 = input.nextInt();

        // Utána kiírja a felhasználó által beírt számot
        System.out.println(userInput2);
    }
}
