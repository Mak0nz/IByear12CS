# Paper 2 nov 2018 SL

## 10 a.
> **i)** An *Abstaract representation* of a *real-world* entity e.g., like Flight.java. A flight object will have *state* (attributes), only defined by a String id, and *behaviour* (methods) e.g. getID().

> **ii)** Because for each object we use a single file, OOP projects tend to be quite large in size (thus taking a lot of space in secondary storage). Moreover, OOP projects tend to take a long time compile/translate and this does have some effect on overall performance. From my experience, a CUDA script will outperform the equivalent in Java.

> **iii)** Keeping in mind SOLID principles, the S means that a module should be responsible to one, and only one, actor. This makes OOP projects very readable and easily linkable with a real-life domain. In fact, OOP is a very popular for business-like projects. When we get bugs, for example, a problem with arrival times, then most probably we will find the bug quickly in Arrival.java.

## 10 b.
> An Arrival *has a* (light dependency) with Flight object. We should not create an instance of Arrival without Flight.

## 10 c.
```
------------------------------
|          Arrival           |
------------------------------
| - Flight myFlight          |
| - String sta;              |
| - int runway;              |
| - String gate;             |
| - int delay;               |
| - boolean landed;          |
------------------------------
| + Arrival(Flight, String)  |
| + void addDelay(int)       |
| + String getETA()          |
| + int compareWith(String)  |
| + int compareWith(Arrival) |
------------------------------
```

## 10 d.
```
private static int search(String flightID)
{ 
    int index = -1; 
    // loop through all Arrival objects in inbound
    for(int i = 0; i < inbound.length; i++) {
        // get the next instance of Arrival
        Arrival tempArrival = inbound[i];
        if(tempArrival.compareWith(flightID) == 0) {
            index = i;
        }
    }
    // returns the index of the Arrival object with flightID
    return index;        
}
```

## 10 e.
> **i)** It may be faster as a search because it limits its search by half in each iteration. This is only possible because it is sorted.

> **ii)**  If it is not sorted it cannot work, therefore, when inserting new elements you have to make sure the order remains. This might require a sorting algorithm.

# HL Extension

![Engelbart](https://history-computer.com/ModernComputer/Basis/images/Engelbart.jpg)