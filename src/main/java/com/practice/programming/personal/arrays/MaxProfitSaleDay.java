package com.practice.programming.personal.arrays;

/**
 * A given array of integers represents day wise value of an item. Write a program to
 * find the day on which if the item is sold the profit will be maximum.
 *    Example:
 *         Input: prices = [7,1,5,3,6,4]
 *         Output: 5
 *         Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6),
 *         profit = 6-1 = 5.
 *         Note that buying on day 2 and selling on day 1 is not allowed
 */
public class MaxProfitSaleDay {
    public static void main(String[] args){
        int[] priceList = {7,1,5,3,6,4};
        printMaximumProfitDay(priceList);
    }

    private static void printMaximumProfitDay(int[] priceList){
        int resultIndex = 0;
        int maxProfit=0;

        for(int index1=0; index1<priceList.length-1; index1++){
            int buyPrice=priceList[index1];
            for(int index2=index1+1; index2<priceList.length; index2++){
                int sellPrice=priceList[index2];
                int curProfit=sellPrice-buyPrice;
                if(curProfit>maxProfit){
                    maxProfit=curProfit;
                    resultIndex=index2;
                }
            }
        }

        int resultDay = resultIndex+1;
        System.out.println("Maximum profit on day: " + resultDay);
    }
}
