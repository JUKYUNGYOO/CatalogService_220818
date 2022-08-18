package com.example.catalog_service_220817.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class CatalogDto implements Serializable {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;


    private String orderId;
    private String userId;

}
