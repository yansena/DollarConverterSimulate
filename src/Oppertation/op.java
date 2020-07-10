package Oppertation;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverte;

public class op {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		System.out.println("Dollar is " + CurrencyConverte.DOLLAR);
                
		System.out.println("How many dollar you be bought?");
		double valor = sc.nextDouble();
                
                CurrencyConverte.calc = valor * CurrencyConverte.DOLLAR;
                System.out.println("Valor without tax is: " + CurrencyConverte.calc);
                
                double tax = 6;
                CurrencyConverte.taxa(tax);
                
		System.out.println("Amount to be paid in reais =R$" + CurrencyConverte.taxa(0));
		
		sc.close();
	}

}
