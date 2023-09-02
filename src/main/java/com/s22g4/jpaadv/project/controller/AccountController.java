package com.s22g4.jpaadv.project.controller;

import com.s22g4.jpaadv.project.entity.Account;
import com.s22g4.jpaadv.project.entity.Customer;
import com.s22g4.jpaadv.project.service.AccountService;
import com.s22g4.jpaadv.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private AccountService accountService;
    private CustomerService customerService;

    @Autowired
    public AccountController(AccountService accountService, CustomerService customerService) {
        this.accountService = accountService;
        this.customerService = customerService;
    }

    @GetMapping("/")
    public List<Account> get() {
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public Account getById(@PathVariable int id) {
        return accountService.find(id);
    }

    @PostMapping("/{customerId}")
    public Account save(@RequestBody Account account, @PathVariable int customerId) {
        Customer customer = customerService.find(customerId);
        customer.add(account);
        account.setCustomer(customer);
        return accountService.save(account);
    }

    @PutMapping("/{customerId}")
    public Account update(@RequestBody Account account, @PathVariable int customerId) {
        Customer customer = customerService.find(customerId);
        //Option 1
//        [account1, account4, account3]
//        Account foundAccount = customer.getAccountList().stream().filter(account1 ->
//                account1.getId() == account.getId()).collect(Collectors.toList()).get(0);
//        int index = customer.getAccountList().indexOf(foundAccount);
//        customer.getAccountList().set(index, account);

        //Option 2
//        Account foundAccount = null;
//        for(Account account1: customer.getAccountList()){
//            if(account1.getId() == account.getId()){
//                foundAccount = account1;
//            }
//        }
//        int index = customer.getAccountList().indexOf(foundAccount);
//        customer.getAccountList().set(index, account);

        //Option 3
        for (int i = 0; i < customer.getAccountList().size(); i++) {
            Account account1 = customer.getAccountList().get(i);
            if (account1.getId() == account.getId()) {
                customer.getAccountList().set(i, account);
                break;
            }
        }
        account.setCustomer(customer);
        return accountService.save(account);
    }
    @DeleteMapping("/{id}")
    public Account delete(@PathVariable int id){
        Account account = accountService.find(id);
        accountService.delete(account);
        return account;
    }
}
