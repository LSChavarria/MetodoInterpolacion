package interpolacion;

public class Procedimiento {
    
    public Procedimiento() {}
    
    public static double procedimiento(double x, int n, double xy[][]){
        double sum = 0;
        
        for(int i = 0; i < n; i++) {
            double num = 1;
            double den = 1;
            
            for(int j = 0; j < n; j++)
                if(i-j != 0) {
                    num *= (x - xy[j][0]);
                    den *= (xy[i][0] - xy[j][0]);
                }
            
            sum += xy[i][1] * num / den;
        }
            
        return sum;
    }
}
