import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad6_1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data//slowa.txt");
        Scanner sc = new Scanner(file);
        int count = 0;

        while(sc.hasNextLine())
        {
            String [] slowa = (sc.nextLine()).split(" ");

            char [] slowo1 = slowa[0].toCharArray();
            char [] slowo2 = slowa[1].toCharArray();

            if(slowo1 [slowo1.length - 1] == 'A')
                count ++;

            if(slowo2 [slowo2.length - 1] == 'A')
                count ++;
        }

        System.out.println(count);
    }
}
