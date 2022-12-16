package br.com.projeto.observer;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.projeto.observer.model.ProdutoEmPromocao;
import br.com.projeto.observer.notificador.Notificador;
import br.com.projeto.observer.notificador.NotificadorProdutosEmPromocao;
import br.com.projeto.observer.ouvintes.EmailOuvinte;
import br.com.projeto.observer.ouvintes.OuvinteInt;
import br.com.projeto.observer.ouvintes.SmsOuvinte;
import br.com.projeto.observer.ouvintes.WhatsappOuvinte;
import br.com.projeto.observer.repository.ProdutoEmPromocaoRepository;

@SpringBootApplication
public class ObserverApplication {


	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);

		System.out.println("\n----------------------");
		System.out.println("ENTROU NA APLICAÇÃO!!!");
		System.out.println("----------------------\n\n");
		
		ProdutoEmPromocaoRepository produtoEmPromocaoRepository = new ProdutoEmPromocaoRepository();
		Notificador notificador = new NotificadorProdutosEmPromocao();

		OuvinteInt emailOuvinte = new EmailOuvinte(notificador);
		OuvinteInt smsOuvinte = new SmsOuvinte(notificador);
		OuvinteInt whatsappOuvinte = new WhatsappOuvinte(notificador);

		List<ProdutoEmPromocao> produtosEmPromocao = produtoEmPromocaoRepository.buscarProdutoEmPromocao();

		notificador.novosProdutosEmPromocao(produtosEmPromocao);
		
		// Retirando dinamicamente o ouvinte de E-mail.
		System.out.println("\n\n--------------------------------------------");
		System.out.println("Retirando dinamicamente o ouvinte de E-mail.");
		System.out.println("--------------------------------------------\n");
		
		notificador.removerOuvinte(emailOuvinte);
		notificador.notificarOuvintes();
			
		// Retirando dinamicamente o ouvinte de SMS.
		System.out.println("\n\n-----------------------------------------");
		System.out.println("Retirando dinamicamente o ouvinte de SMS.");
		System.out.println("-----------------------------------------\n");
		
		notificador.removerOuvinte(smsOuvinte);
		notificador.notificarOuvintes();
	
		// Retirando dinamicamente o ouvinte de Whatsapp e
		// Inserindo também dinamicamente os ouvites de E-mail e Whatsapp
		
		System.out.println("\n\n-----------------------------------------------------------");
		System.out.println("Retirando dinamicamente o ouvinte de Whatsapp.\nE Inserindo também dinamicamente os ouvites de E-mail e SMS ");
		System.out.println("-----------------------------------------------------------\n");
		
		notificador.removerOuvinte(whatsappOuvinte);
		notificador.registrarOuvinte(emailOuvinte);
		notificador.registrarOuvinte(smsOuvinte);
		notificador.notificarOuvintes();



	}

}
