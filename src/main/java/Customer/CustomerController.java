package Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customer")
    List<Customer> all(){
        return repository.findAll();
    }

    @PostMapping("/customer")
    Customer save(@RequestBody Customer newCustomer){
        return repository.save(newCustomer);
    }
}
