package com.mymaven.hibernatelistmapping;

import java.util.List;

public class Product {
   
    private int id;  
    private String p_category;  
    private List<String> product_name;  

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getP_category() {
        return p_category;
    }
    public void setP_category(String p_category) {
        this.p_category = p_category;
    }
    public List<String> getProduct_name() {
        return product_name;
    }
    public void setProduct_name(List<String> product_name) {
        this.product_name = product_name;
    }

    
}
