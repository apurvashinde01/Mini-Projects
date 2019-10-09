
Project : College Database

Problem Statement
ABC College wants to maintain the database of the students and their course details. Based on the department of the students, the subjects will vary. Out of 5 subjects, 3 subjects are common for all the departments.
1.) Engineering Mathematics
2.) Physics
3.) Chemistry
The other 2 subjects will vary as follows.
ECE department: Microprocessor, Linear Integrated Circuits
Mechanical department: Fluid Mechanics, Thermodynamics
CSE department: Network Theory, Operating Systems

Use the Inheritance and Polymorphism Concepts to display the different types of course for each department. Use a method called displayCourseDetails() in the super class to display the common subjects and the same method to display the department specific courses in the Child classes. Note: the method should not be available to access outside the package. Use appropriate access specifiers. Using the inheritance and polymorphism concepts is a MUST.
Sample Input –
Departments:
1 ECE
2 Mechanical
3 CSE
Choose the department: 1
Sample output – 1: You have chosen ECE department.
The common subjects are:
Engineering Mathematics
Physics
Chemistry
ECE specific subjects are:
Microprocessor
Linear Integrated Circuits