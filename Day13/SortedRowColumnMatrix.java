package Day13;

public class SortedRowColumnMatrix {
    static int RowColumnMatrix(int n, int m, int x, int matrix[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==x){
                    return 1;
                }
            }
        }
        return 0;

    }
    public static void main(String[] args) {
       int n = 3, m = 3, x = 52;
        int matrix[][] = {{ 3, 30, 38},
                        {36, 43, 60},
                        {40, 51, 69}};
        System.out.println(RowColumnMatrix(n,m,x,matrix));

    }
    
}
