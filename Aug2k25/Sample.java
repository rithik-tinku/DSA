class Divisors {
    public void divisors(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Divisors div = new Divisors();
        div.divisors(6); // Direct ga divisors print avthai
    }
}
