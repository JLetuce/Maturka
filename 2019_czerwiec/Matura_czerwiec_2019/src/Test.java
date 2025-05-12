public class Test {

    public static void main(String[] args) {

        int k = 3;
        int s = 1;
        int c =1;
        char[] S = "ma foykarznrtitu ima ".toCharArray();
        char[] T = new char[S.length];

        while(s >= k)
        {
            int p = s;

            if(s%2 == 1)
            {
                T[c] = S[p];
            }
            if(s%2 == 0)
            {
                T[s] = S[S.length-p];
            }

        }
    }
}
