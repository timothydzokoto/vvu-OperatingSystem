# SCAN (Elevator) algorithm 
In SCAN disk scheduling algorithm, head starts from one end of the disk and moves towards the other end, servicing requests in between one by one and reach the other end. Then the direction of the head is reversed and the process continues as head continuously scan back and forth to access the disk. So, this algorithm works as an elevator and hence also known as the elevator algorithm. As a result, the requests at the midrange are serviced more and those arriving behind the disk arm will have to wait.

## Advantages of SCAN (Elevator) algorithm 

- This algorithm is simple and easy to understand.
- SCAN algorithm have no starvation.
- This algorithm is better than FCFS Scheduling algorithm .

## Disadvantages of SCAN (Elevator) algorithm 
- More complex algorithm to implement.
- This algorithm is not fair because it cause long waiting time for the cylinders just visited by the head.
- It causes the head to move till the end of the disk in this way the requests arriving ahead of the arm position would get immediate service but some other requests that arrive behind the arm position will have to wait for the request to complete.