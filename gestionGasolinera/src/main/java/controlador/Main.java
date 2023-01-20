package controlador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import dao.RepostajeFactura;
import dao.RepostajeNormal;
import implementaciones.FacturaIMPL;
import implementaciones.NormalIMPL;
@Controller
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		//asignamos la fecha al calendarijo
		
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("bean.xml");
		FacturaIMPL factura = (FacturaIMPL) contexto.getBean(FacturaIMPL.class);
		NormalIMPL normal = (NormalIMPL) contexto.getBean(NormalIMPL.class);
		RepostajeFactura precio = new RepostajeFactura();
		int menu;
		boolean salir = false;
		Calendar actual = Calendar.getInstance();
		
		
		Scanner scan = new Scanner(System.in);
		while(salir) 
		
		System.out.println(" Repostaje normal");
		System.out.println("Repostaje factura");
		System.out.println("Ver todos los repostajes");
		System.out.println("Importe total combustible vendido");
		System.out.println("Llenado de depósito");
		System.out.println("Eliminar último llenado de depósito");
		System.out.println("Ver todos los llenados de depósito");
		System.out.println("salir");
		
		
		do {
			
			System.out.println("Elija una de las opciones");
			menu= scan.nextInt();
			
			
		switch(menu) {
		case 1:
			System.out.println("A elegido usted repostaje normal");
			normal.Insertar(new RepostajeNormal( "ASD", actual, 3.1235));
			break;
			
		case 2:
			System.out.println("A elegido usted repostaje factura");
			factura.Insertar(new RepostajeFactura("aht", actual, 6.7, "8878734Z","868787AS"));
			break;
			
		case 3:
			System.out.println("Lista de respotajes");
			factura.toString();
			normal.mostrar();
			break;
			
		case 4:
			System.out.println("total ventas");
			
			break;
			
		case 5:
			System.out.println("A elegido usted llenado de depósito");
			break;
			
		case 6:
			System.out.println("Se ha eliminado el ultimo llenado");
			break;
			
		case 7:
			System.out.println("Lista de llenados");
			break;
			
		case 8:
			System.out.println("hasta pronto");
			
			if(menu==8) {
				salir=true;
			}
			break;
			
			
		}}while(menu!=8);
		
		

	}

}
