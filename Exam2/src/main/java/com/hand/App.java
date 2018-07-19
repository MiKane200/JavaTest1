package com.hand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calmoney calmoney = Calmoney.getInstance();

        double AftertexingMoneyA = calmoney.getTexMoney(5000);
        double AftertexingMoneyB = calmoney.getTexMoney(10000);
        double AftertexingMoneyC = calmoney.getTexMoney(15000);
        double AftertexingMoneyD = calmoney.getTexMoney(60000);

        int texingMoneyA = (int)AftertexingMoneyA;
        int texingMoneyB = (int)AftertexingMoneyB;
        int texingMoneyC = (int)AftertexingMoneyC;
        int texingMoneyD = (int)AftertexingMoneyD;

        System.out.println("userA: "+texingMoneyA+" userB: "+texingMoneyB+" userC: "+texingMoneyC+" userD: "+texingMoneyD);
    }
}
