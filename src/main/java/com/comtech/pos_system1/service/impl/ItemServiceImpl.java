package com.comtech.pos_system1.service.impl;

import com.comtech.pos_system1.builder.DtoBuilder;
import com.comtech.pos_system1.builder.EntityBuilder;
import com.comtech.pos_system1.dto.ItemDto;
import com.comtech.pos_system1.entity.Item;
import com.comtech.pos_system1.repository.ItemRepository;
import com.comtech.pos_system1.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;
    @Autowired
    EntityBuilder itemEntityBuilder;
    @Autowired
    DtoBuilder itemDtoBuilder;


    @Override
    public Long add(ItemDto itemDto) {
        Item saved=itemRepository.save(itemEntityBuilder.buildItemEntity(new Item(),itemDto));
        return null !=saved ? saved.getCode() : null;
    }

    @Override
    public Long update(ItemDto itemDto) {
        Item saved=itemRepository.save(itemEntityBuilder.buildItemEntity(new Item(),itemDto));
        return null !=saved ? saved.getCode() : null;
    }

    @Override
    public List<ItemDto> searchLike(String searchText, Integer count, Integer page) {
        List<ItemDto> list= new ArrayList<>();

        for (Item entity : itemRepository.search(searchText, count,page)){
            list.add(itemDtoBuilder.buildItemDto(entity));
        }
        return list;
    }

    @Override
    public ItemDto get(Long cid) {
        return itemDtoBuilder.buildItemDto(itemRepository.getOne(cid));
    }

    @Override
    public Long delete(Long cid) {
        Item item=itemRepository.getOne(cid);
        item.setIsEnable(0);
        Item saved= itemRepository.save(item);

        return null !=saved.getCode() ? saved.getCode() :null;
    }

}
