# Paging
Paging is a memory management technique in which process address space is broken into blocks of the same size called pages (size is power of 2, between 512 bytes and 8192 bytes). The size of the process is measured in the number of pages.

Similarly, main memory is divided into small fixed-sized blocks of (physical) memory called frames and the size of a frame is kept the same as that of a page to have optimum utilization of the main memory and to avoid external fragmentation.

Page address is called logical address and represented by page number and the offset.

Frame address is called physical address and represented by a frame number and the offset.

A data structure called page map table is used to keep track of the relation between a page of a process to a frame in physical memory.

When the system allocates a frame to any page, it translates this logical address into a physical address and create entry into the page table to be used throughout execution of the program.

When a process is to be executed, its corresponding pages are loaded into any available memory frames.
This process continues during the whole execution of the program where the OS keeps removing idle pages from the main memory and write them onto the secondary memory and bring them back when required by the program.

##Advantages of Paging
Given below are some advantages of the Paging technique in the operating system:

- Paging mainly allows to storage of parts of a single process in a non-contiguous fashion.
- With the help of Paging, the problem of external fragmentation is solved.
- Paging is one of the simplest algorithms for memory management.

## Disadvantages of Paging
Disadvantages of the Paging technique are as follows:
- In Paging, sometimes the page table consumes more memory.

- Internal fragmentation is caused by this technique.

- There is an increase in time taken to fetch the instruction since now two memory accesses are required.