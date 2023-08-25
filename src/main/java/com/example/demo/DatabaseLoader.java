package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductoRepository repu;
	private final CategoriaRepository repo2;

	@Autowired
	public DatabaseLoader(
		ProductoRepository repu,
		CategoriaRepository repo2
		) {
		this.repu=repu;
		this.repo2=repo2;
	}

	@Override
	public void run(String... strings) throws Exception {
		Categoria cate=new Categoria("GUCCI");
		Categoria luiv=new Categoria("LUIVUTTON");
		this.repo2.save(cate);
		this.repo2.save(luiv);
		Producto zap=new Producto("Seints tenn",480.50f,cate);
		Producto sandalia=new Producto("Crocs",1500.50f,luiv);
		Producto cruc=new Producto("Crucci",3500.50f,luiv);
		this.repu.save(zap);
		this.repu.save(sandalia);
		this.repu.save(cruc);
	}
}