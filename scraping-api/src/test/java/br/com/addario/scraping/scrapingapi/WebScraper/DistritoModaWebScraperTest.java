package br.com.addario.scraping.scrapingapi.WebScraper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DistritoModaWebScraperTest {

	static DistritoModaWebScraper scraper;
	
	@BeforeEach
	void setUp() {
		scraper = new DistritoModaWebScraper();
	}
	@Test
	void testaObterLinkDaPrimeiraCategoria_DeveRetornarLinkBermudas() {
		Map<String, String> categorias = scraper.getCategoriasDistritoModas();
		assertEquals(categorias.get("BERMUDAS"), "https://www.distritomoda.com.br/bermudas");
	}

}
