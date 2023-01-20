import java.util.Scanner;
public class LetterBandP {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a, b;
        //B Harfi
        System.out.print("Harf boyutlarını girin: ");
        a=sc.nextInt();
        b=sc.nextInt();
        String [][] letter = new String[a][b];

        for(int i=0; i<letter.length; i++){
            for(int j=0; j<letter[i].length; j++){
                if(i==0 || i==a/2 || i==a-1)
                    letter[i][j]=" * ";
                else if(j==0 || j==b-1)
                    letter[i][j]=" * ";
                else
                    letter[i][j]="   ";
            }
        }

        for(String []row:letter){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("\t");


        // P Harfi
        int j;
        for(int i=0; i<letter.length; i++){
            for(j=0; j<letter[i].length; j++){
                if(i==0 || i==a/2)
                    letter[i][j]=" * ";
                else if(j==0 || j== b-1 && i<a/2)
                    letter[i][j]=" * ";
                else
                    letter[i][j]="   ";
            }
        }
        for(String[] row:letter){
            for(String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
