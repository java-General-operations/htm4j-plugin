package com.github.htm4j.nodes;
import java.awt.Menu;

import com.github.htm4j.nodes.HTMLMenuElement;

import cloud.jgo.jjdom.JjDom;
import cloud.jgo.jjdom.function;
import cloud.jgo.jjdom.dom.HTMLElement;
import cloud.jgo.jjdom.dom.HTMLElement.HTMLElementType;
import static cloud.jgo.jjdom.JjDom.jquery;
public class HTMLMenuElementTest {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	
	// okok bene
	
	JjDom.newDocument().setMinimalTags().useDoctype(true).home().jqueryInit();
	
	
	JjDom.document.getTitle().setTextContent("Titolo del sito");
	
	
	HTMLMenuElement menuElement = new HTMLMenuElement("nav",JjDom.document);
	
	
	HTMLMenuItem item = new HTMLMenuItem(JjDom.document,"home");
	HTMLMenuItem item2 = new HTMLMenuItem(JjDom.document,"contacts");
	HTMLMenuItem item3 = new HTMLMenuItem(JjDom.document,"documentation");
	
	
	menuElement.appendItems(item,item2,item3).printMarkup();
	
	// okok continuare ... con comodo ...
	
	
}
}
