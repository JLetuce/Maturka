import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data/liczby.txt");
        Scanner sc = new Scanner(file);
        int count = 0;
        String liczba1 = null;

        while(sc.hasNextLine()) {

            String line = sc.nextLine();
            char [] liczba = line.toCharArray();

            if(count == 0)
                liczba1 = line;

            if(liczba[0] == liczba[liczba.length - 1])
                count ++;

        }

        System.out.println(count + " " + liczba1);
    }

}
