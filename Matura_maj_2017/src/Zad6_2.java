import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad6_2
{
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_maj_2017\\Data\\dane.txt");
        Scanner sc = new Scanner(file);
        int count = 0;
        int [] [] screen = new int [320] [200];

        for(int i = 0; i < 200; i++)
            for(int j = 0; j < 320; j++)
            {
                screen[j][i] = sc.nextInt();
            }
        for(int i = 0; i < 200; i++)
            for(int j = 0; j < 320; j++)
            {
                if(screen [j][i] != screen [screen.length - j - 1][i])
                {
                    count ++;
                    break;
                }
            }

        System.out.println(count);
    }
}
