package pkg;

public class Cuenta {
	private double saldo;
	private String nombre, titular;

	public Cuenta(String nombre, String titular, double saldo) {
		this.nombre = nombre;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void ingresar(double cantidad) {
		this.saldo += cantidad;
	}

	public void retirar(double cantidad) {
		if(this.saldo-cantidad >= -500) {
			this.saldo -= cantidad;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
