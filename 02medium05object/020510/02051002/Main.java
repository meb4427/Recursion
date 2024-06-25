class Task {
    public String name;
    public Task next;

    public Task(String name) {
        this.name = name;
        this.next = null;
    }
}

class TodoList {
    public Task head;

    public TodoList() {
        this.head = null;
    }

    public void printList() {
        System.out.println("Printing the Todo List...");

        Task currentNode = this.head;
        while(currentNode != null) {
            System.out.println(currentNode.name);
            currentNode = currentNode.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        TodoList toDoList = new TodoList();

        Task task1 = new Task("Fix the alarm");
        toDoList.head = task1;

        Task task2 = new Task("Go to the dentist to pick up my grandmother");
        task1.next = task2;

        Task task3 = new Task("Call a handyman to fix an appliance");
        task2.next = task3;

        Task task4 = new Task("Go to the park for a jog");
        task3.next = task4;

        toDoList.printList();
    }
}
