package mx.edu.umg.personalkaban;

import mx.edu.umg.personalkaban.model.Dashboard;
import mx.edu.umg.personalkaban.model.Task;

public class Program {

	public static void main(String[] args) {
		Task task = new Task();
		
		task.setDescription("Complete this program");
		task.setState(0); // TODO : Pull those changes into github repository
		
		Dashboard dashboard = new Dashboard();
		if (dashboard.add(task)){
			System.out.println("Added");
		}
		
	}

}
