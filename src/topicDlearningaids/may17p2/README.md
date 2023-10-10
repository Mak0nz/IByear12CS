# Paper 2 may 2017

## 11 a.
```java
public SalesPerson(String id) {
    this.id = id;
    this.salesHistory = new Sales[100];
    this.count = 0;
}
```

## 11 b.
> In Java, `private`, `public` and `protected` are accessor modifiers which developers use for <u>encapsulating</u> the data. When attributes are `private` they cannot be accessed <u>outside the class</u>. To give "read access" the developer must provide <u>accessor methods</u> e.g. `public int getCount()` and `public String getId()`.

## 11 C.
> **i)** `SalesPerson` <u>has many</u> `Sales`
```
------------------------                 ------------------------
|                      |                 |                      |
|        Sales         |     ------<>    |     SalesPerson      |
|                      |                 |                      |
------------------------                 ------------------------
|                      |                 |                      |
|                      |                 |                      |
|                      |                 |                      |
|                      |                 |                      |
------------------------                 ------------------------
|                      |                 |                      |
|                      |                 |                      |
|                      |                 |                      |
|                      |                 |                      |
------------------------                 ------------------------
```

> **ii)** Let us imagine that we are renaming a method in the `sales` object e.g., `getValue()`. This method is probably used <u>outside of the class</u> so we would need to make sure to change the code that used to reference this method. These kind of activities are difficult and can result in bugs.

## 11 D.