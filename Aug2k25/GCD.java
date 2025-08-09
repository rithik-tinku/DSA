//bruteforce
class GCD {
    public int GCD(int n1, int n2) {
        int max=0;
        int temp;
        int m;
        if(n1==n2){
            return n1;
        }
        if(n1>n2){
            m = n1;
        }
        else{
            m = n2;
        }
        for(int i=1; i<m; i++){
            if (n1%i==0 && n2%i==0){
                temp =i;
                if(max<temp){
                    max = temp;
                }
            }   
        }
        return max;
    }
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.GCD(10, 10));
    }
}