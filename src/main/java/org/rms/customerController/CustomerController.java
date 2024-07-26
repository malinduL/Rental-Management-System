package org.rms.customerController;

import lombok.RequiredArgsConstructor;
import org.rms.dto.Customer;
import org.rms.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rms-controller")
public class CustomerController{
//http://localhost:8080/rms-controller/add-customer

  CustomerService service;
  @PostMapping("add-customer")
  @ResponseStatus(HttpStatus.CREATED)
  public void addCustomer(@RequestBody Customer customer){
    service.addCustomer(customer);
   }



    @DeleteMapping("delete-customer/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteCustomer(@PathVariable Long id){
        return "Deleted";
    }
    @PutMapping("/update-customer")
    public void updateCustomer(@RequestBody Customer customer)
    {service.updateCustomer(customer);
    }
    @GetMapping("/find-by-id/{id}")
    public Customer findById(@PathVariable Long id){
        return findById(id);
    }


    @GetMapping("/find-by-{Name}")
    public Customer findByName(@PathVariable String firstName) {

        return findByName(firstName);
    }
}

