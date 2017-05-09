
package Cuenta;

import java.sql.Date;

 public class Cuenta extends RegistroCuenta
 {
	private int id;
	private double saldo;
	private double InteresAnual;
	private Date FechaCreacion;
	public void NuevaCuenta(){	
	}
	public Cuenta(){
		id=0;
		saldo=0;
		InteresAnual=0;
		FechaCreacion= new Date(0);
	}

	public Cuenta(int idPara, double saldoInicial){
		this.id=idPara;
		this.saldo=saldoInicial;
		InteresAnual=0;
		FechaCreacion=new Date(idPara);
	}
	//METODO GET 
	public int getid()
	{
		return id;
	}
	public double getsaldo()
	{
		return saldo;	
	}
	public double getInteresAnual()
	{
		return InteresAnual;
	}
	public Date getFechaCreacion()
	{
		return FechaCreacion;
	}
	//METODO SET
	public void setid(int id)
	{
		this.id=id;
	}
	public void setsaldo(double saldo)
	{
		this.saldo=saldo;
	}
	public void setInteresAnual(double InteresAnual)
	{
		this. InteresAnual=InteresAnual;
	}
	public void setFechaCreacion(Date FechaCreacion)
	{
		this.FechaCreacion=FechaCreacion;
	}
	protected double getInteresMensualTotal() 
	{
		return this.InteresAnual/1200;
	}

	public double getInteresMensual()
	{
		return this.saldo * this.getInteresMensualTotal();
    }

	public void  retiro(double retiroPara)
	{
		this.saldo=retiroPara;
	}

	public void  deposito(double depositoPara)
	{
		this.saldo+=depositoPara;
	}	
	 public String toString(){

		 return String.format("Cuenta ID :%d\nSaldo:$%.2f\nInteres Mensual: $%.2f" + "\nFecha de Creación:",this.getid(),this.getsaldo(),this.getInteresMensual()) +this.getFechaCreacion();
	 }
 }
 