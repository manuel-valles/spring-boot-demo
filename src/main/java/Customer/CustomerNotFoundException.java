package Customer;

public class CustomerNotFoundException extends RuntimeException{
    CustomerNotFoundException(Long id){
        super(String.format("Customer with ID '%s' not found", id));
    }
}
