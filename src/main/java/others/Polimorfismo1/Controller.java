package others.Polimorfismo1;

import java.util.List;

public class Controller {

    private CustomerManagerService customerManagerService;

    public Controller(CustomerManagerService customerManagerService) {
        this.customerManagerService = customerManagerService;
    }

    public void m1() {
        List<Customer> customers = this.customerManagerService.getAllCustomers();
        customers.forEach(c -> System.out.println("ID: " + c.getId() + ", Code: " + c.getCode()));
    }
}
