package Customer;

import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/customer/{id}")
    void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

    @GetMapping("/customer/{id}")
    Customer get(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
    }

    @PutMapping("/customer/{id}")
    Customer update(@PathVariable Long id, @RequestBody Customer newCustomer){
        Customer customerToUpdate =  repository.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
        customerToUpdate.setName(newCustomer.getName());
        customerToUpdate.setEmail(newCustomer.getEmail());
        return repository.save(customerToUpdate);
    }
}
