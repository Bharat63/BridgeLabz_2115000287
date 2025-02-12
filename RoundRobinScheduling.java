class Process {
    int pid, burstTime, priority, remainingTime;
    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

class CircularLinkedList {
    Process head;

    public void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    public void removeProcess(int pid) {
        if (head == null) return;
        Process temp = head, prev = null;
        do {
            if (temp.pid == pid) {
                if (prev == null) {
                    Process last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (head == head.next) {
                        head = null;
                    } else {
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void roundRobinScheduling(int timeQuantum) {
        Process temp = head;
        int totalWaitingTime = 0, totalTurnaroundTime = 0, numProcesses = 0;
        while (temp != null) {
            numProcesses++;
            temp = temp.next;
            if (temp == head) break;
        }

        temp = head;
        while (temp != null) {
            Process current = temp;
            int waitingTime = 0, turnaroundTime = 0;
            int initialBurstTime = current.burstTime;

            while (current != null) {
                if (current.remainingTime <= timeQuantum) {
                    waitingTime += current.remainingTime;
                    turnaroundTime = waitingTime + current.remainingTime;
                    totalWaitingTime += waitingTime;
                    totalTurnaroundTime += turnaroundTime;
                    removeProcess(current.pid);
                    break;
                } else {
                    current.remainingTime -= timeQuantum;
                    waitingTime += timeQuantum;
                    temp = temp.next;
                }
            }
            current = current.next;
        }
        System.out.println("Average Waiting Time: " + (totalWaitingTime / numProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / numProcesses));
    }

    public void displayProcesses() {
        Process temp = head;
        if (head == null) {
            System.out.println("No processes.");
            return;
        }
        do {
            System.out.println("PID: " + temp.pid + " Burst Time: " + temp.burstTime);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        CircularLinkedList queue = new CircularLinkedList();
        queue.addProcess(1, 10, 1);
        queue.addProcess(2, 5, 2);
        queue.addProcess(3, 8, 3);
        queue.addProcess(4, 6, 4);

        System.out.println("Processes before scheduling:");
        queue.displayProcesses();

        queue.roundRobinScheduling(4);
    }
}
