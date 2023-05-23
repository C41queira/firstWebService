package com.devdbigode.webservice.entites.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1), 
    PAID(2),
    SHIPPED(3),
    DELIVERY(4),
    CANCELED(5);

    private int code; 

    private OrderStatus(int code){
        this.code = code;
    }

    public int getStatus(){
        return code;
    }

    public static OrderStatus valueOf(int code){
        for(OrderStatus value: OrderStatus.values()){
            if (value.getStatus() == code) {
                return value; 
            }
        }

        throw new IllegalArgumentException("Invalid Order Status"); 
    }
}
