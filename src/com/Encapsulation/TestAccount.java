package com.Encapsulation;
public class TestAccount 
{
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setName("Subhrajit");
		acc.setEmail("jenasubhrajit99@gmail.com");
		acc.setAcc_no(919438346475L);
		acc.setAmount(100000);
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}
}
