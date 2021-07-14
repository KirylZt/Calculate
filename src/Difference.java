public class Difference implements Operation{
    @Override
    public void calculate(int a, int b) {
        System.out.println("Результат: " + (a - b));
    }
}
