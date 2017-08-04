In real world projects, the Decorator Pattern is used to implement GUI components as mentioned in the GoF book. In the Java platform, the pattern is used to develop the InputStream and OutputStream subclasses. In addition, people also use it to develop debugging/profiling tools.
Let’s write 2 List profiler classes with the Decorator Pattern – LinkedListProfiler and ArrayListProfiler. Then compare how much it takes to run some key methods and print the result that looks like the following
```
boolean add(E e)
boolean remove(Object o)
boolean contains(Object o)
int size()
```