package bts.product.product_service.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginData {
    String username;
    String password;
    String passwordConfirmation;
}
