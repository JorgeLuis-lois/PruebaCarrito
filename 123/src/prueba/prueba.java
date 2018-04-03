package prueba;

import java.util.ArrayList;
import java.util.List;

import entidades.Usuario;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Usuario>lista = new ArrayList<>();	
		for(int i=0;i<10;i++) {
			lista.add(new Usuario("email "+i,"pass "+i));
		}
		for(int i=0;i<10;i++) {
			System.out.println("============================");
			System.out.println("Email: email "+i);
			System.out.println("Pass: pass "+i);
			System.out.println("============================");
		}
	}

}
