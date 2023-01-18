package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraVegToppingsAdded=false;
    private boolean isExtraNonVegToppingsAdded=false;
    private boolean isTakeawayAdded=false;
    private int basePizzaPrice;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            price+=300;
        }
        else {
            price+=400;
        }
        basePizzaPrice=price;
    }
    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        if(!isExtraCheeseAdded) {
            price +=80;
            isExtraCheeseAdded = true;
        }
    }
    public void addExtraToppings(){

        if(isVeg&&isExtraVegToppingsAdded==false)
        {
            price+=70;
            isExtraVegToppingsAdded=true;
        }
        else
        {
            if(!isExtraNonVegToppingsAdded)
            {
                price +=120;
                isExtraNonVegToppingsAdded = true;
            }
        }
    }
    public void addTakeaway(){
        if(!isTakeawayAdded)
        {
            price+=20;
            isTakeawayAdded=true;
        }
    }
    public String getBill(){
        bill="";
        System.out.println("Base Price Of The Pizza: "+(isVeg?300:400));
        if(isExtraCheeseAdded)
        {
            bill+="Extra Cheese Added: "+80+ "\n";
        }
        if(isExtraVegToppingsAdded)
        {
            bill+="Extra Toppings Added: "+70+ "\n";
        }
        else if(isExtraNonVegToppingsAdded)
        {
            bill+="Extra Toppings Added: "+120+ "\n";
        }
        if(isTakeawayAdded)
        {
            bill+="Paperbag Added: "+20+ "\n";
        }
        bill+="Total Price: "+price+ "\n";
        return this.bill;
    }
}
