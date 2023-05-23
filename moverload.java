class over{
    void add() {
        int n1 = 5;
        int n2 = 10;
        int sum = n1 + n2;
        System.out.println("Sum: " + sum);
    }

   void add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("Sum: " + sum);
    }

    void add(float n1, float n2, float n3) {
        float sum = n1 + n2 + n3;
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        over obj = new over();
        obj.add();
        obj.add(10, 20);
        obj.add(10.f, 20.f, 30.f);
    }
}
