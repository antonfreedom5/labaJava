import repo.Repository;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Repository repository = Repository.getInstance();
        CustomerService customerService = new CustomerServiceImpl(repository);

        customerService.add(1L, "Ivan", new Date(), "Minsk", "+47523", "MC1234", "Some notes");
        customerService.add(2L, "Andery", new Date(), "Brest", "+47523", "MC1234", "Some notes");
        System.out.println(customerService.getAll());
    }
}
