package Multithreading;

import java.util.*;
public class bankmultithread {
	int deposit;
	int bal;
	int withdraw;
	
	public synchronized void deposit(int bal) {
		bal = bal + deposit;
		System.out.println("Deposit:" + bal);
	}

	public synchronized void withdraw(int bal) {
		bal = bal - withdraw;
		System.out.println("Deposit:" + bal);
	}

	public static void main(String[] args) {
		bankmultithread obj = new bankmultithread();
		obj.deposit(1000);
		;

	}
}