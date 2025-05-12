import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_3 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data//pierwsze.txt");
        Scanner sc = new Scanner(file);
        int count = 0;

        while(sc.hasNextInt())
        {
            if(w(sc.nextInt()) == 1)
                count ++;
        }

        System.out.println(count);

    }

    static int w (int liczba)
    {
        int waga = 0;

        while(liczba > 0)
        {
            waga += liczba % 10;
            liczba = liczba / 10;
        }

        if(waga > 9) {
            return w(waga);
        }
        else {
            return waga;
        }
    }

}
