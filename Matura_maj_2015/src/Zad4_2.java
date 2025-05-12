import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Zad4_2
{
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_maj_2015\\Data\\liczby.txt");
        Scanner sc = new Scanner(file);
        int count2 = 0;
        int count8 = 0;

        while(sc.hasNextLine()) {

            char [] liczba = sc.nextLine().toCharArray();

            if (liczba[liczba.length - 1] == '0')
                count2++;


            if (liczba[liczba.length - 3] == '0' && liczba[liczba.length - 2] == '0' && liczba[liczba.length - 1] == '0')
                count8++;
        }
        System.out.println(count2);
        System.out.println(count8);
    }
}
