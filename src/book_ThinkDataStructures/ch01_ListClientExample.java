package book_ThinkDataStructures;

import java.util.LinkedList;
import java.util.List;

public class ch01_ListClientExample {
	
	@SuppressWarnings("rawtypes")
	private List list;

	/**
	 * @param list
	 */
	@SuppressWarnings("rawtypes")
	public ch01_ListClientExample() {
		this.list = new LinkedList();
	}
	
	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		ch01_ListClientExample lce = new ch01_ListClientExample();
		@SuppressWarnings("rawtypes")
		List list = lce.getList();
		System.out.println("result"+list);
	}

}
