package code_quality_BlackSador;

public class linkedList {

	element		first;
	element		next;
	
	int			size;
	
	void	addFrontElement(String elem) {
		element item = new element(elem);
		
		if (this.first == null) {
			this.first = item;
		}
		else {
			item.next = this.first;
			this.first = item;
		}
		size++;
	}
	
	void	addBackElement(String elem) {
		element	item = new element(elem);
		element iterator = this.first;

		if (this.first == null) {
			this.first = item;
			return;
		}
		
		while (iterator.next != null)
			iterator = iterator.next;
		
		iterator.next = item;
		size++;
	}
	
	void	addElementAtPosition(String elem, int pos) {
		element	item = new element(elem);
		element iterator = this.first;
		element previousIterator = this.first;
		int		counter = 0;
		
		if (pos <= 0) {
			addFrontElement(item.getValue());
			return;
		}
		else if (pos >= this.size) {
			addBackElement(item.getValue());
			return;
		}
		
		while (counter++ != pos && iterator.next != null) {
			previousIterator = iterator;
			iterator = iterator.next;
		}
		
		previousIterator.next = item;
		item.next = iterator;
		size++;
	}
	
	void	removeElementAtPosition(int pos) {
		element iterator = this.first;
		element previousIterator = this.first;
		int	counter = 0;
		
		if (size == 0)
			return;
		
		if (size == 1) {
			first = null;
			size = 0;
			return;	
		}
		
		if (pos <= 0) {
			first = first.next;
			return;
		}
		
		while (counter++ != pos && iterator.next != null) {
			previousIterator = iterator;
			iterator = iterator.next;
		}
		
		previousIterator.next = iterator.next;
		size--;
	}
	
	public void	displayList() {
		element iterator = this.first;
		
		while (iterator.next != null) {
			System.out.println(iterator.getValue());
			iterator = iterator.next;
		}
		System.out.println(iterator.getValue());
	}
	
	public linkedList() {
		size = 0;
	}
}