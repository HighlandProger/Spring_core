# Spring_core
Demonstration of Inversion of control and dependency injection

I mastered Spring_Core application configurated on Java file (spring/SpringConfig). 
There are classes, marked "@Component" (Mercedes, Bmw, Audi, Drive), which become beans (java objects). (Dependency Injection).
And one of these three classes puts into the Drive.class. It would be changed by entering necessary word (class name in lowercase letters) into annotation "@Qualifier".
So we can get the object we want int the Main.class and use it's methods by changeing just one word. (Inversion of Control).
-
