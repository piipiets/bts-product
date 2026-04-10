package bts.product.product_service.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductUpdateRequest {
    private String title;
    private String category;
    private BigDecimal price;
    private String image;
    private String description;
    private String updatedBy;
    private String updatedById;

}
