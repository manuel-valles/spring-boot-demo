package Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    Customer all(){
        return new Customer("Manu", "manukempo@gmail.com");
    }
}
