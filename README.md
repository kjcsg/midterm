Mid Term Exam Programming Portion 
Due Monday by 11:59pm Points 25 Submitting a file upload File Types java Available Feb 28 at 6:35pm - Mar 6 at 11:59pm
Objective:
Check which recipes can be made with a given amount of ingredients.

Input Data Files (available in the Midterm folder in Canvas Files):

Groceries.txt (A list of the ingredients you have available to cook with)
RecipeX.txt (Multiple recipe files numbered 1,2,3, etc.) (The first line in the file is the name of the
recipe followed by the ingredients that are needed and what quantity is needed)
Classes to Create:

You must create at least these three classes:

Midterm.java (Your main class where you read in the data files, populate the pantry, check the recipes, and
output to the screen)
Pantry.java (Your pantry class to hold all the available ingredient objects)
Must have an "add" method for adding an ingredient object
Must have a "getQuantity" method that takes a name of an ingredient as an input and returns the quantity of that ingredient available in the pantry
Must use the built-in Java LinkedList class to hold the ingredient objects
Ingredient.java (A class to represent a single ingredient)
Should have at least "name" and "quantity" fields
Flow of the main method:

Create an instance of your Pantry class
Read in the Groceries.txt file, create Ingredient objects for each item and add them to the Pantry object
Read each Recipe.txt file (using a loop) and determine whether or not that recipe can be
made with the available ingredients in the pantry. (Each recipe is independent, don't worry about one recipe using up the ingredients needed for another)
Write to the screen which recipes can be made and which recipes cannot.