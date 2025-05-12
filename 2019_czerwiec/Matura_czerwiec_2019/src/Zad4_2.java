import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_2 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data//pierwsze.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextInt())
        {
            int liczba = sc.nextInt();
            int odwr = reverse(liczba);
            boolean flaga = false;

            if(liczba >= 100 && liczba <= 5000) {
                for (int i = 2; i < odwr; i++)
                    if (odwr % i == 0) {
                        flaga = true;
                        break;
                    }
                if(flaga == false)
                    System.out.println(liczba);
            }
        }
    }

    static int reverse(int liczba)
    {
        int reversed = 0;

        while(liczba > 0)
            {
                reversed = reversed * 10;
                reversed = reversed + liczba % 10;
                liczba = liczba / 10;
            }

        return reversed;
    }

}
