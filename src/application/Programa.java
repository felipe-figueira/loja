package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> lista = new ArrayList<>();
		System.out.println("quantos produtos ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("tipo de produto? i- importado  u-usado n-normal");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("nome: ");
			String nome = sc.nextLine();
			
			System.out.println("preço: ");
			double preco = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.println("taxa de imporção: ");
				double taxaAlfandega = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxaAlfandega));	
			}else if(ch == 'u') {
				System.out.println("data de fabricação: ");
				Date dataFabricacao = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}else {
				lista.add(new Produto(nome, preco));
			}
			
			
			
			
		}
		for(Produto prod : lista) {
			System.out.println(prod.priceTag());
		}

	}

}
