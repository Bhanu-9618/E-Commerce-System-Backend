package edu.icet.ecom.service.Impl;

import edu.icet.ecom.controller.Product;
import edu.icet.ecom.model.dto.ProductDto;
import edu.icet.ecom.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    ModelMapper mapper = new ModelMapper();

    @Autowired
    ProductRepository repository;

    @Override
    public List<ProductDto> getAll() {
        List<Product> products = repository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();

        for(Product product : products){
            productDtos.add(mapper.map(product,ProductDto.class));
        }
        return productDtos;
    }
}
