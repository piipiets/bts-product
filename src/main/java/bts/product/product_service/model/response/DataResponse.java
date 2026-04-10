package bts.product.product_service.model.response;

import bts.product.product_service.model.entity.Product;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataResponse {
    String result;
    String detail;
    Date date;
    int code;
    AccessTokenResponse data;
    Product productData;
}
