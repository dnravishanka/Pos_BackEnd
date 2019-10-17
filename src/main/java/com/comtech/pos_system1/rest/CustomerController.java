package com.comtech.pos_system1.rest;

import com.comtech.pos_system1.dto.CustomerDto;
import com.comtech.pos_system1.dto.common.ResponseDto;
import com.comtech.pos_system1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/comtech/test/customer")

public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseDto addCustomer(@RequestBody CustomerDto customerDto){
        Long id=null;
        String message=null;
        int status =0;

        try {
            id=customerService.add(customerDto);
            message="Customer Created";
            status=200;

        }catch (NullPointerException e){
            message="Customer Not Created";
            status=400;
            e.printStackTrace();
        }
        return new ResponseDto(id,status,message);
    }


    @PutMapping
    public ResponseDto updateCustomer(@RequestBody CustomerDto customerDto){
        Long id=null;
        String message=null;
        int status =0;

        try {
            id=customerService.update(customerDto);
            message="Customer Created";
            status=200;

        }catch (NullPointerException e){
            message="Customer Not Created";
            status=400;
            e.printStackTrace();
        }
        return new ResponseDto(id,status,message);
    }
    @GetMapping("/{cid}")
    public CustomerDto getCusid(@PathVariable("cid")Long id){
        return customerService.get(id);
    }
    @GetMapping

    public List<CustomerDto> searchCustomer(
            @RequestParam(value = "text",required = true) String text,
            @RequestParam(value = "count",required = true) Integer count,
            @RequestParam(value = "page",required = true) Integer page){
        return customerService.searchLike(text,count,page);
    }
    @DeleteMapping("/{cid}")
    public Long deleteCustomer(@PathVariable("cid")Long id){
        return customerService.delete(id);
    }
}
