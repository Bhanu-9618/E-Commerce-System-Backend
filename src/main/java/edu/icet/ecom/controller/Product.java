package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.ProductDto;
import edu.icet.ecom.service.Impl.ProductService;
import edu.icet.ecom.service.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class Product {

    @Autowired
    ProductService productService;

    @GetMapping("/get-all")
    public List<ProductDto> getAll(){
      return   productService.getAll();
    }

}
