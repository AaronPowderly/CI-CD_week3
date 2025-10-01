package ie.atu.week_3cicd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
public class ProductController {
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
}
