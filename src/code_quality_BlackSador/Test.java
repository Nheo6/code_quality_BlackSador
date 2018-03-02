package code_quality_BlackSador;

public class Test {

	public static void main(String[] args) {
		linkedList	list = new linkedList();
		
		list.addFrontElement("Salut");
		list.addFrontElement("hey");
		list.addBackElement("back");
		list.addFrontElement("bonjour");
		list.addFrontElement("toto");
		
		list.addElementAtPosition("yo", 2);
		
		list.removeElementAtPosition(12);
		
		list.displayList();
		//System.out.println("Coucou");
	}
}
