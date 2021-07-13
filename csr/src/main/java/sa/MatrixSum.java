package sa;

import java.io.IOException;
import java.util.Scanner;

public class MatrixSum {

        static int[][] preprocess (int aux[][],int mat[][],int n){

            for (int i = 0; i < n; i++)
                aux[0][i] = mat[0][i];

            for (int i = 1; i < n; i++)
                for (int j = 0; j < n; j++)
                    aux[i][j] = mat[i][j] +
                            aux[i-1][j];

            for (int i = 0; i < n; i++)
                for (int j = 1; j < n; j++)
                    aux[i][j] += aux[i][j-1];

            return aux;
        }
        static int sumQuery(int aux[][],int tli,
                            int tlj, int rbi, int rbj){

            int res = aux[rbi][rbj];
            if (tli > 0)
                res = res - aux[tli-1][rbj];
            if (tlj > 0)
                res = res - aux[rbi][tlj-1];
            if (tli > 0 && tlj > 0)
                res = res + aux[tli-1][tlj-1];

            return res;

        }

        public  static  void main(String args[])throws IOException {
            try{

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[][] a = new int[n][n];
                int[][] aux = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                boolean check=false;
                int[][] aux2= preprocess(aux,a,n);
//        System.out.println(aux2[n-1][n-1]);
                int sum = Integer.MIN_VALUE;
                int sq=1;
                int iStart = 0;
                int jStart = 0;
                int iEnd = sq;
                int jEnd = sq;
                while (sq<n){




                    while (iStart<n&&jStart<n){

                        while (iEnd<n&&jStart<n){
                            if(Math.max(sum,sumQuery(aux2,iStart,jStart,iEnd,jEnd))>=k){
                                System.out.println("YES");
                                check=true;
                                iStart=iStart+1;
                                jStart=jStart+1;
                                iEnd=jEnd+1;
                                jEnd=jEnd+1;
                                System.out.println(iStart+" "+jStart+" "+iEnd+" "+jEnd);
                                break;
                            }

                            iEnd+=sq;
                            jStart+=sq;
                        }


                        iStart+=sq;
                        jStart+=sq;
                    }

                    sq++;
                }
                if(!check){
                    System.out.println("NO");
                }

            }catch (Exception e){
                System.out.println(e);
                return;
            }
        }



}
