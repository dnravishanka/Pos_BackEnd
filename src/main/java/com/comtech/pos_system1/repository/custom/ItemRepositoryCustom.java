package com.comtech.pos_system1.repository.custom;


import com.comtech.pos_system1.entity.Item;

import java.util.List;

public interface ItemRepositoryCustom {
    List<Item> search(String searchText, Integer count, Integer page);
}
