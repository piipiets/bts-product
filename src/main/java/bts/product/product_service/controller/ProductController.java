package bts.product.product_service.controller;

import bts.product.product_service.model.dto.ProductRequest;
import bts.product.product_service.model.entity.Product;
import bts.product.product_service.model.response.DataResponse;
import bts.product.product_service.model.response.DatatableResponse;
import bts.product.product_service.model.response.DefaultResponse;
import bts.product.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    @PostMapping(path = "/products")
    public ResponseEntity<DefaultResponse> createProduct(@Valid @RequestBody ProductRequest productRequest){
        DefaultResponse res = productService.createProduct(productRequest);
        return ResponseEntity.ok().body(res);
    }

    @GetMapping(path = "/products/{id}")
    public ResponseEntity<DataResponse> getProductById(@PathVariable int id) {
        DataResponse res = productService.getProductById(id);
        return ResponseEntity.ok().body(res);
    }

    @GetMapping(path = "/products")
    public ResponseEntity<DatatableResponse<Product>> getListProduct(
            @RequestParam(defaultValue = "1") @Min(1) int page,
            @RequestParam(defaultValue = "10") @Min(1) int limit,
            @RequestParam(defaultValue = "id", required = false) String sortField,
            @RequestParam(defaultValue = "asc", required = false) String sortOrder,
            @RequestParam(required = false) String search,
            @RequestParam(required = false) String category
    ){
        DatatableResponse<Product> res = productService.getListProduct(page, limit, sortField,
                                        sortOrder, search, category);
        return ResponseEntity.ok().body(res);
    }

    @DeleteMapping(path = "/products/{id}")
    public ResponseEntity<DefaultResponse> deleteProduct(@PathVariable int id) {
        DefaultResponse res = productService.deleteProduct(id);
        return ResponseEntity.ok().body(res);
    }

    @PutMapping(path = "/products/{id}")
    public ResponseEntity<DefaultResponse> updateProduct(
            @PathVariable int id,
            @RequestBody ProductRequest productRequest) {
        DefaultResponse res = productService.updateProduct(id, productRequest);
        return ResponseEntity.ok().body(res);
    }

}
