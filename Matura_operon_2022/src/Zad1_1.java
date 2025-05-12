import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zad1_1 {
    public static void main(String[] args) throws FileNotFoundException {
        int pomiar_w = 1;
        int pomiar_nw = 0;
        int pomiar_b = 0;
        String pomiary;
        double pomiar_pop = 0;


        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_operon_2022\\.idea\\data\\kopalnia.txt");
        Scanner sc = new Scanner(file);

        pomiary = sc.nextLine();

        while (sc.hasNextLine()) {
            double potega = 1;
            double waga = 0;
            char masa[];
            String input = sc.nextLine();
            String line[] = input.split(" ");
            masa = line[1].toCharArray();
            waga = (Character.getNumericValue(masa[0]) - 10) * 250;

            for (int i = masa.length - 1; i > 0; i--) {
                waga += potega * (Character.getNumericValue(masa[i]));
                potega *= 2;
            }
            if (pomiar_pop > 0)
            {
                double proba = Math.abs(waga - pomiar_pop) / pomiar_pop;
                if (proba < 0.05)
                    pomiar_w++;
                if (proba > 0.10)
                    pomiar_b++;
                if (proba > 0.05 && proba < 0.1)
                    pomiar_nw++;
            }
            pomiar_pop = waga;
        }

        System.out.println(pomiar_w);
        System.out.println(pomiar_nw);
        System.out.println(pomiar_b);

    }
}