package br.com.addario.scraping.scrapingapi.WebScraper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DistritoModaWebScraper {

	static Document document;
	private final String URL = "https://www.distritomoda.com.br/plus-size";

	public DistritoModaWebScraper() {
		try {
			document = Jsoup.connect(URL).get();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	public Map<String, String> getCategoriasDistritoModas() {
		Elements listaCategorias = document.select("ul.nivel-dois.borda-alpha li a");

		Map<String, String> linksCategoria = new HashMap<String, String>();
		listaCategorias.forEach(categoria -> {
			linksCategoria.put(categoria.attr("title"), categoria.attr("href"));
		});
		return linksCategoria;
	}
}
