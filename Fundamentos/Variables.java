package Fundamentos;

class cuentaBancaria
{
	public int saldo;
	public static int numero=0;
	
}
public class Variables 
{
	public static void sumarSaldo(cuentaBancaria cta)
	{
		cta.saldo+=10;
	}
	public static void sumarSaldo(int saldo)
	{
		saldo+=10;
	}
	public static void main(String[]args)
	{
		cuentaBancaria ct1=new cuentaBancaria();
		cuentaBancaria ct2=ct1;
		ct1.saldo=1000;
		
		sumarSaldo(ct1);
		sumarSaldo(ct2);
		System.out.println(ct1.saldo);//IMPRIME 1020
		System.out.println(ct2.saldo);//IMPRIME 1020
		
		ct2=new cuentaBancaria();
		System.out.println("ct2:"+ ct2.saldo);//IMPRIME 0
		
		cuentaBancaria ct3 = new cuentaBancaria();
		ct3=ct2;
		sumarSaldo(ct3);
		System.out.println("ct3:"+ ct3.saldo);//IMPRIME 10
		
		cuentaBancaria ct4 =new cuentaBancaria();
		ct4=ct1;
		sumarSaldo(ct4);
		System.out.println("ct4:"+ ct4.saldo);//IMPRIME 1030
		
		cuentaBancaria ct5 =new cuentaBancaria();
		ct5=ct3;
		sumarSaldo(ct5);
		System.out.println("ct5:"+ ct5.saldo);//IMPRIME 20
		
		cuentaBancaria ct6 =new cuentaBancaria();
		sumarSaldo(ct6);
		System.out.println("ct6:");// NO IMPRIME NADA
		
		cuentaBancaria ct7= new cuentaBancaria();
		ct7=ct6;
		sumarSaldo(ct7);
		System.out.println("ct7:"+ ct7.saldo);//IMPRIME 20
		
		cuentaBancaria ct8= new cuentaBancaria();
		ct8=ct1;
		sumarSaldo(ct8);
		System.out.println("ct8:"+ ct8.saldo); //IMPRIME 1040
		
		cuentaBancaria ct9=new cuentaBancaria();
		ct9=ct8;
		sumarSaldo(ct9);
		System.out.println("ct9:"+ ct9.saldo);//IMPRIME 1050
		
		cuentaBancaria ct10=new cuentaBancaria();
		ct10=ct2;
		sumarSaldo(ct10);
		System.out.println("ct10:"+ ct10.saldo);//IMPRIME 30 
		
		
	}
}
