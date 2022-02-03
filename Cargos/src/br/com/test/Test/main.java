package br.com.test.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.entidade.Pessoa.*;
public class main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		List ListaPessoas = new ArrayList(); 
		Scanner ler = new Scanner(System.in);
		int junior =0;
		int starter =0;
		int senior=0;
		for (int i = 1; i < 2; i++) {
		System.out.println("Informe o Nome da "+i+"° pessoa");
		p.setNome(ler.next());
		System.out.println("Informe o Cargo da "+i+"°pessoa(Starter, Junior, Sênior)");
		p.setCargo(ler.next());
		if (p.getCargo().equals("Starter")){
			starter =starter+1;
			
		}else
			if (p.getCargo().equals("junior")){
					junior =junior+1;
					
			}else
				if (p.getCargo().equals("Sênior")){
					senior =senior +1;
					
				}
		}
		System.out.println("Starter: "+starter);
		System.out.println("Junior: "+junior);
		System.out.println("Sênior: "+senior);
	}
}
