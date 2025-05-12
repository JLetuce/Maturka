import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_3_a {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data/liczby.txt");
        Scanner sc = new Scanner(file);
        int count = 0;
        int [] liczby = new int [200];

        for(int i = 0; i < liczby.length; i++)
            liczby[i] = sc.nextInt();

        for(int i = 0; i < liczby.length; i++)
            for(int j = 0; j < liczby.length; j++)
                for(int k = 0; k < liczby.length; k++)
                {
                    if(i != j && j != k && k != i)
                        if(liczby[k] % liczby[j] == 0 && liczby[j] % liczby[i] == 0)
                        {
                            System.out.println(liczby[i] + " " + liczby[j] + " " +liczby[k]);
                            count++;
                        }
                }
        System.out.println(count);
    }

}
