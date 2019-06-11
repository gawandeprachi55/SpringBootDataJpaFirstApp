package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner{
@Autowired
private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(repo.getClass().getName());
		Product p=repo.save(new Product("AA",3.3));
		System.out.println(p.getProdId());
		repo.save(new Product("BB",6.6));
		System.out.println(p.getProdId());
		repo.save(new Product("CC",8.8));
		System.out.println(p.getProdId());
	}

}
