# Fast-Food-App

## Introduction
Our team has decided to create a Fast-Food Management Application. This is an application where customers will be able to see a list of food items available within a restaurant, add their desired items into a cart, and check out. While the servers will be able to view existing orders and update their status once the food is served/delivered. 

## Story Board
![image](https://github.com/Emiller321/Fast-Food-App/blob/main/ImagesStoryboard/storyboard.png)

## Functional Requirements

### Scenario
As an admin, I want to be able to modify the food items sold in the restaurant.

### Example
**Given**: A feed of food data are available
**When**: The user/service puts Food Name as "Chicken Burger"
**When**: The user/service adds Food Category as "Snacks" to a Chicken Burger
**When**: The user/service adds Food Price as "12.99" to a Chicken Burger
**Then**: The user’s/service’s Chicken Burger will be saved with Snacks as Category as 12.99 as Price.

###Example
**Given**: Food data are available
**When**: The user/service searches for “kajsd;luaopuidfjo;aj;sd”
**Then**: Fast Food Application will not return any results.

###Example
**Given**: Food data are available, and specimen 9 is Italian Pizza.
**When**: The user/service searches for the food with ID “9”.
**Then**: Fast Food Application will return exactly one specimen record for "Italian Pizza".

###Example
**Given**: Food data are available
**When**: The user/service posts a new Food object with valid attributes, "foodName="Coke", foodCategory="Drinks", food
Description="Sample Description", foodPrice="Price".
**Then**: FastFoodApplication will create a new food for this record, and will return this new food object.

## Scenario
As a customer, I want to see all the food items available along with additional information such as category, nutritional information, price, etc. so that I can use it to place my required items into my shopping cart. 

### Example
**Given**: Given the application homepage
**When**: When I fill in the choices within Category, Nutrition, and Price, and press ‘Search’
**Then**: Then I should see a list of all the food items that match my criteria. 

### Example
**Given**: Given a list of food items
**When**: When I select on one of the food items, look at its description, photos, nutritional info, etc., fill in a required quantity of the item in a textbook, and click on the ‘Add to Cart’ button
**Then**: Then my shopping cart should have the item with the aforementioned quantity.

## Scenario
As a customer, I want a shopping cart where I can insert, delete, and update items so that I can checkout and get my items delivered to me

### Example
**Given**: Given the page displaying cart information 
**When**: When I click on the pencil icon (Edit) for any food item, then insert a new quantity, and press ‘Update’
**Then**: Then my shopping cart should have the item with the updated quantity of food items. 

### Example
**Given**: Given the page displaying cart information
**When**: When I click on the cross icon (Delete) and press on ‘Confirm’ in the displayed pop-up
**Then**: Then my shopping cart should remove the item. 

### Example
**Given**: Given the page displaying cart information
**When**: When I click on ‘Checkout’, insert my personal details and payment information 
**Then**: Then my food should get delivered to me. 

### Scenario
As a customer, I want the ability to create an account so that I can save some of my information such as name, address, payment information, preferences, etc. 

### Example
**Given**: Given the application sign’s up page
**When**: When I insert my personal details and confirm my email address
**Then**: Then I should be able to log into the application with a personalized account. 

### Example
**Given**: Given the account’s page
**When**: When I view my details, click on the ‘Edit’ icon next to my details, fill in the updated value, and click on ‘Update’
**Then**: Then my account’s information should change with the updated value

### Scenario
As a server, I want access to view existing orders so that I can get them delivered and update their status in the application. 

### Example
**Given**: Given the application’s backend page, 
**When**: When I press on ‘View Orders’, and filter according to criteria (currently active, date, etc.), 
**Then**: Then I should be able to generate a list of all the orders that meet my criteria. 

### Example
**Given**: Given a particular order, 
**When**: When I successfully deliver the order and update its status as delivered, 
**Then**: Then the system should mark it as completed and send a confirmation email to the customer. 

### Example
**Given**: Given a particular order, 
**When**: When the order is cancelled due to some error and its status is updated as cancelled, 
**Then**: Then the system to mark it as incomplete and send a confirmation email to the customer. 


## Class Diagram
![ClassDiagram](https://user-images.githubusercontent.com/54557245/133008270-bb24f9df-cfe9-4d55-be1c-5f06c159d368.png)

## JSON Schema

{ 

  "type" : "object", 

  "properties" : { 

    "name" : { 

      "type" : "string" 

    }, 

    "age" : { 

      "type" : "integer" 

    }, 

    "email" : { 

      "type" : "string" 

    } 

  } 

} 

## Scrum Roles

UI Specialist – Haseeb Ikram & Bangyan Ju 

Business Logic and Persistence Specialist – Eric Miller & Alexander Burnett  

Scrum Master/GitHub Administrator – Bipal Goyal 

## Github Link

https://github.com/Emiller321/Fast-Food-App 

## Scrum Board
Will be in the Projects section of Github

## Teams Link
https://teams.microsoft.com/l/meetup-join/19%3ameeting_M2UzZjExYzMtMjEzYi00YjljLTg5ZTUtOWE0ZmNlNWY0NTQ0%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%2283c36c0c-aea2-40a6-81e7-a7f620a1353c%22%7d
