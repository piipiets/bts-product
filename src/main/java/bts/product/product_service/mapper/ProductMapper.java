package bts.product.product_service.mapper;

import bts.product.product_service.model.dto.ProductRequest;
import bts.product.product_service.model.dto.ProductUpdateRequest;
import bts.product.product_service.model.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    void createProduct(ProductRequest productRequest);
    Product getProductById(int id);
    List<Product> browseProduct(int offset, int limit, String sortField, String sortOrder,
                                String search, String category);
    int countProduct(String search, String category);
    void deleteProduct(int id);
    void updateProduct(int id, ProductUpdateRequest productRequest);
}
