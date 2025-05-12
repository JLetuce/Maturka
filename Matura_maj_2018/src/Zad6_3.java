import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zad6_3 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data//slowa.txt");
        Scanner sc = new Scanner(file);
        int count = 0;

        while(sc.hasNextLine())
        {
            String [] slowa = (sc.nextLine()).split(" ");

            String slowo1 = sort(slowa[0].toCharArray());
            String slowo2 = sort(slowa[1].toCharArray());

            if(slowo1.equals(slowo2))
                count ++;

        }


        System.out.println(count);
    }

    static String sort(char [] slowo)
    {
        for(int i = 1; i < slowo.length; i++)
            for(int j = 1; j < slowo.length; j++)
                if(Character.getNumericValue(slowo[j-1]) > Character.getNumericValue(slowo[j])){

                    char a = slowo[j];
                    slowo[j] = slowo[j - 1];
                    slowo[j - 1] = a;
                }

        return Arrays.toString(slowo);
    }

}
