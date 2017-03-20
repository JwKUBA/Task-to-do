
public class Task implements Comparable<Task> {

	private String name;
	private String description;
	private Priority priority;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	public Task(String name, String description, Priority priority) {
        setName(name);
        setDescription(description);
        setPriority(priority);
    }

	
	@Override
	public String toString() {
		return name + " - " + description;
	}

	@Override
	public int compareTo(Task o) {
		 return priority.compareTo(o.priority);
	}
	
	public enum Priority {
		HIGH, MODERATE, LOW;
	}
	

}
