package others.Polimorfismo1;

public class Principal {

    public static void main(String[] args) {

        Controller controller = new Controller(new CustomerManagerService1Impl());
        controller.m1();
    }
}
