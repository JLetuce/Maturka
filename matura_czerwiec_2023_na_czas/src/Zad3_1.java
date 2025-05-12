import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_1
{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Data/anagram.txt");
        Scanner sc = new Scanner(file);
        int z = 0;
        int pz = 0;

        while(sc.hasNextLine())
        {

            char [] bity = sc.nextLine().toCharArray();
            double one = 0;
            double zero = 0;

            for(int i = 0; i < bity.length; i ++)
                if(bity[i] == '0')
                {
                    zero ++;
                }else {
                    one ++;
                }

            if(one == zero)
                z ++;

            if(one - zero == 1 || one - zero == -1)
                pz ++;
        }

        System.out.println(z);
        System.out.println(pz);
    }

}
