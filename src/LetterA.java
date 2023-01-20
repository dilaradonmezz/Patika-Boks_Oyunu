import java.util.Scanner;
public class LetterA {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Dizi boyutlarını girin: ");
        int a, b;
        a=sc.nextInt();
        b=sc.nextInt();

        String [][] letter= new String [a][b];
        for(int i=0; i<letter.length; i++){
            for(int j=0; j<letter[i].length; j++){
                if(i==0 || i==a/3)
                    letter[i][j]= " * ";
                else if(j==0 || j==b-1)
                    letter[i][j]=" * ";
                else
                    letter[i][j]= "   ";
            }
        }
        for(String[] row : letter){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        /* F harfi
        for(int i=0; i<letter.length; i++){
            for(int j=0; j<letter[i].length; j++){
                if(i==0 || i==a/3)
                    letter[i][j]= " * ";
                else if(j==0)
                    letter[i][j]=" * ";
                else
                    letter[i][j]= "   ";
            }
        }
        for(String[] row : letter){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

         */
    }
}
