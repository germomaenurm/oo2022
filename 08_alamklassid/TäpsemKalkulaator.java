public class TäpsemKalkulaator extends Kalkulaator {
    int mult(int a , int b)
    {
        return a * b;
    }
    
    int div(int a , int b)
    {
        return a / b;
    }

    public static void main(String args[]) {
        TäpsemKalkulaator kalku = new TäpsemKalkulaator();
        
        System.out.println( kalku.add(1, 2) );
        System.out.println( kalku.sub(1, 2) );
        System.out.println( kalku.mult(1, 2) );
        System.out.println( kalku.div(1, 2) );
    }
}

/* 

3
-1
2
0 

*/
