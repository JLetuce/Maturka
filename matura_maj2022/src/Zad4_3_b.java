import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_3_b {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data/liczby.txt");
        Scanner sc = new Scanner(file);
        int count = 0;
        int [] liczby = new int [200];

        for(int i = 0; i < liczby.length; i++)
            liczby[i] = sc.nextInt();

        for(int i = 0; i < liczby.length; i++)
            for(int j = 0; j < liczby.length; j++)
                if(j != i)
                    for(int k = 0; k < liczby.length; k++)
                        if(k != j)
                            for(int l = 0; l < liczby.length; l++)
                                if(l != k)
                                    for(int z = 0; z < liczby.length; z++)
                                        if(z != l)
                                        {
                                            if(liczby[z] % liczby[l] == 0 && liczby[l] % liczby[k] == 0 && liczby[k] % liczby[j] == 0 && liczby[j] % liczby[i] == 0)
                                                count++;
                                        }

        System.out.println(count);
    }

}
