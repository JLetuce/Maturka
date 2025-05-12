import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_1
{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_czerwiec_2022\\Data\\liczby.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine())
        {
            int cyfry [] = new int [4];
            int liczba = sc.nextInt();
            int odbicie = 0;
            int count = 3;
            int potega = 1;

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

            if(odbicie % 17 ==0)
                System.out.println(odbicie);

        }

    }

}
