package com.example.repository;


import com.example.model.Shop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Integer> {

    //Optional<Shop> findByName(String name);

    //@Query("SELECT a FROM Shop a WHERE LOWER (a.name) = LOWER(:name)")

    Shop findShopByName(String shopName);

}
