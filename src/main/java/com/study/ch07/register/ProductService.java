package com.study.ch07.register;

public class ProductService {

    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        //  null이 아니라면 참조는 가능(순서 유념)
        //  isEmpty() - space는 공백으로 안봄, "" 공백으로 봄
        //  isBlank() - space를 다지우고 공백검사함
        return str.isBlank();
    }

    void registerProductService(Product product) {
        ProductRepository productRepository = new ProductRepository();

        System.out.println("서비스까지 데이터 전달 완료");

        productRepository.saveProduct(product);
    }


}
