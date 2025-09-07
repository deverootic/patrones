package others.Polimorfismo1;

import java.util.List;

public class CustomerManagerService1Impl implements CustomerManagerService {

    @Override
    public List<Customer> getAllCustomers() {
        System.out.println(1);
        return List.of(
                new Customer(1, "X"),
                new Customer(2, "Y")
        );
    }
}
