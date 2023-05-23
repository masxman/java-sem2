class fact{
    public static void main(String[] args) {
        int i = 1;
	int fact=1;
        while (i <= 10) {
            fact=fact*i;
            System.out.println("Factorial of " + i + " is: " + fact);
            i++;
        }
    }
}
