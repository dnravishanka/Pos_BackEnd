package com.comtech.pos_system1.repository.custom.Impl;

import com.comtech.pos_system1.entity.Item;
import com.comtech.pos_system1.repository.custom.ItemRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class ItemRepositoryImpl implements ItemRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
        public List<Item> search(String searchText, Integer count, Integer page) {
        Query q=entityManager.createNativeQuery("select i.* from item i where (i.code like :searchText ) and i.is_enable=1",Item.class);
        q.setParameter("searchText","%"+ searchText + "%");
        q.setFirstResult(page * count);
        q.setMaxResults(count);
        return q.getResultList();
    }
}
