package mx.edu.umg.personalkaban.model;

import java.util.Date;

/**
 * Group of actions related to specific goal.
 * 
 * @author vjmorale
 * 
 */
public class Task {
	private String title;
	private String description;
	private State state;
	private Category category;
	private short priority;
	private String owner;
	private Date dueDate;
	private Date createDate;

	public Task() {
		super();
		this.title = "";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null) {
			this.title = title;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public short getPriority() {
		return priority;
	}

	public void setPriority(short priority) {
		this.priority = priority;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String toString() {
		return this.title;
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Task) {
				return title.equals(((Task) obj).getTitle());
			}
		}
		return false;
	}

}