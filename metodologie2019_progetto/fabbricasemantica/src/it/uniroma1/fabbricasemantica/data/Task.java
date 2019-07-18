package it.uniroma1.fabbricasemantica.data;

public interface Task {

	default String getTaskID() {
		return toString();
	}
	
}
