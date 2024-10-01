package Practica2;

public class Calculadora{
	public static int suma(int a, int b) {
		return a+b;
	}
	public static int resta(int a, int b) {
			return a-b;
		}
	public static int multiplicacion(int a, int b) {
		return a*b;
	}
	public static int division(int a, int b) {
		if(b!=0) {
			return a/b;
		}
		else
			return -1;
	}
}