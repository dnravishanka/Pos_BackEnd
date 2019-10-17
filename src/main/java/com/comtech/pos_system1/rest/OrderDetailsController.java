package com.comtech.pos_system1.rest;
import com.comtech.pos_system1.dto.OrderDetailDTO;
import com.comtech.pos_system1.dto.common.ResponseDto;
import com.comtech.pos_system1.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/comtech/test/OrderDetails")

public class OrderDetailsController {

        @Autowired
    OrderDetailsService orderDetailsService;

    @PostMapping
    public ResponseDto addInvoice(@RequestBody OrderDetailDTO  orderDetailDTO){
        System.out.println("backend post maping ok");
        Long id=null;
        String message=null;
        int status =0;

        try {
            id=orderDetailsService.add(orderDetailDTO);
            message="order Created";
            status=200;
            System.out.println("backend post maping ok");

        }catch (NullPointerException e){
            message="order Not Created";
            status=400;
            e.printStackTrace();
            System.out.println("backend post maping ok");
        }
        return new ResponseDto(id,status,message);
    }


    @PutMapping
    public ResponseDto updateOrder(@RequestBody OrderDetailDTO orderDetailDTO){
        Long id=null;
        String message=null;
        int status =0;

        try {
            id=orderDetailsService.update(orderDetailDTO);
            message="order Created";
            status=200;

        }catch (NullPointerException e){
            message="order Not Created";
            status=400;
            e.printStackTrace();
        }
        return new ResponseDto(id,status,message);
    }
    @GetMapping

    public List<OrderDetailDTO> searchOrder(
            @RequestParam(value = "text",required = true) String text,
            @RequestParam(value = "count",required = true) Integer count,
            @RequestParam(value = "page",required = true) Integer page){
        return orderDetailsService.searchLike(text,count,page);
    }
    @DeleteMapping("/{cid}")
    public Long deleteOrder(@PathVariable("cid")Long id){
        return orderDetailsService.delete(id);
    }
}
