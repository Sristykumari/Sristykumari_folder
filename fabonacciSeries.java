public class fabonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 8;
       System.out.println(a);
       System.out.println(b);
       while(count > 0){
        int c= a+b;
            a=b;
            b=c;
        System.out.println(c + " ");
         count--;

       }
                
     }
}