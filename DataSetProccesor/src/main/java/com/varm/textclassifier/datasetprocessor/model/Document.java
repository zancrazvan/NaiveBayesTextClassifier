package com.varm.textclassifier.datasetprocessor.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author RazvanZanc
 *
 */
public class Document {

	/**
	 * List of token counts
	 */
	private Map<String, Integer> tokens;

	/**
	 * The class of the document
	 */
	private String category;

	/**
	 * Document constructor
	 */
	public Document() {
		this.tokens = new HashMap<>();
		this.category = new String();
	}

	public Map<String, Integer> getTokens() {
		return tokens;
	}

	public void setTokens(Map<String, Integer> tokens) {
		this.tokens = tokens;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Document [tokens=" + tokens + ", category=" + category + "]";
	}

}
