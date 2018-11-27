package com.github.htm4j;

import cloud.jgo.jjdom.JjDom;

public class HTMLMenuElementTest {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	
	
	JjDom.newDocument().setMinimalTags().useDoctype(true).home().jqueryInit();
	
	
	JjDom.document.getTitle().setTextContent("Titolo del sito");
	
	
	HTMLMenuElement menuElement = new HTMLMenuElement(JjDom.document);
	
	menuElement.appendItemChild("#","Casa");
	menuElement.appendItemChild("#","Chi siamo");
	menuElement.appendItemChild("#","Contatti");
	
	JjDom.document.getBody().appendChild(menuElement);
	
	JjDom.document.printMarkup();
	
}
}
