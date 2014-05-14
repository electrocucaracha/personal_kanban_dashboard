package mx.edu.umg.personalkaban;

import mx.edu.umg.personalkaban.model.Task;

public class User extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();

		System.out.println("Running " + name + " (Priority =" + priority
				+ ")...");

		Task task = new Task(name, (short) priority);
		if (task.save()) {
			Program.dashboard.add(task);
		}
	}
}
