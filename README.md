# CSCI370-Project
## A hotel room service system

### Created by:
<ul>
<li>Sotiris Emmanouil</li>
</ul>
while taking Professor Aryeh Greenberg's "Software Engineering" course at CUNY Queens College (Spring 2023)

Sotiris implemented the Decorator Design Pattern with the following classes:

<ul>
<li> RoomService.java</li>
<li>WineService.java</li>
<li>WhiskeyService.java</li>
<li>ChampagneService.java</li>
</ul>

### Also two `JUNIT` tests in the class:
<ul>
<li>ServiceTest.java</li>
</ul>

which test the functionality of the ` servicesCost() ` and `servicesList()` methods.

### UML diagram for the Decorator Pattern:

<img width="656" alt="Screenshot 2023-04-16 at 5 18 43 PM" src="https://user-images.githubusercontent.com/108318635/232342744-ff19d977-f512-4434-99aa-e8da2b0efbf4.png">

### Component Test:
A hotel guest would like to purchase a bottle of wine and have it delivered to his hotel
room. Once the order is placed, if the `serviceCost()` method is called upon the service object, the
console will now print: 35.50. If the `servicesList()` method is called on the service object, it will
return “Delivered Wine”, because as of now, only a bottle of wine was ordered.

