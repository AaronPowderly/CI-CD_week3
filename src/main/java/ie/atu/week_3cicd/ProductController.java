package ie.atu.week_3cicd;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    List<Product> myList = new ArrayList<>();

    @GetMapping("/hello")
    private String hello()
    {
        return "hello";
    }

    @GetMapping("/getprodcut")
    public Product getProduct()
    {
        Product myProduct = new Product("TV", 500);
        return myProduct;
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product myProduct)
    {
        myList.add(myProduct);
        return myProduct;
    }
}
