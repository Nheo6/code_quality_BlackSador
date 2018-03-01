package code_quality_BlackSador;

public class element {

	String	value;
	
	element	next;

	String	getValue() {
		return value;
	}
	
	element	getNext() {
		return next;
	}
	
	void	setNext(element	elem) {
		next = elem;
	}
	
	public element(String Elemvalue) {
		value = Elemvalue;
		
		System.out.println("Element ajouté, value : " + value);
	}

}
