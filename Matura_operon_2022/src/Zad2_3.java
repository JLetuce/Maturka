import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_3
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_operon_2022\\.idea\\data\\genetyka.txt");
        Scanner sc = new Scanner(file);
        int count = 0;

        while(sc.hasNextLine())
        {
            if(!podzial(sc.nextLine().toCharArray()))
                count ++;
        }

        System.out.println(count);
    }

    private static boolean podzial(char line [])
    {
        if(line.length == 1)
            return true;

        if(line.length % 2 == 1)
            return false;

        char line2 [] = new char [line.length / 2];

        for (int i = 0; i < line.length; i += 2)
        {
            if(line[i] == 'B' && line[i+1] == 'D')
            {
                line2 [i/2] =  'A';
            }
            else
            {
                if(line[i] == 'C' && line[i+1] == 'A' || line[i] == 'C' && line[i+1] == 'D')
                {
                    line2 [i/2] =  'B';
                }
                else
                {
                    if(line[i] == 'D' && line[i+1] == 'D')
                    {
                        line2 [i/2] =  'C';
                    }
                    else
                    {
                        if(line[i] == 'B' && line[i+1] == 'C')
                        {
                            line2 [i/2] =  'D';
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return podzial(line2);
    }
}
