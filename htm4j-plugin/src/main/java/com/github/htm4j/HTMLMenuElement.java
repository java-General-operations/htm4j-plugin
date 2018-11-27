package com.github.htm4j;

import cloud.jgo.jjdom.JjDom;
import cloud.jgo.jjdom.dom.HTMLDocument;
import cloud.jgo.jjdom.dom.HTMLElement;
import cloud.jgo.jjdom.dom.HTMLNode;
import cloud.jgo.jjdom.dom.concrete.HTMLDefaultElement;

public class HTMLMenuElement extends HTMLDefaultElement{

	public HTMLMenuElement(HTMLDocument document) {
		// TODO Auto-generated constructor stub
		super("ul",document);
	}
	
	@Override
	public HTMLElementType getType() {
		// TODO Auto-generated method stub
		return HTMLElementType.UL;
	}
	// inserisce una linea
	public HTMLMenuElement appendItemChild(String text){
		HTMLElement li = JjDom.document.createElement(HTMLElementType.LI);
		li.setTextContent(text);
		HTMLNode node = appendChild(li);
		if (node!=null)return this;
		else return null ;
	}
	// inserisce un link nella linea del menu
	public HTMLMenuElement appendItemChild(String href,String text){
		HTMLElement link = JjDom.document.createLink(href, text);
		HTMLElement li = JjDom.document.createElement(HTMLElementType.LI);
		li.appendChild(link);
		HTMLNode node = appendChild(li);
		if (node!=null)return this ;
		else return null ;
	}
}
