 import java.io.PrintStream;
 import java.util.Scanner;
 
 public class TestGraph
 {
   /*public static void main(String[] args)
   {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите размерность матрицы смежности: ");
    int n = in.nextInt();
     long[][] smezh = new long[n][n];
     int[][] vesa = new int[n][n];
     for (int i = 0; i < n; i++)
     {
       for (int j = 0; j < n; j++)
       {
         System.out.println("Введите число в матрицу смежности на позицию строка " + i + " столбец " + j + " :");
         smezh[i][j] = in.nextLong();
       }
     }
     for (int i = 0; i < n; i++)
       for (int j = 0; j < n; j++)
       {
         if (j == 0)
         {
           System.out.println();
         }
         System.out.print(" " + smezh[i][j] + " ");
       }
     System.out.println();
     System.out.println("Введите начальную вершину пути: ");
     int start = in.nextInt();
     System.out.println("Введите конечную вершину пути: ");
     int end = in.nextInt();
 
     System.out.println("Введите количество критериев у каждой вершины: ");
     int krit = in.nextInt();
 
     System.out.println("--Ввод весов вершин--");
     for (int i = 0; i < n; i++) {
       for (int j = 0; j < krit; j++)
       {
         System.out.println("Введите вес " + i + " вершины по " + j + " критерию: ");
         vesa[i][j] = in.nextInt();
       }
 
     }
     graph g1 = new graph(n, start, smezh, vesa, krit);
     g1.FindRoutes(start, end, " " + String.valueOf(start));
   }*/
 }
