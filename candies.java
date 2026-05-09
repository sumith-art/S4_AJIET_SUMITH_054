/**class candies{
    public static void main(String []args){
        int n=10,k=7,m=6,c=3,o;
        if(m<=7){
            m=n;
        }
        if(c>n){
            System.out.println("Invalid Request!");
        }
        if(c<n){
            o=m-c;
           if(m<=7){
            m=n;
            } 
            System.out.println("Number of Candies Sold:"+c);
            System.out.println("Number of Candies Available:"+o);
        }
    }
}*/

class Candies {
    public static void main(String[] args) {

        int N = 10;   
        int K = 5;    
        int M = 10;   
        int customer = 3;
        if (customer > M) {
            System.out.println("INVALID INPUT");
        } 
        else {
            M = M - customer;

            System.out.println("Number of Candies Sold: " + customer);

            if (M <= K) {
                M = N;
            }

            System.out.println("Number of Candies Available: " + M);
        }
    }
}