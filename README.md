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
- Create a static method to access object.<br>
- Create a synchronized method to access of shared resource. <br>

<b>Examples</b>
- Logger Api
- Jdbc Driver Manager API
- FTP API

<br>
<br>
<b>2- Strategy Pattern </b><br>
<b>Why:-</b><br>
Provide a way to create new implementations in future of an implementation/method/class and exchange or change them in future without changes in the existing code.<br>
<b>How we achieve:-</b> <br>
- Create a class and identify the method which could be change in future.
- Encapsulate the change into an interface and keep interface reference as a private/protected variable into the class.<br>
- We can create new implementations of the above interfaces in future.   
- Use dependency injection techniques to assign object to the above interface reference at run time.<br>

<b>Which OOPS prinicipal follow:- </b><br>
Encapsulation<br>
Abstraction<br>
Inerface Pattern<br>
Loose coupling<br>
Hign Cohension<br>

<b>Code Techinique:-</b><br>
- Create the interfaces for all methods of the class that could be change in future.<br>
- Create implementation classes of the interfaces.<br>
- Add interface reference as a private/protected variables.<br>
- Create a client class and add conditions for each interface.<br>
- Create and object of implementation class for each condition and set the object into the main class by using dependency injection.<br>

<b>Examples</b>

<br>
<br>
<b>Command Pattern </b><br>
- Provides a way to execute commands of an object at run time and we don't know which has to execute. <br>
- Provides a way to encapsulate command into classes and these classes implement an interface that has method exec().<br>
- It's base on the same Strategy Pattern prinicipal but we don't know the change method in advance in Command pattern.<br>

<b>Which OOPS prinicipal follow:- </b><br>
Encapsulation<br>
Abstraction<br>
Inerface Pattern<br>
Loose coupling<br>
Hign Cohension<br>

<b>How we achieve:-</b> <br>
The Confusing three actors:- <br>
Invoker/Admin - Starter of excution of the command <br>
Receiver - Process the command <br>
Client - Create command object and call invoker to execute of the command. <br>
- Create an exceutor interfaces with exec() method. <br>
- create interfaces for eash command and extend executor interface. <br>
- Create Receiver implementation classes for each interface.  <br>
- Create Invoker class and create an interface refernce vaiable inot the class and add dependency injection method/constructor. <br>
- Create client. set the dependency by adding condition for each command. <br>


