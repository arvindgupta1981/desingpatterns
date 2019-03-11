# desingpatterns
<b>Why we should use Design Patterns:- </b><br>
1- Design patterns has one to many relationship with OOPS.<br>
2- Design patterns provides the proven/resuable solution of a re-occuring problem of software development.<br>
3- Design patterns provides a way to acheive loose coupling and hign cohennsion in the code <br>
4- We can easly modify the code in future which return according to the design patterns.<br>
5- Reduce the cost of writing duplicate code and testing.<br>

<b>1- Singleton Design Pattern:-</b><br>
<b>Why:-</b><br> 
Provide Synchronized access of a shared resource in multithred environment.<br>

<b>How we achieve:-</b> <br>
- Encapsulate the shared resource into a Singleton class (A class which has only one instance). <br>
- Provide an syncronized interface/method as a global access of shared resource.<br>

<b>Which OOPS prinicipal follow:- </b><br>
Encapsulation<br>
Loose coupling<br>

<b>Benefits</b><br>
Shared resource like notepad will corrupt if multiple threads will try to write text in the notepad concurrently. 

<b>Code Techinique:-</b><br>
- Create a simple class<br>
- Encapulate shared resource reference as a private variable into the class.<br>
- Encapulate the reference of the class as a private variable and instatiate it as an eager object creation.<br>
- Make constructor private.<br>
- Create a method to access object.<br>
- Create a synchronized method to access of shared resource. <br>

<br>
<br>
<b>2- Strategy Pattern </b><br>
<b>Why:-</b><br>
Provide a way to create new implementations in future of an implementation/method/class and exchange or change them in future without changes in the existing code.<br>
<b>How we achieve:-</b> <br>
- Create a class.
- Encapsulate the change into an interface and keep interface reference as a private/protected variable into the class.<br>
- We can create new implementations of the above interfaces in future.   
- Use dependency injection techniques to assign object to the above interface reference at run time.<br>

<b>Which OOPS prinicipal follow:- </b><br>
Encapsulation<br>
Abstraction<br>
Inerface Pattern<br>
Loose coupling<br>
Hign Cohension<br>



