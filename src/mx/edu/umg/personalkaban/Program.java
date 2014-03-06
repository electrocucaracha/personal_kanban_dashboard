package mx.edu.umg.personalkaban;

import mx.edu.umg.personalkaban.model.Dashboard;
import mx.edu.umg.personalkaban.model.IDashboard;
import mx.edu.umg.personalkaban.model.State;
import mx.edu.umg.personalkaban.model.Task;

public class Program {

	public static void main(String[] args) {
		Task task;
		IDashboard dashboard = new Dashboard();
		for (int i = 0; i < 15; i++) {
			task = new Task();
			task.setTitle("Task " + i);
			task.setState(State.DO_TO);

			if (dashboard.add(task)) {
				System.out.println("Added " + task.getTitle());
			}

		}

	}

}
