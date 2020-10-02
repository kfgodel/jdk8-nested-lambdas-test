### JDK 8 Compilation Test

This projects serves as a testbed to measure compilation time on Jdk8 (and jdk11) for
a couple of test classes that use nested lambdas to define its behavior.

Weirdly enough, **using JDK8** to compile
[SlowCompilationTest](src/test/java/com/tenpines/test/SlowCompilationTest.java) 
**takes 2x longer** than [FastCompilationTest](src/test/java/com/tenpines/test/FastCompilationTest.java).
The difference is that `SlowCompilationTest` defines its test inside a 5 level deep lambda, while
`FastCompilationTest` defines them on the top level.

**However, if you use JDK11 the compilation time is very similar**.