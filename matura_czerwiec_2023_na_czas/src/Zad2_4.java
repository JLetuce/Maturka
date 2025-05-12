import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_4
{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Data/slowa4.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){

            String[] line = sc.nextLine().split(" ");
            int n = Integer.valueOf(line[0]);
            char [] slowo = line[1].toCharArray();
            int k1 = 1;
            int k2 = 2;
            int s = 2;

            while (k2 <= n)
            {
                if(czy_mniejszy(n,slowo,k1,k2) == false)
                    s = k2;

                k1 = s;
                k2 ++;
            }

            for(int i = s - 1; i < n; i++)
            {
                System.out.print(slowo[i]);
            }
            System.out.println();
        }

    }

    private static boolean czy_mniejszy (int n, char slowo [], int k1, int k2)
    {

        while(k1 <= n && k2 <= n)
        {
            if(slowo[k1 - 1] == slowo[k2 - 1])
            {
                k1 ++;
                k2 ++;
            }else{
                if (Character.getNumericValue(slowo[k1 - 1]) < Character.getNumericValue(slowo[k2 - 1])) {
                    return true;
                }else
                {
                    return false;
                }
            }
        }

        if(k2 <= n)
        {
            return true;
        }else {
            return false;
        }

    }

}
