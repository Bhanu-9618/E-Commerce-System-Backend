package edu.icet.ecom.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private Double unitPrice;
    private int qty;
}
