import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad6_4 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_maj_2017\\Data\\dane.txt");
        Scanner sc = new Scanner(file);
        int count = 1;
        int max = 0;
        int save = 0;
        int[][] screen = new int[320][200];
        boolean [][] if_contrast = new boolean[320][200];

        for (int i = 0; i < 200; i++)
            for (int j = 0; j < 320; j++) {
                screen[j][i] = sc.nextInt();
            }

        for(int j = 0; j < 320; j++) {
            for (int i = 0; i < 199; i++) {

                if(count > max)
                    max = count;

                if (screen[j][i] == screen[j][i + 1])
                {
                    count++;
                }
                else
                {
                    count = 1;
                }
            }
        }

        System.out.println(max);
    }
}
