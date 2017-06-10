package com.example.model;


import com.google.common.collect.Lists;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;

    @OneToMany(mappedBy = "shop" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Product> shopProductList = Lists.newArrayList();

    public Shop() {
    }

    public Shop(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getShopProductList() {
        return shopProductList;
    }

    public void setShopProductList(List<Product> shopProductList) {
        this.shopProductList = shopProductList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        if (id != null ? !id.equals(shop.id) : shop.id != null) return false;
        if (name != null ? !name.equals(shop.name) : shop.name != null) return false;
        if (password != null ? !password.equals(shop.password) : shop.password != null) return false;
        return shopProductList != null ? shopProductList.equals(shop.shopProductList) : shop.shopProductList == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (shopProductList != null ? shopProductList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", shopProductList=" + shopProductList +
                '}';
    }
}
