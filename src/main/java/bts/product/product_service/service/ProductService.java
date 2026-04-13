package bts.product.product_service.service;

import bts.product.product_service.exception.custom.NotFoundException;
import bts.product.product_service.mapper.ProductMapper;
import bts.product.product_service.model.dto.ProductRequest;
import bts.product.product_service.model.dto.ProductUpdateRequest;
import bts.product.product_service.model.entity.Product;
import bts.product.product_service.model.response.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductMapper productMapper;

    public DefaultResponse createProduct(ProductRequest productRequest){
        try{
            productMapper.createProduct(productRequest);
            return new DefaultResponse(ResponseMessage.DATA_CREATED, 200);
        } catch (Exception e){
            log.error("Error when creating product", e);
            throw e;
        }
    }

    public DataResponse getProductById(int id) {
        try {
            Product product = productMapper.getProductById(id);
            if(product == null){
                throw new NotFoundException("Product not found");
            }
            return new DataResponse("Success", ResponseMessage.DATA_FETCHED, new Date(), 200, null, product);
        } catch (Exception e) {
            log.error("Error when get product's data", e);
            throw e;
        }
    }

    public DatatableResponse<Product> getListProduct(int page, int limit, String sortField, String sortOrder,
                                                                     String search, String category) {
        try {
            int offset = (page - 1) * limit;

            List<Product> data = productMapper.browseProduct(offset, limit, sortField, sortOrder, search, category);
            int totalData = productMapper.countProduct(search, category);

            PageDataResponse<Product> response = new PageDataResponse<>();
            response.setPage(page);
            response.setLimit(limit);
            response.setTotal(totalData);
            response.setList(data);

            return new DatatableResponse<>("Success", ResponseMessage.DATA_FETCHED, new Date(), 200, response);
        } catch (Exception e) {
            log.error("Error browse rekon scs v2", e);
            throw e;
        }
    }

    public DefaultResponse deleteProduct(int id){
        try{
            productMapper.deleteProduct(id);
            return new DefaultResponse(ResponseMessage.DATA_DELETED, 200);
        } catch (Exception e){
            log.error("Error when creating product", e);
            throw e;
        }
    }

    public DefaultResponse updateProduct(int id, ProductUpdateRequest productRequest){
        try{
            productMapper.updateProduct(id, productRequest);
            return new DefaultResponse(ResponseMessage.DATA_UPDATED, 200);
        } catch (Exception e){
            log.error("Error when creating product", e);
            throw e;
        }
    }
}
