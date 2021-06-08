package com.example.springbooyelasticsearch.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private long id;

    @JSONField(name = "store_id")
    private int storeId;

    @JSONField(name = "store_name")
    private String storeName;

    @JSONField(name = "category_id")
    private int categoryId;

    @JSONField(name = "category_code")
    private String categoryCode;

    @JSONField(name = "product_code")
    private String productCode;

    private int quantity;

    private double amount;

    @JSONField(name = "pay_date")
    private Date payDate;

    public Order(){

    }

    public Order(long id, int storeId, String storeName, int categoryId, String categoryCode, String productCode, int quantity, double amount, Date payDate) {
        this.id = id;
        this.storeId = storeId;
        this.storeName = storeName;
        this.categoryId = categoryId;
        this.categoryCode = categoryCode;
        this.productCode = productCode;
        this.quantity = quantity;
        this.amount = amount;
        this.payDate = payDate;
    }


}
