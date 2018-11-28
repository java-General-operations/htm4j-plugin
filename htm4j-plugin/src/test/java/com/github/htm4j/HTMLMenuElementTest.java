package com.github.htm4j;

import cloud.jgo.jjdom.JjDom;
import cloud.jgo.jjdom.dom.HTMLElement;
import cloud.jgo.jjdom.dom.HTMLElement.HTMLElementType;

public class HTMLMenuElementTest {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	
	// okok bene
	
	JjDom.newDocument().setMinimalTags().useDoctype(true).home().jqueryInit();
	
	
	JjDom.document.getTitle().setTextContent("Titolo del sito");
	
	
	HTMLMenuElement menuElement = new HTMLMenuElement("nav",JjDom.document);
	
}
}
