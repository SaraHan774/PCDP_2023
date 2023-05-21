### Parallel Programming in Java : Module 1 
#### Notes
- Reciprocal array sum using `RecursiveAction` and `ForkJoinPool` 
- For some reason, ForkJoinPool(2) would always end up failing tests. So I used ForkJoinPool.commonPool() instead. 
- Chunking logic is only speeding upto 90% of the maximum speed up limit. I have no idea how to further optimize this code.   
