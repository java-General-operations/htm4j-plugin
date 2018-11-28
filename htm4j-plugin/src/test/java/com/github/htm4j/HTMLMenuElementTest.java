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
	
	
	HTMLElement li,li2 = null ;
	
	li = JjDom.document.createElement(HTMLElementType.LI);
	
	li2 = JjDom.document.createElement(HTMLElementType.LI);
	
	li.setTextContent("Casa");
	li.setId("home");
	li2.setTextContent("Chi siamo");
	
	menuElement.appendChilds(li,li2);
	JjDom.document.getBody().appendChild(menuElement);
	
	// ora applico il metodo removeMenuItemById()
	
	boolean deleted = menuElement.removeMenuItemById("home");
	
	System.out.println(deleted);
	
	System.out.println(JjDom.document.getMarkup());
	
	
}
}
