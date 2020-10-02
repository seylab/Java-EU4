# Week 3 Note 

## Creating Interactive Program

We have been creating a variable and assiging value directly in our source code. 

For example : 
```java
String name = "Adam" ;
System.out.println("You have entered "+ name); 
// output You have entered Adam
```
>What if We want to make the program interactive to let user enter the name when program is running and capture that user input to assign the name value ? 

**That's exactly where `Scanner` class comes in.**  

## Scanner Class

`Scanner` is a class coming from **JDK** and It's under a package called `java.util` and we can use the existing functionality already provided to capture users input just like we were able to directly use `System.out.println` to print something on the console. 

## Importing Scanner
In order to use it , we need to tell compiler exactly where is the class using `import` statement.
```java
import java.util.Scanner ;
```
More precisely, It should be right under package declaration and before class declaration as below.
```java
package your_package_name;

import java.util.Scanner ;

public class Practice{
    // codes here
}

```

## Creating Scanner Object

We will talk a lot more about what's class and object in later classes. right now we will just take it and use it since the line is always the same. 

Once imported, We need to create `Scanner object` and assign it to variable.
* When you create a variable with data type `int` , you can store a number
* When you create a variable with data type `Scanner`, then you can store `Scanner object`.

This is how we create `Scanner object` and assign it to a variable with type `Scanner` . (You may use any variable name , in this case we called it scan)
```java
Scanner scan = new Scanner(System.in) ; 
```

## Using existing methods from Scanner Class

Now you may use the variable `scan` to call various methods (behaviour of objects) already exists to capture users input. 

For example, in order to capture single word and save into a variable : 
```java
String name = scan.next(); // the program will pause here until user enter a word and hit enter. the value will be saved into variable name. we can use it anywhere just like we would do with any variables.
System.out.println("You have entered " + name);
```
We can also capture the user inputs like numbers and boolean and save into corresponding data types. 

## Common Scanner methods
Here is the list of common methods we can call : 
```java
// assuming we already created scanner object and named it scan.
byte   num1 = scan.nextByte();
short  num2 = scan.nextShort();
int    num3 = scan.nextInt();
long   num4 = scan.nextLong();
float  num1 = scan.nextFloat();
double num1 = scan.nextDouble();
boolean num1 = scan.nextBoolean();
```
When user enter the input , it can be separated by `space` or `enter` keystroke to distinguish one input from another. 

Here is a sample program to ask user 3 numbers and print sum

```java
package capturing_user_input;
import java.util.Scanner ; 

public class SumCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;  
		
		int num1, num2, num3 , sum ; 
		
		System.out.println("Enter 3 numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		sum = num1+num2+num3 ; 
		
		System.out.println("Sum of 3 numbers is : " + sum );	
	}
}

```
Here is the sample input and output for running the program 2 times.

![Sum Calculator](https://user-images.githubusercontent.com/59104509/94949361-cc19de00-04ae-11eb-9f29-74fd9027f58a.gif)


> Fact : There is no `nextChar()` method to capture single character. 

If we need to capture more than one word , like sentences we can use `nextLine()` method
```java
String sentence = scan.nextLine();
```
>The way we indicate we are done with the line is by hitting **Enter**, so whenever a enter is pressed in keyboard it will see it as you have finished typing. 


It's always better to print a message before the methods to ask question so it's clear what's expected when entering value in console. 

Here is the sample program to combine few methods :

```java
package capturing_user_input;

import java.util.Scanner ; 

public class ScannerPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in) ;  
		
		System.out.println("Please enter your full name : ");
		String fullName =  scan.nextLine() ; 
		System.out.println("You have entered full name :  " + fullName);
		
		
		System.out.println("Please enter your age : ");	
		int age = scan.nextInt(); 
		System.out.println("You have entered  age : " + age); 
		
		System.out.println("You study full time , true or false ?");	
		boolean isFullTime = scan.nextBoolean(); 
		System.out.println("You have entered : " + isFullTime );
		
		System.out.println("Thanks for the information");
		
		
	}

}

```
Here is the sample input and output : 

![Console output Scanner](https://user-images.githubusercontent.com/72038048/94945905-624b0580-04a9-11eb-9ead-69ac2ba5bb0e.gif)


## Common Erros: 

### Data type mismatch : 
If user input does not match the data type user input, it will throw and error while program run. 

For example : 
```java
System.out.println("Enter a number :");
int num = scan.nextInt() ; 

```
If user enter `abc` instead of a valid number the output is as below:

![Wrong Data type](https://user-images.githubusercontent.com/59104509/94951848-fff70280-04b2-11eb-80c0-a4c3226b9927.gif)

Because `int num = "abc";` is not a valid statement. 

Same apply for other issues like entering fractional number for `nextInt()` method or entering anything not `true` or `false` for `nextBoolean()` method. 

You may however enter anything for `next()` or `nextLine()` methods because anything can be stored as `String`.

For example :
```java
String s1 = scan.next() ;
// all below values will be valid as user input.
123 
true
12.99
A
// It will be stored as String : "value here"
```

## Errors while mixing `nextLine()` and `nextX()` methods
>There is no `nextX` method , I will be using it just to refer all Scanner methods : `nextInt()`, `nextDouble()` , `nextBoolean()` and anything other than  `nextLine()`. 

If you remember for `nextLine()` method, the only way to know if user done typing is by `Enter` key(⏎).  And all `nextX()` methods only capture the actual input and will not capture `Enter` key(⏎). check below example. 

```java
Scanner scan = new Scanner(System.in); 

System.out.println("Enter your age : ");
int age = scan.nextInt();
System.out.println("You have entered " + age);

System.out.println("Enter full name : ");
String fullName = scan.nextLine();
System.out.println("You have entered full name : "+ fullName);
```
First program run : 
User input the age and hot `Enter` key(⏎) to try to type full name. 

![No Chance to Type (1)](https://user-images.githubusercontent.com/59104509/94958429-81ec2900-04bd-11eb-98df-4ba97e8fde42.gif)

Unexpectedly the program finished running before user even have a chance to enter something in console. 

The reason is when you enter number it's captured by `nextInt()` and when you hit enter `nextLine()` method assume you are done typing and capture that and save into `fullName` variable as illustrated in the picture.

![TheNextLineIssue](https://user-images.githubusercontent.com/59104509/94956184-bbbb3080-04b9-11eb-9b51-c5e8ccfaabd5.png)

However that was not what we intended. 

Second Program run :
User input the age and hit `space` key  to try to type full name. 
![Same line worked)](https://user-images.githubusercontent.com/59104509/94958604-d0012c80-04bd-11eb-938d-536184f6ffe1.gif)


The Program executed as expected because 
`nextInt()` captured `21` and `space` indicate that 
you are done and it will continue.

You typed `Adam Jones` after the `space` and hit `enter`. 

`nextLine()` method start capturing right after space until you hit enter , 

In this case : `Adam Jones`
And **it worked! as illustrated below.**

![NextLineWorked](https://user-images.githubusercontent.com/59104509/94957108-38024380-04bb-11eb-9aaf-bea5828c94f1.png)


Same program , 2 different result according to the way we run due to the nature of `nextLine()` method use `Enter` key as end of input. 

### How do we get consistent result if we have to mix it like this? 

Well first , `**if you do not have to use `nextLine()` just stick to `next()` method to avoid issues.**`

If you really have to use it though, just add extra `scan.next()` every time you use `nextLine()` right after `nextX()` method to capture that `Enter` key(⏎).

For example : 
```java
Scanner scan = new Scanner(System.in); 

System.out.println("Enter your age : ");
int age = scan.nextInt();  // capture age
System.out.println("You have entered " + age);

// adding extra scan.nextLine() just to capture Enter key
scan.nextLine() ;

System.out.println("Enter full name : ");
String fullName = scan.nextLine(); // capture full name
System.out.println("You have entered full name : "+ fullName);
```
Now with this code , we will not have to worry about the `Enter` Key accidentally captured by `scan.nextLine()` that supposed to capture full name. 

![Expected Result](https://user-images.githubusercontent.com/59104509/94958768-18204f00-04be-11eb-8bc1-4268a1b7afb5.gif)



Bottom line is : Whenever you have to mix `nextInt` or other similar method with `nextLine` , always follow below pattern : 
```java
int num = scan.nextInt() ; // capture number 
scan.nextLine();  //capture Enter key , do not need to save it.
String sentence = scan.nextLine() ; // capture one or more words
```
Here is the full program

![NextLineWorked](https://user-images.githubusercontent.com/59104509/94958223-2883fa00-04bd-11eb-85df-e2fd29b6d0cc.png)

