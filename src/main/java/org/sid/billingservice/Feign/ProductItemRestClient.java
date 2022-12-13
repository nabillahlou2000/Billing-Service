package org.sid.billingservice.Feign;


import jakarta.ws.rs.QueryParam;
import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductItemRestClient {
    @GetMapping(path="/products")
    PagedModel<Product> pageProduct();
    @GetMapping(path="/products/{id}")
    Product getProductByID(@PathVariable Long id);
}
