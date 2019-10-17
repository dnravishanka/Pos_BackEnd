package com.comtech.pos_system1.rest;

import com.comtech.pos_system1.dto.ItemDto;
import com.comtech.pos_system1.dto.common.ResponseDto;
import com.comtech.pos_system1.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/comtech/test/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping
    public ResponseDto addItem(@RequestBody ItemDto  itemDto){
        Long id=null;
        String message=null;
        int status =0;

        try {
            id=itemService.add(itemDto);
            message="Item added";
            status=200;

        }catch (NullPointerException e){
            message="Item Not added";
            status=400;
            e.printStackTrace();
        }
        return new ResponseDto(id,status,message);
    }


    @PutMapping
    public ResponseDto updateItem(@RequestBody ItemDto itemDto){
        Long id=null;
        String message=null;
        int status =0;

        try {
            id=itemService.update(itemDto);
            message="Item Updated";
            status=200;

        }catch (NullPointerException e){
            message="Item Not Updated";
            status=400;
            e.printStackTrace();
        }
        return new ResponseDto(id,status,message);
    }
    @GetMapping

    public List<ItemDto> searchItem(
            @RequestParam(value = "text",required = true) String text,
            @RequestParam(value = "count",required = true) Integer count,
            @RequestParam(value = "page",required = true) Integer page){
        return itemService.searchLike(text,count,page);
    }
    @DeleteMapping("/{code}")
    public Long deleteItem(@PathVariable("code")Long id){
        return itemService.delete(id);
    }

    @GetMapping("/{code}")
    public ItemDto getItem(@PathVariable("code")Long id){
        return itemService.get(id);
    }
}
