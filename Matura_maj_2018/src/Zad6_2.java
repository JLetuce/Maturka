import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zad6_2 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data//slowa.txt");
        Scanner sc = new Scanner(file);
        int count = 0;

        while(sc.hasNextLine())
        {
            String [] slowa = (sc.nextLine()).split(" ");

            char [] slowo1 = slowa[0].toCharArray();
            char [] slowo2 = slowa[1].toCharArray();

            for(int i = 0; i <= slowo2.length - slowo1.length; i++) {

                String a = Arrays.toString(Arrays.copyOfRange(slowo2, i, slowo1.length + i));
                String b = Arrays.toString(slowo1);

                if (a.equals(b)) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
