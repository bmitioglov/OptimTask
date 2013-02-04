/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class graph
/*    */ {
/*    */   private Way[] wayofvert;
/*    */   private int krit;
/*    */   private int[] sum;
/*    */   private int startvert;
/*    */   private int j;
/*    */   private int curvertex;
/*    */   private int n;
/*    */   private boolean[] vertexUsed;
/*    */   private long[][] smezh;
/*    */   private int[][] vesavert;
/*    */ 
/*    */   public graph(int razm, int start, long[][] smezhmatrix, int[][] vesa, int kr)
/*    */   {
/* 10 */     this.n = razm;
/*    */ 
/* 12 */     this.smezh = new long[this.n][this.n];
/* 13 */     this.smezh = smezhmatrix;
/*    */ 
/* 15 */     this.vertexUsed = new boolean[this.n * this.n];
/* 16 */     for (int i = 0; i < this.n * this.n; i++)
/*    */     {
/* 18 */       this.vertexUsed[i] = false;
/*    */     }
/* 20 */     this.startvert = start;
/* 21 */     this.krit = kr;
/* 22 */     this.vesavert = new int[this.n][this.krit];
/* 23 */     this.vesavert = vesa;
/* 24 */     this.sum = new int[this.krit];
/* 25 */     for (int k = 0; k < this.krit; k++)
/*    */     {
/* 27 */       this.sum[k] = this.vesavert[start][k];
/*    */     }
/*    */   }
/*    */ 
/*    */   public void FindRoutes(int vertex, int destiny, String route)
/*    */   {
/* 37 */     if (vertex == destiny)
/*    */     {
/* 39 */       System.out.println(route);
/* 40 */       for (int i = 0; i < this.krit; i++)
/*    */       {
/* 42 */         System.out.println("Сумма по критерию " + i + " : ");
/* 43 */         System.out.println(this.sum[i]);
/*    */       }
/* 45 */       for (int k = 0; k < krit; k++)
/*    */       {
/* 47 */         sum[k] = vesavert[startvert][k];
/*    */       }
/*    */ 
/* 50 */       vertex = startvert;
/* 51 */       FindRoutes(vertex, destiny, " " + String.valueOf(this.startvert));
/*    */     }
/*    */     else
/*    */     {
/* 56 */       this.curvertex = vertex;
/* 57 */       for (j = 0; j < n; j += 1)
/*    */       {
/* 59 */         if (smezh[curvertex][j] == 1L)
/*    */         {
/* 61 */           if (vertexUsed[j] == false)
/*    */           {
/* 63 */             curvertex = j;
/* 64 */             if (this.j != destiny)
/*    */             {
/* 66 */               vertexUsed[j] = true;
/*    */             }
/* 68 */             for (int k = 0; k < krit; k++)
/*    */             {
/* 71 */               sum[k] += vesavert[curvertex][k];
/*    */             }
/* 73 */             FindRoutes(curvertex, destiny, route + " " + String.valueOf(curvertex));
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\Study\dads\OptimizationTask\build\classes\
 * Qualified Name:     graph
 * JD-Core Version:    0.6.2
 */