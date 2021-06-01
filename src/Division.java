public class Division implements Operation {
    @Override
    public void calculate(int a, int b) {
        int div = a/b;
        System.out.println("Частное= " + div);
    }
}
