import java.util.Scanner;
class MatrixArithmetic{
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter size of the matrix");
                int size= s.nextInt();
                int [][] x = new int [size][size];
                int [][] y = new int [size][size];
                int i, j;
                // accessing values for 1st matrix
                System.out.println("Enter values for 1st matrix");
                for (i=0;i<x.length;i++){
                        for(j=0;j<x.length; j++){
                                System.out.print("Enter values ");
                                x[i][j] = s.nextInt();
                        }
                        System.out.println();
                }
                // accessing values for 2nd matrix
                System.out.println("Enter values for 1st matrix");
                for (i=0;i<y.length;i++){
                        for(j=0;j<y.length; j++){
                                System.out.print("Enter values ");
                                y[i][j] = s.nextInt();
                        }
                        System.out.println();
                }
                // Displaying values of 1st matrix
                System.out.println("1st matrix");
                for (i=0;i<x.length;i++){
                        for(j=0;j<x.length; j++){
                                System.out.print(x[i][j] + " ");
                        }
                        System.out.println();
                }
                // Displaying values of 2nd matrix
                System.out.println("2nd matrix");
                for (i=0;i<y.length;i++){
                        for(j=0;j<x.length; j++){
                                System.out.print(y[i][j] + " ");
                        }
                        System.out.println();
                }
                // Addition 
                int [][] sum = new int [size][size];
                for (i=0;i<sum.length;i++){
                        for(j=0;j<sum.length; j++){
                                sum[i][j]= x[i][j] + y[i][j];
                        }
                        // System.out.println();
                }
                // Displaying 
                System.out.println("sum of 2 matrices");
                for (i=0;i<sum.length;i++){
                        for(j=0;j<sum.length; j++){
                                System.out.print(sum[i][j] + " ");
                        }
                        System.out.println();
                }
                
        }
}