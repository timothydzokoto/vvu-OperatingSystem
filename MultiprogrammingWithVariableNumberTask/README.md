# Multiprogramming with variable number of task
## MVT support for contiguous memory allocation technique.
## MVT is the memory management technique in which each job gets just the amount of memory it needs. That is, the partitioning of memory is dynamic and changes as jobs enter and leave the system.

## Advantages of Variable Partitioning 
- No Internal Fragmentation: In variable Partitioning, space in main memory is allocated strictly according to the need of process, hence there is no case of internal fragmentation. There will be no unused space left in the partition.
- No restriction on Degree of Multiprogramming: More number of processes can be accommodated due to absence of internal fragmentation. A process can be loaded until the memory is empty.
- No Limitation on the size of the process: In Fixed partitioning, the process with the size greater than the size of the largest partition could not be loaded and process can not be divided as it is invalid in contiguous allocation technique. Here, In variable partitioning, the process size can’t be restricted since the partition size is decided according to the process size.

## Disadvantages of Variable Partitioning
- Difficult Implementation:Implementing variable Partitioning is difficult as compared to Fixed Partitioning as it involves allocation of memory during run-time rather than during system configure.
- External Fragmentation:There will be external fragmentation inspite of absence of internal fragmentation.
For example, suppose in above example- process P1(2MB) and process P3(1MB) completed their execution. Hence two spaces are left i.e. 2MB and 1MB. Let’s suppose process P5 of size 3MB comes. The empty space in memory cannot be allocated as no spanning is allowed in contiguous allocation. The rule says that process must be contiguously present in main memory to get executed. Hence it results in External Fragmentation. 
