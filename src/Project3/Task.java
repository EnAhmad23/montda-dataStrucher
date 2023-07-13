package Project3;

public class Task {
    private String name;
    private String dueDate;
    private int priority;
    private String status;

    // Constructor
    public Task(String name, String dueDate, int priority) {
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = "Incomplete";
    }

    // Getters and setters for task properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Override toString() method to display task details

    @Override
    public String toString() {
        return "Project3.Task Name: " + name +
                "\nDue Date: " + dueDate +
                "\nPriority: " + priority +
                "\nStatus: " + status + "\n";
    }
}








