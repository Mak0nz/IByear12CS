# Paper 2 nov 2018 SL

## 10 a.
> **i)** An *Abstaract representation* of a *real-world* entity e.g., like Flight.java. A flight object will have *state* (attributes), only defined by a String id, and *behaviour* (methods) e.g. getID().

> **ii)** Because for each object we use a single file, OOP projects tend to be quite large in size (thus taking a lot of space in secondary storage). Moreover, OOP projects tend to take a long time compile/translate and this does have some effect on overall performance. From my experience, a CUDA script will outperform the equivalent in Java.

> **iii)** Keeping in mind SOLID principles, the S means that a module should be responsible to one, and only one, actor. This makes OOP projects very readable and easily linkable with a real-life domain. In fact, OOP is a very popular for business-like projects. When we get bugs, for example, a problem with arrival times, then most probably we will find the bug quickly in Arrival.java.

## 10 b.
> An Arrival *has a* (light dependency) with Flight object. We should not create an instance of Arrival without Flight.

## 10 c.
```
    ------------------------
    |       Arrival        |
    ------------------------
    | - Flight myFlight    |
    | - String sta;        |
    | - int runway;        |
    | - String gate;       |
    | - String delay;      |
    | - int delay;         |
    ------------------------
    | + arrival(flight,delay) |
    | + void addDelay(int) |
    | + void getETA()      |
```

# HL Extension

![Engelbart](https://history-computer.com/ModernComputer/Basis/images/Engelbart.jpg)