import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_2
{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Data/slowa3.txt");
        Scanner sc = new Scanner(file);


        int n = sc.nextInt();
        sc.nextLine();
        char slowo []= sc.nextLine().toCharArray();
        String[] liczby = sc.nextLine().split(" ");
        int k1 = Integer.valueOf(liczby[0]);
        int k2 = Integer.valueOf(liczby[1]);

        System.out.println(czy_mniejszy(n,slowo,k1,k2));

    }

    private static String czy_mniejszy (int n, char slowo [], int k1, int k2)
    {

        while(k1 <= n && k2 <= n)
        {
            if(slowo[k1 - 1] == slowo[k2 - 1])
            {
                k1 ++;
                k2 ++;
            }else{
                if (Character.getNumericValue(slowo[k1 - 1]) < Character.getNumericValue(slowo[k2 - 1])) {
                    return "TAK";
                }else
                {
                    return "NIE";
                }
            }
        }

        if(k2 <= n)
        {
            return "TAK";
        }else {
            return "NIE";
        }

    }

}
