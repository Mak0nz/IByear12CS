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
|   - String itemId    |                 |                      |
|                      |                 |                      |
|                      |                 |                      |
|                      |                 |                      |
------------------------                 ------------------------
|   + double getVal()  |                 |                      |
|                      |                 |                      |
|                      |                 |                      |
|                      |                 |                      |
------------------------                 ------------------------
```

> **ii)** Let us imagine that we are renaming a method in the `sales` object e.g., `getValue()`. This method is probably used <u>outside of the class</u> so we would need to make sure to change the code that used to reference this method. These kind of activities are difficult and can result in bugs.

## 11 D.
```
Output:
- 102 
- 2
- 2550.40
- 5000
```

## 11 E.
```java
public double calcTotalSales(){
    // input
    double total = 0;

    // process
    for (int i = 0; i < count; i++) {
        // value of sale at index i
        double saleValue = this.salesHistory[i].getValue() * this.salesHistory[i].getQuantity();
        // add it to the total
        total += saleValue;
    }

    // output
    return total;
}
```

## 11 F.
```java
// assuming this is in the main method
public String highest(){
    // input
    string highestId = null;
    double highestTotal = 0;

    // process
    for int(int i = 0; i < salesPeople.length; i++){
        double totalSale = salesPeople[i].calcTotalSales();
        if (totalSale > highestTotal) {
            highestTotal = totalSale;
            highestId = salesPeople[i].getId();
        }
    }

    // output
    return highestId;
}
```

## 11 G.
```java
public void addSales(Sales s, String id){
    for (int i = 0; i < SalesPerson.length; i++) {
        if (id.equals(SalesPerson[i].getId())) {
            // add the sales object s
            salesPerson[i].setSalesHistory(s);
            break;
        }
    } 
}
```

