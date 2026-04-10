package bts.product.product_service.controller;

import bts.product.product_service.model.response.DataResponse;
import bts.product.product_service.model.dto.LoginData;
import bts.product.product_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DataResponse> loginKeyCloak(@RequestBody LoginData userData) {
        return authService.login(userData);
    }

    @PostMapping(path = "/update-token", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DataResponse> refreshTokenKeyCloak(@RequestHeader String refreshToken) {
        return authService.updateToken(refreshToken);
    }
}
