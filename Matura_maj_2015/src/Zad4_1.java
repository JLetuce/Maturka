import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_1
{
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_maj_2015\\Data\\liczby.txt");
        Scanner sc = new Scanner(file);
        int count = 0;

        while(sc.hasNextLine()) {
            char[] liczba = sc.nextLine().toCharArray();
            int l0 = 0;
            int l1 = 0;

            for (int i = 0; i < liczba.length; i++) {
                if (liczba[i] == '0')
                    l0++;

                if (liczba[i] == '1')
                    l1++;
            }

            if (l0 > l1)
                count++;

        }
        System.out.println(count);
    }
}
