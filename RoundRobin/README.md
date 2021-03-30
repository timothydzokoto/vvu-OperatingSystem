# Round Robin scheduling algorithm 
## Round Robin scheduling algorithm is mainly designed for time-sharing systems. This algorithm is similar to FCFS scheduling, but in Round Robin(RR) scheduling, preemption is added which enables the system to switch between processes.

###A fixed time is allotted to each process, called a quantum, for execution.

Once a process is executed for the given time period that process is preempted and another process executes for the given time period.

Context switching is used to save states of preempted processes.

This algorithm is simple and easy to implement and the most important is thing is this algorithm is starvation-free as all processes get a fair share of CPU.

## Advantages of Round Robin Scheduling Algorithm
Some advantages of the Round Robin scheduling algorithm are as follows:

- While performing this scheduling algorithm, a particular time quantum is allocated to different jobs.

- In terms of average response time, this algorithm gives the best performance.

- With the help of this algorithm, all the jobs get a fair allocation of CPU.

- In this algorithm, there are no issues of starvation or convoy effect.

- This algorithm deals with all processes without any priority.

- This algorithm is cyclic in nature.

- In this, the newly created process is added to the end of the ready queue.
- Also, in this, a round-robin scheduler generally employs time-sharing which means providing each job a time slot or quantum.

- In this scheduling algorithm, each process gets a chance to reschedule after a particular quantum time.

## Disadvantages of Round Robin Scheduling Algorithm
Some disadvantages of the Round Robin scheduling algorithm are as follows:

- This algorithm spends more time on context switches.
- For small quantum, it is time-consuming scheduling.

- This algorithm offers a larger waiting time and response time.

- In this, there is low throughput.

If time quantum is less for scheduling then its Gantt chart seems to be too big.