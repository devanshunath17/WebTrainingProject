package com.web.tp.service;

import com.web.tp.repository.AuthorityRepository;
import com.web.tp.repository.ItemRepository;
import com.web.tp.domain.Item;
import com.web.tp.service.dto.ItemDto;
import com.web.tp.service.mapper.ItemMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    private final ItemRepository itemRepository;


    private final CacheManager cacheManager;

//    @Autowired
//    private ItemMapper itemMapper;


    public ItemService(ItemRepository itemRepository, PasswordEncoder passwordEncoder, AuthorityRepository authorityRepository, CacheManager cacheManager) {
        this.itemRepository = itemRepository;
        this.cacheManager = cacheManager;
    }

    public Item addItem(ItemDto item) {

        Item newItem = new Item();
        newItem.setCatId(item.getCatId());
        newItem.setCatName(item.getCatName());
        newItem.setCompanyName(item.getCompanyName());
        newItem.setItemId(item.getItemId());
        newItem.setPrice(item.getPrice());
        newItem.setEntryDate("1/10/2020");
        newItem.setEntryDate("2/10/2020");
        itemRepository.save(newItem);
        log.debug("Created Information for newItem: {}", newItem);
        return newItem;
    }


}
