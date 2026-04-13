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
    @NotEmpty(message = "UpdatedBy must be filled")
    private String updatedBy;
    @NotEmpty(message = "UpdatedById must be filled")
    private String updatedById;

}
