package Basics;

import java.util.Scanner;

public class ConstructorDemo {
int account_num;
String name;
String phn_num;
String address;
double balance;
public ConstructorDemo() {

}
public ConstructorDemo(int account_num, String name, String phn_num, String address, double balance) {
	
	this.account_num = account_num;
	this.name = name;
	this.phn_num = phn_num;
	this.address = address;
	this.balance = balance;
}
public String getPhn_num() {
	return phn_num;
}
public void setPhn_num(String phn_num) {
	this.phn_num = phn_num;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getBalance() {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter account number last 4digits ");
	String acc4digit= sc.toString();
	if(this.account_num %1000 .equals(acc4digit)))
	{
		
	}
	return balance;
}
private void setBalance(double balance) {
	this.balance = balance;
}
public int getAccount_num() {
	return account_num;
}
public String getName() {
	return name;
}
public void display()
{
	System.out.println("Account num ->"+this.account_num+"name->"+this.name+"Phn_number->"+this.address+"balance->"+this.balance);
}

}
