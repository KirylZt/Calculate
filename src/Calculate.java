import java.util.Scanner;

public class Calculate {
    Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA() {
        System.out.print("Введите первое значение (a): ");
        a = scanner.nextInt();
    }

    public int getB() {
        return b;
    }

    public void setB() {
        System.out.print("Введите первое значение (b): ");
        b = scanner.nextInt();
    }

    public void start(){
        System.out.println("Привет!");
        run();
        System.out.println("Пока!");
    }

    private void run(){
        while (true){
            Operation operation = select();
            if (operation == null) break;
            setA();
            setB();
            operation.calculate(getA(), getB());

        }
    }

    private Operation select(){
        menu();
        System.out.print("Выберите операцию: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:return new Sum();
            case 2:return new Difference();
            case 3:return new Divide();
            case 4:return new Composite();
            case 0:return null;
            default:
                System.out.println("Введено невеное значение, повторите ввод: ");
                return select();
        }
    }

    public void menu(){
        System.out.println("1 - Сложение a и b (a+b)");
        System.out.println("2 - Вычитание b от a (a-b)");
        System.out.println("3 - Деление a на b (a/b)");
        System.out.println("4 - Умножение a на b (a*b)");
        System.out.println("0 - Выход");
    }



}
