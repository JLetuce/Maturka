import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_1
{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data//liczby.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine())
        {
            int liczba = sc.nextInt();
            boolean flaga = false;

            if(liczba >= 100 && liczba <= 5000) {
                for (int i = 2; i < liczba; i++)
                    if (liczba % i == 0) {
                        flaga = true;
                        break;
                    }
                if(flaga == false)
                    System.out.println(liczba);
            }
        }

    }

}
