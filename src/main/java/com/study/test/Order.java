package com.study.test;

public class Order {
    private int orderId;
    private String productName;
    private String customerName;
    private int price;
    private int stock;

    public void showOrderInfo() {
        System.out.println("주문번호: " + orderId);
        System.out.println("상품명: " + productName);
        System.out.println("고객명: " + customerName);
        System.out.println("가격: " + price);
        System.out.println("수량: " + stock);
    }

    public Order(int orderId, String productName, String customerName, int price, int stock) {
        this.orderId = orderId;
        this.productName = productName;
        this.customerName = customerName;
        this.price = price;
        this.stock = stock;
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        private int orderId;
        private String productName;
        private String customerName;
        private int price;
        private int stock;

        public Order build() {
            return new Order(orderId, productName, customerName, price, stock);
        }

        public OrderBuilder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }
        public OrderBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }
        public OrderBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public OrderBuilder price(int price) {
            this.price = price;
            return this;
        }
        public OrderBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }
    }
}
