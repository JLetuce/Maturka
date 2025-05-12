import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_3
{
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\JLetuce\\IdeaProjects\\Matura_maj_2015\\Data\\liczby.txt");
        Scanner sc = new Scanner(file);
        char [] liczba_max = sc.nextLine().toCharArray();
        char [] liczba_min = liczba_max;
        int pos_max = 0;
        int pos_min = 0;
        int row = 1;

        while(sc.hasNextLine()) {

            row ++;
            char[] liczba = sc.nextLine().toCharArray();

            if (liczba.length > liczba_max.length) {
                liczba_max = liczba;
                pos_max = row;
            } else if(liczba.length == liczba_max.length){

                for (int i = 0; i < liczba.length; i++) {
                    if(liczba[i] != liczba_max[i]) {
                        if(liczba[i] == '1'){
                            liczba_max = liczba;
                            pos_max = row;
                            break;
                        }else{
                            break;
                        }
                    }
                }
            }

            if (liczba.length < liczba_min.length) {
                liczba_min = liczba;
                pos_min = row;
            } else if(liczba.length == liczba_min.length) {

                for (int i = 0; i < liczba.length; i++) {
                    if(liczba[i] != liczba_min[i]) {
                        if(liczba[i] == '0'){
                            liczba_min = liczba;
                            pos_min = row;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(liczba_min);
        System.out.println(liczba_max);
        System.out.println(pos_min);
        System.out.println(pos_max);

    }
}
