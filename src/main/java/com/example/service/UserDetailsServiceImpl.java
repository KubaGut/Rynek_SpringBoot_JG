package com.example.service;

import com.example.model.Shop;
import com.example.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private MainService mainService;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String shopName) throws UsernameNotFoundException {
        Shop shop = mainService.findShopByName(shopName);
        if(shop == null) {
            throw new UsernameNotFoundException("Login Failed");
        }
        System.out.println("Jestem w loadUserUserName");
        Set <GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_"+shop.getRole()));

        return new org.springframework.security.core.userdetails.User(
                shop.getName(), shop.getPassword(), authorities
        );
    }
}
