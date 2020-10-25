# SnakeGame

# Introduction

This documentation serves to give you a comprehensive overview of my Snake game. This game is written in Java. Access to a keyboard with directional keys (`UP, DOWN, LEFT, RIGHT`) is needed. 


# Materials

You will need a keyboard with working directional keys to properly play this game. A working internet connection is also needed in order to download the .jar file found in the SnakeGame repository. 


# Installation

1. Navigate to the SnakeGame GitHub page using this [link](https://github.com/Coltinho10/SnakeGame) 

    Click the download code button, then select *Download ZIP*.
![Download Location](https://github.com/Coltinho10/DocumentationImages/blob/main/github.png)

2. Download the folder and either right-click and choose *Extract All* on Windows or double click on the ZIP folder to unzip on MacOS.
    ![Unzipped Folder](https://github.com/Coltinho10/DocumentationImages/blob/main/zipfile.png)

3. Double click on the `snakeGame.jar` file to run.


# How to Play

1. Locate the `snakeGame.jar` file and double click on it. This will run the game in a separate window.
![Game window](https://github.com/Coltinho10/DocumentationImages/blob/main/snakeWindow.png)

2. During play, you will see a white snake and a green apple. Use the directional keys on your keyboard to change the direction of your snake. Run into the apple to increase size. The ultimate objective is to grow your snake as large as possible. 


# Code

This program was written using just four Java classes. Below will be a brief overview of each. 

1. Frame.java includes the main method and constructor. This is how we get the window to appear. 
![Frame.java](https://github.com/Coltinho10/SnakeGame/blob/master/frame.png)

2. Screen.java includes several methods to draw the screen, create the snake and apples, and holds the logic for running and stopping the game. 

3. Body.java contains simple accessors and mutators for the snake body.

4. Food.java is a foil of Body.java for the apples. 


# FAQ

1. What do I need to run this game?
> You will need to have Java and the JVM installed on your machine to run this game.  

2. Where can I see the code for this project?
> You can find the source code [here](https://github.com/Coltinho10/SnakeGame)

3. How can I contribute to this?
> Feel free to download the source code and make any changes you would like! Download the source code using the steps shown above in the Installation section, build the project in an IDE of your choice that supports Java and add, change, or remove anything of your choice! All I ask is that you send me your changes at this email: coltonbailey32@gmail.com so I can play your new game (and shamelessly add cool new things to my project). 

4. How can I contact you?
> Email me here: coltonbailey32@gmail.com


# Licensing

Copyright 2020 Colton J. Bailey

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
