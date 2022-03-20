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
   productTax(
     * calculate the tax for each product.checks if the type is not food, meedical
     * products and books,
     * theese items do not have tax, other products have 10% tax.
     * if the product is imported then tax of 5% is added to the price of that.)

and getTotalPrice which is returning the total amount of the product.


When user choose some products, these added to the cart and ShoppingCart class is called.
method addToCart(
     * This method is receiving a product which user chose and an amount of product
     * that user wants to buy. Then it checks if the item is already in the shopping cart
     * list or not. If the item is in the list, the amount will be added to the same
     * product and if it is a new item, the productInCart type will be added to the list.)

, listContainsProduct(     
     * This method is checking if the chosen item is already in the shopping cart.
     * If it is a new item return null and if the item is in the list, it return the
     * productInCart type.)

, calBasePrice(     
    * calculate the base price without tax. checks all products in the cart and if it is not null
     * then multiply the price for each product in number of each product.)

and calcTotalTax(    
     * calculate the total tax for the products which are added to the shopping
     * cart. checks if  products in the shopping cart is not null then 
     *  multiply the the tax of each product in number of each product.)

and the Sale class is responsible for the list of all products.