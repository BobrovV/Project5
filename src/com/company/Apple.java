package com.company;

public enum Apple {
    A(10),B(15),C,D(20);
    private int price;

    Apple(int i) {
        this.price = i;
    }

    Apple() {

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                '}';
    }
}
