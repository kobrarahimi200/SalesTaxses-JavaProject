## Getting Started

Welcome to the program to calculate the tax for the purchased products. This Program is calculate the tax of product according to given criteria which is explained in the tax calculation section. Technical and theoretical expalanation is as follows. 

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Tax Calculation

Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical
products that are exempt. Import duty is an additional sales tax
applicable on all imported goods at a rate of 5%, with no exemptions. When I purchase items
I receive a receipt which lists the name of all the items and their price (including tax),
finishing with the total cost of the items,
and the total amounts of sales taxes paid. The rounding rules for sales tax are that for a tax
rate of n%, a shelf price of p contains (np/100 rounded up to the nearest 0.05) amount of
sales tax.

Here are the list of important classes: Product, ShoppingCart, ProductInCart and sales.
In the Product class there are some methods such as 
   productTax( calculate the tax for each product.checks if the type is not food, meedical products and books,theese items do not have tax, other products have 10% tax. if the product is imported then tax of 5% is added to the price of that.)

and getTotalPrice which is returning the total amount of the product.

When user choose some products, these added to the cart and ShoppingCart class is called.
method addToCart( This method is receiving a product which user chose and an amount of product that user wants to buy. Then it checks if the item is already in the shopping cart list or not. If the item is in the list, the amount will be added to the same product and if it is a new item, the productInCart type will be added to the list.)

, listContainsProduct(This method is checking if the chosen item is already in the shopping cart. If it is a new item return null and if the item is in the list, it return the productInCart type.)

, calBasePrice(calculate the base price without tax. checks all products in the cart and if it is not null then multiply the price for each product in number of each product.)

and calcTotalTax(calculate the total tax for the products which are added to the shopping cart. checks if  products in the shopping cart is not null then multiply the the tax of each product in number of each product.)

and the Sale class is responsible for the list of all products.

## How To run

Please download the program and open the command line. Go to the directory of the project folder with name of "SalesTaxses-JavaProject-master".

write the command `java -jar --enable-preview SalesTaxes.jar`.

 Atfer runnig successfuly you will be able to see the list of all products. 


A.
```
1 book : 12.49
2 music CD : 14.99
3 chocolate bar : 0.85
4 imported box of chocolates : 10.0
5 imported bottle of perfume : 47.5
6 packet of headache pills : 9.75
7 imported bottle of perfume : 27.99
8 bottle of perfume : 18.99
9 imported textile : 32.4
10 imported box of chocolates : 11.25
```

the left number is the id for product , name if the product , then the price for each unit.
then the bellow message is displayed.

B.
```
please enter your product id between 1 to 10
```

The number of all products are 10 so the selected number should be between 1 and 10.
 Now User can choose his/her product IDs. After entering the product ID the bellow message is shown:

C.
```
please enter number of your products
```

 User can enter the number of selected item.

 Then the bellow messages are shown:

 D.
 ```
 please enter your product id between 1 to 10 or 
 0 is to exit or 
 11 to show the list. 
 Prodcut ID :
 ```

 if he wants to continue shopping he can repeat the step B and C. 
 The 0 is used to exit the program.
 the 11 is used to display the list of all products.

 If user wants to end his shopping, after entering the 0 the Sales Tax and the total price of 
  selected products are calculated and displayed.






