package bts.product.product_service.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductRequest {
    @NotEmpty(message = "Title must be filled")
    private String title;
    @NotEmpty(message = "Category must be filled")
    private String category;
    @NotNull(message = "Price must be filled")
    private BigDecimal price;
    @NotEmpty(message = "image must be filled")
    private String image;
    private String description;
    private String createdBy;
    private String createdById;
}
