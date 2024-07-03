package rafi.app.sms_backEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rafi.app.sms_backEnd.dto.APIResponse;
import rafi.app.sms_backEnd.entity.Product;
import rafi.app.sms_backEnd.service.ProductService;

import java.util.List;

@RestController
@RequestMapping
public class PaginationSortingExample {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    private APIResponse<List<Product>> getProducts() {
        List<Product> products = productService.findAll();
        return new APIResponse<>(products.size(),products);
    }

    @GetMapping("/products/{field}")
    private APIResponse<List<Product>> getProductsWithSorting(@PathVariable("field") String field) {
        List<Product> products = productService.findProductWithSorting(field);
        return new APIResponse<>(products.size(),products);
    }

    @GetMapping("/pagination/{offset}/{size}")
    private APIResponse<Page<Product>> getProductsWithPagination(@PathVariable int offset, @PathVariable int size) {
        Page<Product> products = productService.findProductWithPagination(offset, size);
        return new APIResponse<>(products.getSize(),products);
    }
}
