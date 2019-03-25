package rd.arv.dp.behavioural.strategy;
import java.util.LinkedList;

public class StrategyInterchanger<T> {
	Sortable sort = null;
	
	public StrategyInterchanger() {
		//nothing to do
	}
	
	public StrategyInterchanger(Sortable sort) {
		this.sort = sort;
	}
	
	public void sort(LinkedList<T> list) {
		this.sort.sort(list);
	}

	public Sortable getSort() {
		return sort;
	}

	public void setSort(Sortable sort) {
		this.sort = sort;
	}	
}
