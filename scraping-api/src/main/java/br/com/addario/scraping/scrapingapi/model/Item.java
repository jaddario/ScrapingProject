package br.com.addario.scraping.scrapingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "preco")
	private double preco;
	@Column(name = "link")
	private String link;
	@Column(name = "link_imagem")
	private String sourceImagem;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "tamanho")
	private String tamanho;
}
