# Best Fit
The best fit deals with allocating the smallest free partition which meets the requirement of the requesting process. This algorithm first searches the entire list of free partitions and considers the smallest hole that is adequate. It then tries to find a hole which is close to actual process size needed.

## Advantage
Memory utilization is much better than first fit as it searches the smallest free partition first available.

##Disadvantage
It is slower and may even tend to fill up memory with tiny useless holes.