# TestVagrant
This framework has for packages in src/mai/java
1) the firstone is base :- it has a TestBase class which is extended by all the other classes. It is used for initializing a browser driver for the browser name mentioned in config.properties file, load
properties file which is shared among all the classes.
2) the second package is config :- it contains config.properties file containing all the data inputs that can be used in execution. Such as if in futue we want to change the 
URL's, or movie name. We don't need to change anything in the code bas, simply we can change int this config file.
3) The third is pages :- This package consists of all the page-wise classes. and each class follows page factory concepts which means.. in a class all the locators and actons
that need to be perfomed for a page is defined here.
4) The fourth is the Utilities package :- this package has a class called Utilities, which contains most of the utility functions, that can be used for multiple times in our framework
and also for multiple purposes. eg:- clearAndSetValue, highlightElement etc.

In the src/test java:-
It has one test class as of now containing two test methods, 1 beforeclass method and one after class method.
test methods :- the 1st test methods assters the release date in poth the portals
                  the 2nd test method asserts the Country name in both the portals.
BeforClass methodd :- This class starts the browse and initialize all the classes required.
AfterClass method :- This methods quits the browser after execution.

How to execute :-
i) just simply get the framework from github link provided.
ii) import the project on ide
iii) run the TestNG.xml file
or
go to the project location
open cmd
and hit the command mvn clean test.


This Framework is designed as Page object Model and using TestNg as unit test framework.
All the loactors and Actions method are defined for each page in asingle java class.
This framework is scalable in future, i.e. if we want to add for functinalities to test, we can simply do that without modifing the architechture.
And any changes in configuration like, movie name, browsername, urls etc can be changed through config.properties file with making any changes in the code base.

Thalt all, Thank you !!
