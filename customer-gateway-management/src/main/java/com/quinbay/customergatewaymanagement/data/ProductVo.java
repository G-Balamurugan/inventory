package com.quinbay.customergatewaymanagement.data;

import lombok.Data;

@Data
public class ProductVo {
    private long id;
    private String name;
    private double price;
    private int quantity;
    private CategoryVo categoryVo;
    private String status;
}