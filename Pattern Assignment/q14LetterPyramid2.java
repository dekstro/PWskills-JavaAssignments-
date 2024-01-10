public class q14LetterPyramid2 {
    public static void main(String[] args) {
        int k;
        for (int i=0;i<4;i++) {
            k=i;
            for (int j=1;j<4-i;j++) { // printing spaces
                System.out.print(" "+" ");
            }

            for (int j=0;j<2*i+1;j++) { // printing the values after spaces
                System.out.print((char)('A'+k)+" ");
                if (j<i) k--; // first we are printing in decreasing sequence
                else k++; // later we are printing in increasing sequence
            }
            System.out.println();
        }

    }
}
