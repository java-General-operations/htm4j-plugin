package com.github.htm4j.nodes;
import static cloud.jgo.jjdom.JjDom.*;
import cloud.jgo.jjdom.JjDom;
import cloud.jgo.jjdom.function;
import cloud.jgo.jjdom.dom.HTMLDocument;
import cloud.jgo.jjdom.dom.HTMLElement;
import cloud.jgo.jjdom.dom.HTMLElements;
import cloud.jgo.jjdom.dom.HTMLNode;
import cloud.jgo.jjdom.dom.concrete.HTMLDefaultElement;
public class HTMLMenuElement extends HTMLDefaultElement{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HTMLMenuElement(HTMLDocument document) {
		// TODO Auto-generated constructor stub
		super("ul",document);
	}
	public HTMLMenuElement(String id,HTMLDocument document) {
		// TODO Auto-generated constructor stub
		super("ul",document);
		setId(id);
	}
	
	public HTMLMenuElement(HTMLDocument document,String...classes) {
		// TODO Auto-generated constructor stub
		super("ul",document);
		addClasses(classes);
	}
	
	@Override
	public HTMLElementType getType() {
		// TODO Auto-generated method stub
		return HTMLElementType.UL;
	}
	
	// Methods 
	
	// fisrt method : simple 
	public HTMLMenuElement appendItem(HTMLMenuItem item) {
		appendChild(item);
		return this ;
	}
	
	public HTMLMenuElement appendItems(HTMLMenuItem...items) {
		for (HTMLMenuItem htmlMenuItem : items) {
			appendItem(htmlMenuItem);
		}
		return this ;
	}
	
}
