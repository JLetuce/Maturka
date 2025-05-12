import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad6_3 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_maj_2017\\Data\\dane.txt");
        Scanner sc = new Scanner(file);
        int count = 0;
        int[][] screen = new int[320][200];
        boolean [][] if_contrast = new boolean[320][200];

        for (int i = 0; i < 200; i++)
            for (int j = 0; j < 320; j++) {
                screen[j][i] = sc.nextInt();
            }

        for (int i = 0; i < 200; i++)
            for (int j = 0; j < 319; j++) {
              if(Math.abs(screen [j][i] -screen [j+1][i]) > 128) {
                  if_contrast[j][i] = true;
                  if_contrast[j+1][i] = true;
              }

            }

        for (int i = 0; i < 199; i++)
            for (int j = 0; j < 320; j++) {
                if(Math.abs(screen [j][i] -screen [j][i+1]) > 128) {
                    if_contrast[j][i] = true;
                    if_contrast[j][i+1] = true;
                }
            }

        for (int i = 0; i < 200; i++)
            for (int j = 0; j < 320; j++) {
                if(if_contrast[j][i] == true)
                    count ++;

            }
        System.out.println(count);
    }
}
