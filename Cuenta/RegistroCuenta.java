package Cuenta;

public class RegistroCuenta 
{
	public static void main(String[]args)
	{
		Cuenta ct1=new Cuenta(1122,20000);
		System.out.println(ct1);
		ct1.setInteresAnual(0.45);
		ct1.retiro(2500);
		System.out.println(ct1);
		ct1.deposito(3000);
		System.out.println(ct1);
	}
}

