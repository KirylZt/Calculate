public class Composite implements Operation{
    @Override
    public void calculate(int a, int b) {
        System.out.println("Результат: " + (a * b));
    }
}
