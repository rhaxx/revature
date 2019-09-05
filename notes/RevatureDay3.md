# 9/5/2019

Strings are immutable. They can't change
String str = "hello"
str = "hello world"
this does not add "world" to "hello"
this simply points str to a new location
in the string pool that now contains "hello world"

## loops

break is a keyword used to break out of the current loop
continue would skip the rest of the code under it go to the next iteration
for ( ; ; ) //is the default way to write a for loop
for ( index : array ) // for each loop
while ( conditionIsTrue ) // while loop
do {} while(conditionIsTrue) // do-while runs at least once

## switch statements

switch statements are almost like if statements
it checks every case and does not use a range like a condition
in an if statement

switch(var) {
    case 0:
        //code
        break;
    case 1:
        //code
        break;
    case 2:
        //code
        break;
    case 3:
        //code
        break;
    default:
        //code
        //does not need a break
}

## Scanner

reading in from user input

Scanner scanner = new Scanner(System.in);
reads in from the command line

## Access modifiers/levels

public: accessible anywhere, from any other class

protected: accessible only from classes in the same package
or any subclasses even if it is out of the package

no modifier: aka default aka package only, only acessible from
clases within the package

private: only accessible within the class it is declared in
(only have private classes if they are nested)

when you override a method you can make it more public
not more private, private methods can't be overriden because
an extended class can't see the private methods of it's super
class.

## Final keyword

variable: can not reassign once initialized "constants"
method: can not be overriden but it can be overloaded
class: can not be extended

finally: execption handling
finalize: method that the garbage collector calls before it collects objects

## Strings

String words = new String("HELLO!");
String words = "HELLO!";

are the ways to create strings
strings are immutable and can't be changed
