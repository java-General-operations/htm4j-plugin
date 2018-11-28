package com.github.htm4j;
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
	@Override
	public HTMLElementType getType() {
		// TODO Auto-generated method stub
		return HTMLElementType.UL;
	}
	// inserisce una linea
	public HTMLMenuElement appendMenuItem(String item){
		HTMLElement li = JjDom.document.createElement(HTMLElementType.LI);
		li.setTextContent(item);
		HTMLNode node = appendChild(li);
		if (node!=null)return this;
		else return null ;
	}
	public HTMLMenuElement appendMenuItems(String...items){
		for (String item : items) {
			appendMenuItem("#", item);
		}
		return this ;
	}
	// inserisce un link nella linea del menu
	public HTMLMenuElement appendMenuItem(String href,String item){
		HTMLElement link = JjDom.document.createLink(href, item);
		HTMLElement li = JjDom.document.createElement(HTMLElementType.LI);
		li.appendChild(link);
		HTMLNode node = appendChild(li);
		if (node!=null)return this ;
		else return null ;
	}
	// questo metodo aggiunge l'id al link
	public HTMLMenuElement appendMenuItem(String href,String item,String id){
		HTMLElement link = JjDom.document.createLink(href, item);
		link.setId(id);
		HTMLElement li = JjDom.document.createElement(HTMLElementType.LI);
		li.appendChild(link);
		HTMLNode node = appendChild(li);
		if (node!=null)return this ;
		else return null ;
	}
	
	// aggiunge la classe al link
	public HTMLMenuElement appendMenuItems(String className,String...items) {
		for (String item : items) {
			HTMLElement link = JjDom.document.createLink("#", item);
			link.addClass(className);
			HTMLElement li = JjDom.document.createElement(HTMLElementType.LI);
			li.appendChild(link);
			HTMLNode node = appendChild(li);
		}
		return this ;
	}
	
	public HTMLMenuElement appendMenuItems(String linkClassName,String liClassName,String...items) {
		for (String item : items) {
			HTMLElement link = JjDom.document.createLink("#", item);
			link.addClass(linkClassName);
			HTMLElement li = JjDom.document.createElement(HTMLElementType.LI);
			li.addClass(liClassName);
			li.appendChild(link);
			HTMLNode node = appendChild(li);
		}
		return this ;
	}
	
	
	// metodi per eliminare :
	public boolean removeMenuItem(final String item){
		boolean deleted = false ;
		HTMLElements li = $("li", 0);
		for (HTMLElement htmlElement : li) {
			if (li.getElementsByTag("a").element()!=null) {
				// abbiamo un link che contiene il testo
				HTMLElement link = li.getElementsByTag("a").element();
				if (link.getTextContent().equals(item)) {
					HTMLNode parent = htmlElement.getParentNode();
					HTMLNode deletedNode = parent.removeNode(htmlElement);
					if (deletedNode!=null) {
						deleted = true ;
						break ;
					}
				}
			}
			else{
				if (htmlElement.getTextContent().equals(item)) {
					HTMLNode parent = htmlElement.getParentNode();
					HTMLNode deletedNode = parent.removeNode(htmlElement);
					if (deletedNode!=null) {
						deleted = true ;
						break ;
					}
				}
			}
		}
		return deleted ;
	}
	public boolean removeMenuItemById(String itemId){
		HTMLElement element = getElementById(itemId);
		HTMLNode deletedNode = null ;
		boolean deleted = false ;
		if (element!=null) {
			if (element.getNodeName().equals("li")) {
				deletedNode = element.getParentNode().removeNode(element);
				if (deletedNode!=null) {
					deleted = true ;
				}
			}
			else if(element.getNodeName().equals("a")){
				HTMLNode parent = element.getParentNode().getParentNode();
				deletedNode = parent.removeNode(element.getParentNode());
				if (deletedNode!=null) {
					deleted = true ;
				}
			}
		}
		return deleted ;
	}
	public HTMLMenuElement removeMenuItemsByClass(String...classes){
		for (String clazz : classes) {
			HTMLElements li = getElementsByClassName(clazz);
			for (HTMLElement htmlElement : li) {
				removeNode(htmlElement);
			}
		}
		return this;
	}
	public HTMLMenuElement removeAllItems(){
		$("li").each(new function() {
			
			public Object function(Object e) {
				
				int index = (Integer) e ;
				
				removeNode(element(index));
				
				return true ;
			}
		});
		return this ;
	}
}
