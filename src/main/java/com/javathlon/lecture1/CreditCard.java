package com.javathlon.lecture1;

public class CreditCard {
    private String cardNumber;
    private String cardOwner;
    private String cvc;

    public String getCardOwner() {
        //Security checks
        return cardOwner;
    }
    public void setCardOwner(String owner) {
        //Data validation

        cardOwner = owner;
    }
}
