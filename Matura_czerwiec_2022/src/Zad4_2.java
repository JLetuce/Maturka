import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_2
{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_czerwiec_2022\\Data\\przyklad.txt");
        Scanner sc = new Scanner(file);
        int maxr = 0;
        int maxl= 0;

        while(sc.hasNextInt())
        {
            int cyfry [] = new int [4];
            int liczba = sc.nextInt();
            int odbicie = 0;
            int count = 3;
            int potega = 1;
            int roznica = 0;
            int save = liczba;

            while(liczba > 0)
            {
                cyfry [count] = liczba % 10;
                liczba = liczba / 10;
                count --;
            }

            for(int i = 0; i < 4; i ++)
            {
                odbicie += potega * cyfry[i];
                potega = potega * 10;
            }

            for(int i = 0; i < 4; i ++)
            {
                if(odbicie % 10 == 0)
                {
                    odbicie = odbicie / 10;
                }
                else
                    break;
            }

            if(save > odbicie)
            {
                roznica = save - odbicie;
            }
            else
            {
                roznica = save - liczba;
            }

            if (roznica > maxr) {
                maxr = roznica;
                maxl = save;
            }

        }
        System.out.println(maxl);
        System.out.println(maxr);
    }

}
