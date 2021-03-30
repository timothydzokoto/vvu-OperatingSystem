# Multileve Queue Scheduling Algorithm
## A multi-level queue scheduling algorithm partitions the ready queue into several separate queues. The processes are permanently assigned to one queue, generally based on some property of the process, such as memory size, process priority, or process type. Each queue has its own scheduling algorithm.

## Advantages of Multilevel Queue Scheduling
- With the help of this scheduling we can apply various kind of scheduling for different kind of processes

## Disadvantages of Multilevel Queue Scheduling
- The main disadvantage of Multilevel Queue Scheduling is the problem of starvation for lower-level processes. Due to starvation lower-level processes either never execute or have to wait for a long amount of time because of lower priority or higher priority process taking a large amount of time.