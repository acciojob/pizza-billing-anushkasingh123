package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegPizzaPrice=300;
    private int nonVegPizzaPrice=400;
    private int extraVegToppingsPrice=70;
    private int extraNonVegToppingsPrice=120;
    private int extraCheesePrice=80;
    private int takeawayPrice=20;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraVegToppingsAdded=false;
    private boolean isExtraNonVegToppingsAdded=false;
    private boolean isTakeawayAdded=false;
    private int basePizzaPrice;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            price+=vegPizzaPrice;
        }
        else {
            price+=nonVegPizzaPrice;
        }
        basePizzaPrice=price;
    }
    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        if(!isExtraCheeseAdded) {
            price += extraCheesePrice;
            isExtraCheeseAdded = true;
        }
    }
    public void addExtraToppings(){

        if(isVeg&&isExtraVegToppingsAdded==false)
        {
            price+=extraVegToppingsPrice;
            isExtraVegToppingsAdded=true;
        }
        else
        {
            if(!isExtraNonVegToppingsAdded)
            {
                price += extraNonVegToppingsPrice;
                isExtraNonVegToppingsAdded = true;
            }
        }
    }
    public void addTakeaway(){
        if(!isTakeawayAdded)
        {
            price+=takeawayPrice;
            isTakeawayAdded=true;
        }
    }
    public String getBill(){
        bill="";
        System.out.println("Base Price Of The Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded)
        {
            bill+="Extra Cheese Added: "+extraCheesePrice+ "\n";
        }
        if(isExtraVegToppingsAdded)
        {
            bill+="Extra Toppings Added: "+extraVegToppingsPrice+ "\n";
        }
        else if(isExtraNonVegToppingsAdded)
        {
            bill+="Extra Toppings Added: "+extraNonVegToppingsPrice+ "\n";
        }
        if(isTakeawayAdded)
        {
            bill+="Paperbag Added: "+takeawayPrice+ "\n";
        }
        bill+="Total Price: "+price;
        return this.bill;
    }
}
