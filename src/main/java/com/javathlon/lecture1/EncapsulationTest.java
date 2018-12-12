package com.javathlon.lecture1;

public class EncapsulationTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
//        creditCard.cardOwner = "";
        creditCard.getCardOwner();
        creditCard.setCardOwner("Talha Ocakci");
    }

}
