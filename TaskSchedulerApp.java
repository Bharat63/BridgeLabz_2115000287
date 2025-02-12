import java.util.Scanner;

class Task {
    int id, priority;
    String name, dueDate;
    Task next;
    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    private Task head;
    
    void addTaskAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
    }
    
    void addTaskAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
    }
    
    void removeTask(int id) {
        if (head == null) return;
        Task temp = head, prev = null;
        if (head.id == id && head.next == head) {
            head = null;
            return;
        }
        do {
            if (temp.id == id) {
                if (prev != null) prev.next = temp.next;
                else {
                    Task last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
    
    void viewCurrentAndMoveNext() {
        if (head == null) return;
        System.out.println(head.id + " " + head.name + " " + head.priority + " " + head.dueDate);
        head = head.next;
    }
    
    void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
    
    void searchTaskByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority)
                System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();
        while (true) {
            System.out.println("1. Add Task Beginning 2. Add Task End 3. Remove Task 4. View and Move Next 5. Display Tasks 6. Search by Priority 7. Exit");
            int choice = scanner.nextInt();
            if (choice == 7) break;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter ID, Name, Priority, Due Date:");
                    scheduler.addTaskAtBeginning(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                }
                case 2 -> {
                    System.out.println("Enter ID, Name, Priority, Due Date:");
                    scheduler.addTaskAtEnd(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                }
                case 3 -> {
                    System.out.println("Enter Task ID to Remove:");
                    scheduler.removeTask(scanner.nextInt());
                }
                case 4 -> scheduler.viewCurrentAndMoveNext();
                case 5 -> scheduler.displayTasks();
                case 6 -> {
                    System.out.println("Enter Priority to Search:");
                    scheduler.searchTaskByPriority(scanner.nextInt());
                }
            }
        }
        scanner.close();
    }
}
