package Project3;

import java.util.Scanner;

public class TaskManager {
    private Node head;

    // Constructor

    public TaskManager() {
        this.head = null;
        ask();
    }

    // Method to add a task to the task list

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        System.out.println("Project3.Task added successfully!");
    }

    // Method to display the task list

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks found!");
        } else {
            Node current = head;
            int count = 1;
            while (current != null) {
                System.out.println("Task " + count + ":\n" + current.getTask());
                current = current.getNext();
                count++;
            }
        }
    }

    // Method to mark a task as completed

    public void markTaskComplete(int taskIndex) {
        Node current = head;
        int count = 1;
        while (current != null) {
            if (count == taskIndex) {
                current.getTask().setStatus("Completed");
                System.out.println("Project3.Task marked as completed!");
                return;
            }
            current = current.getNext();
            count++;
        }
        System.out.println("Task not found!");
    }

    // Method to delete a task from the task list

    public void deleteTask(int taskIndex) {
        if (head == null) {
            System.out.println("No tasks found!");
            return;
        }
        if (taskIndex == 1) {
            head = head.getNext();
            System.out.println("Task deleted successfully!");
            return;
        }
        Node current = head;
        Node previous = null;
        int count = 1;
        while (current != null) {
            if (count == taskIndex) {
                previous.setNext(current.getNext());
                System.out.println("Task deleted successfully!");
                return;
            }
            previous = current;
            current = current.getNext();
            count++;
        }
        System.out.println("Task not found!");
    }
    public  void ask() {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Clear the input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = input.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = input.nextLine();
                    System.out.print("Enter priority (1 - High, 2 - Medium, 3 - Low): ");
                    int priority = input.nextInt();
                    input.nextLine(); // Clear the input buffer

                    Task task = new Task(name, dueDate, priority);
                    addTask(task);
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    System.out.print("Enter the task index to mark as completed: ");
                    int taskIndex = input.nextInt();
                    input.nextLine(); // Clear the input buffer

                    markTaskComplete(taskIndex);
                    break;
                case 4:
                    System.out.print("Enter the task index to delete: ");
                    int taskIndexToDelete = input.nextInt();
                    input.nextLine(); // Clear the input buffer

                    deleteTask(taskIndexToDelete);
                    break;
                case 5:
                    System.out.println("Exiting Task Manager...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        }
    }
}