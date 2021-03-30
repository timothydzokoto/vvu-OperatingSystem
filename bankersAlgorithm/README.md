# Bankers algorithm
## The banker’s algorithm is a resource allocation and deadlock avoidance algorithm that tests for safety by simulating the allocation for predetermined maximum possible amounts of all resources, then makes an “s-state” check to test for possible activities, before deciding whether allocation should be allowed to continue.
## Bankers algorithm make use of the following variables
- Available : indicating the number of available resources of each type.
- Max : defines the maximum demand of each process in a system.
- Allocation : defines the number of resources of each type currently allocated to each process.
- Need : indicates the remaining resource need of each process.

## Characteristics of Banker's Algorithm
- Keep many resources that satisfy the requirement of at least one client
- Whenever a process gets all its resources, it needs to return them in a restricted period.
- When a process requests a resource, it needs to wait
- The system has a limited number of resources
- Advance feature for max resource allocation

## Drawbacks of Bankers Algorthim
- Does not allow the process to change its Maximum need while processing
- It allows all requests to be granted in restricted time, but one year is a fixed period for that.
- All processes must know and state their maximum resource needs in advance.