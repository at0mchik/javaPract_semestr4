package com.example.p22.dto;

import com.example.p22.models.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class MarketDTO {
    private int ID;
    private String name, address;
    private List<Product> productList;
}
