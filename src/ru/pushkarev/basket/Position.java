package ru.pushkarev.basket;

public class Position {

    private String product;
    private Integer quantity;

    Position(String product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    Integer getQuantity() {
        return quantity;
    }

    void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
