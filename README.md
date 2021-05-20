# Functional Programing in Java

* a Lambda function is an anonymous function
* Must use an interface which must have only one abstract method
* Cannot use an abstract class

#### Functional Interfaces in the java.util.function package

###### Consumer<T>
* Operation that takes a single value and return no result
* BiConsumer takes two values and returns no results `-andThen`
* `String s -> System.out.println(s)`

###### Supplier<T>
* does not take any parameters and returns a result
* `() -> getLogMessage();`

###### Function<T,R>
* accepts one argument and returns a result
* a `BiFunction<T,U,R> `accepts two parameters and returns a result types can be different
* `String s -> s.getName();`
* c`ompose, andThen`


###### UnaryOperator
* same like a function but the parameter and the return type are the same
- `T apply(T t)`
* `replaceAll(takes a unary operator)`

* String s -> s.toLowerCase();

* BinaryOperator al the parameters and the results are the same

###### Predicate
* a function that takes one argument and always returns a boolean
* BiPredicate takes two arguments and always returns a boolean
* ` and(); or(); negate(); isEquals();`
* `Student s -> s.graduationYear == 2011;`
* removeif(takes a predicate)

###### method reference provide a shorthand notation for simple lambdas they are used to call an existing method or constructor

* Lambda Expressions can refer to _effectively final_ variable from surrounding scope

##### Elements of a stream
* a stream simplify the description of aggregate computation it exposes opportunities for optimisation
###### Three types of a stream
* Source -> 
* Zero or more intermediate operations
* Terminal operation

* the pipeline is only executed when the terminal operation is called
* operations can be sequential or parallel 
* Intermediate operations can be merged
* by default, stream produces elements that are objects
* to avoid unnecessary object creation stream have three primitive type stream `IntStream, DoubleStream, LongStream` Use methods like `mapToInt, mapToLong, mapToDouble`

###### Stream sources
there are 71 methods from 15 classes that can be used as stream sources
* collections interface
* Arrays Class
* Files Class
* Random Numbers
* BufferedReader -> line()

###### Static stream methods
* `concat(stream, stream), empty()`
* of(T... values)
* `range(int, int), rangeClosed(int, int)` a stream from a start to an end value
* `generate(intSupplier), iterate(int, IntUnaryOperator)`

###### Intermediate operations
* `distinct()` -> returns a stream with no duplicates
* `filter(Predicate p)` -> returns a stream with elements that returns true for the predicate
* `map(Function f)` 1 to 1 mapping-> where the given Function is applied to each element on the input stream
* `maToInt(), mapToDouble(), mapToLong()` returns a stream of primitive type
* `flatMap() `one to many mapping then output a single output

* _`skip(long n)_` -> returns a strem that ignores the first n elements of the input stream
* `limit(long n)` -> returns a stream that only contains the first n elements of the input stream
* `sorted(Comparator c)` returns a stream that is sorted in the order specified by the comparator c
* `sorted()` - uses natural ordering
* `unorderd()` -> returns a stream that is not ordered - inherited from `BaseStream` can improve performance for operations like `distinct()` and `groupingBy()`
* `peek(Consumer c)` -> returns an output that is identical to the stream - each element is passed to the accept method of the consumer - the consumer must not modify the elements of the stream - useful for debugging and doing more than one thing with a stream

###### Terminal operations
* `findFirst(Predicate p)` -> works with both sequential & parallel streams - returns the first element that matches using the given predicate
* `findAny(Predicate p)` -> same as above but uses parallelStream
* `boolean allMatch(Predicate p)` -> returns true/false if all the elements matches the predicate
* `boolean anyMatch` -> true/false if any of the elements matches the predicate
* `boolean noneMatch` ->  whether no element matching  the predicate
* `collector(Collector c)` -> perform mutable reduction of a stream
* `toArray()` -> return an array containing the elements of the stream

* `count()`
* `max(Comparator)` -> returns an optional
* `min(Comparator)` -> returns an optional
* `average()` -arithmetic mean - returns an optional
* `sum()` - returns 0 if no elements in stream

* `forEach(Consumer c)` -> takes a consumer as a parameter
* `forEachOrdered(Consumer c`)`

* `reduce(BinaryOperator accumulator) `-> returns an optional

###### Understanding reductions
*

###### Optional<T>

