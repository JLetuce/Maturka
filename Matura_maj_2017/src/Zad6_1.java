import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad6_1
{
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_maj_2017\\Data\\dane.txt");
        Scanner sc = new Scanner(file);
        int max = 0;
        int min = 255;

        for(int i = 0; i < 200; i++)
            for(int j = 0; j < 320; j++)
            {
                int number = sc.nextInt();

                if(number > max)
                    max = number;

                if(number < min)
                    min = number;
            }

        System.out.println(max);
        System.out.println(min);
    }
}
