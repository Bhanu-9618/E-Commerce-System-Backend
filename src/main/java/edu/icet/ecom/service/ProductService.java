package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.ProductDto;
import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();
}
