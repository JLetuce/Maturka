import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Data/anagram.txt");
        Scanner sc = new Scanner(file);
        int z = 0;
        int pz = 0;

        while(sc.hasNextLine())
        {

            String line = sc.nextLine();
            char [] bity = line.toCharArray();
            int one = 0;
            int zero = 0;
            if(bity.length == 8) {
                for (int i = 0; i < bity.length; i++)
                    if (bity[i] == '0') {
                        zero++;

                }

                if(zero == 3 || zero == 4)
                    System.out.println(line);
            }
        }

    }

}
