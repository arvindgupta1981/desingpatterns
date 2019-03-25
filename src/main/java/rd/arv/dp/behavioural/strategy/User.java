package rd.arv.dp.behavioural.strategy;

import java.util.LinkedList;

public class User {
	LinkedList<Integer> list = new LinkedList<Integer>();
	StrategyInterchanger<Integer> interchanger; 
	public User() {
		interchanger = new StrategyInterchanger<Integer>(new InsertionSort());
		
		list.add(10);
		list.add(1);
		list.add(110);
		list.add(5);
	}
	
	public LinkedList<Integer> getListFromDb() {
		interchanger.sort(list);		
		return list;
	}

}
