package com.hand;

public class Calmoney {
    //普通单例就使用此方法
    private static Calmoney instance = new Calmoney();

    private Calmoney(){}
    public static Calmoney getInstance(){
        return instance;
    }

    public double getTexMoney(int money){
        int beforeTexingMoney = money-3500;
        double afterTexingMoney;
        if(beforeTexingMoney<=1500 && beforeTexingMoney>=0){
            afterTexingMoney = beforeTexingMoney*0.97;
        }else if(money<=4500) {
            afterTexingMoney = beforeTexingMoney*0.9;
        }else if(beforeTexingMoney<=9000) {
            afterTexingMoney = beforeTexingMoney*0.8;
        }else if(beforeTexingMoney<=35000) {
            afterTexingMoney = beforeTexingMoney*0.75;
        }else if(beforeTexingMoney<=55000) {
            afterTexingMoney = beforeTexingMoney*0.7;
        }else if(beforeTexingMoney<=80000) {
            afterTexingMoney = beforeTexingMoney*0.65;
        }else{
            afterTexingMoney = beforeTexingMoney*0.55;
        }

        return 3500+afterTexingMoney;
    }

}
