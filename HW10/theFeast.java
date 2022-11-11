package HW10;

import java.util.Scanner;

public class theFeast {
	public static void main(String[] args) {

    System.out.println(Feast(10,2,5));
	}    
    public static int Feast(int money, int cost, int exchange) {
    	int count = money / cost;
    	int temp = count;
        while (temp >= exchange) {
        	temp = temp - exchange;
        	count++;
        	temp++;
            }
        return count;
        
    }
}
