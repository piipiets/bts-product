package bts.product.product_service.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private BigDecimal price;
    private String description;
    private String category;
    private String images;
    private Date createdAt;
    private String createdBy;
    private String createdById;
    private Date updatedAt;
    private String updatedBy;
    private String updatedById;
}
