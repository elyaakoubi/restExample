package com.tpecommerce.web;


import com.tpecommerce.dto.ProductDto;
import com.tpecommerce.entities.Product;
import com.tpecommerce.servies.IProductService;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/products")
    public List<Product> findall(){
         return  productService.findAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Long id){
        Product pr = productService.findById(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("token","value1");
        return new ResponseEntity<>(pr, responseHeaders, HttpStatus.OK);
    }

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        productService.save(product);
        return productService.save(product);
    }

    @PutMapping("/product/{id}")
    public Product upProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return productService.upProduct(id,product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteById(id);
    }

    @PostMapping("/productcat")
    public void productCat(@RequestBody ProductDto productDto) {
     productService.productCat(productDto.getProductName(),productDto.getCategoryName());
    }

    @PostMapping("/productcategory")
    public void productCategpry(@RequestParam String nomp,@RequestParam String nomc) {
        productService.productCat(nomp,nomc);


    }



}
