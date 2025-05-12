import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_2 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data/liczby.txt");
        Scanner sc = new Scanner(file);
        int liczba1 = 0;
        int count1 = 0;
        int liczba2 = 0;
        int count2 = 0;

        while (sc.hasNextInt()) {

            int liczba = sc.nextInt();
            int czyn1 = czynniki(liczba);
            int czyn2 =  czynniki_roz(liczba);

            if(czyn1 > count1)
            {
                liczba1 = liczba;
                count1 = czyn1;
            }

            if(czyn2 > count2)
            {
                liczba2 = liczba;
                count2 = czyn2;
            }
        }

        System.out.println(liczba1 +" " + count1 + " " + liczba2 + " " + count2);

    }
    private static int czynniki ( int liczba) {
        int count = 0;
        while (liczba > 1)
            for (int i = 2; i <= liczba; i++) {
                if (liczba % i == 0) {
                    count++;
                    liczba = liczba / i;
                    break;
                }
            }

            return count;
        }

    private static int czynniki_roz ( int liczba) {
        int count = 0;
        for (int i = 2; i <= liczba; i++) {
            if(czynniki(i) == 1)
                if (liczba % i == 0)
                    count++;

        }

        return count;
    }
}
