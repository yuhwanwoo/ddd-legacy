package kitchenpos.fixture;

import kitchenpos.domain.Product;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductFixtures {

    public static Product createProduct() {
        Product product = new Product();
        product.setId(UUID.randomUUID());
        product.setName("메뉴");
        product.setPrice(BigDecimal.valueOf(5000));
        return product;
    }

    public static Product ofPrice(BigDecimal price) {
        return createProduct("메뉴", price);
    }
    public static Product createProduct(String name, BigDecimal price) {
        Product product = new Product();
        product.setId(UUID.randomUUID());
        product.setName(name);
        product.setPrice(price);
        return product;
    }
}