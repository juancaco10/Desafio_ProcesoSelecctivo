package DesafioProyecto_ValidacionProceso;

import java.util.Scanner;

public class DesafioControleFluxo {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el primer parámetro:");
			int parametroUno = scanner.nextInt();
			System.out.println("Ingrese el segundo parámetro:");
			int parametroDos = scanner.nextInt();

			if (parametroUno > parametroDos) {
				throw new ParametrosInvalidosException("El segundo parámetro debe ser mayor que el primero.");
			}

			contar(parametroUno, parametroDos);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}

	static void contar(int parametroUno, int parametroDos) {
		for (int i = parametroUno; i <= parametroDos; i++) {
			System.out.println("Imprimiendo el número " + i);
		}
	}
}

class ParametrosInvalidosException extends RuntimeException {
	public ParametrosInvalidosException(String mensaje) {
		super(mensaje);
	}
}
