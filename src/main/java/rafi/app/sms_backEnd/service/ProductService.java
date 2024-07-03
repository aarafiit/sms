package rafi.app.sms_backEnd.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import rafi.app.sms_backEnd.entity.Product;
import rafi.app.sms_backEnd.repository.ProductRepository;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    /*@PostConstruct
    public void init() {
        List<Product> products = IntStream.rangeClosed(1,100)
                .mapToObj(i -> new Product("Product" + i , new Random().nextLong(100),new Random().nextInt(100)))
                .collect(Collectors.toList());
        productRepository.saveAll(products);
    }*/

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findProductWithSorting(String field){
        return productRepository.findAll(Sort.by(Sort.Direction.ASC,field));
    }

    public Page<Product> findProductWithPagination(int offset,int size){
            Page<Product> products = productRepository.findAll(PageRequest.of(offset,size));
            return products;
    }


}
