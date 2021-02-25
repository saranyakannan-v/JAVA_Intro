// In Java, every application begins with a class name, and that class must match the filename. 
// The name of the java file must match the class name. When saving the file, save it using the class name and add ".java" to the end of the filename.
// The main() method is required and you will see it in every Java program.

/* public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}*/

/*================DATA TYPE================= */ 

/*public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}*/

/*================Operators================= */ 

// Operators are used to perform operations on variables and values.

/*Java divides the operators into the following groups:

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators */

/* public class Main {
  public static void main(String[] args) {
    int sum1 = 100 + 50;
    int sum2 = sum1 + 250;
    int sum3 = sum2 + sum2;
    System.out.println(sum1); //150
    System.out.println(sum2); //400
    System.out.println(sum3); //800
  }
} */

/*================String methods================= */ 

// String are used for storing text.
/*- String Length length()
  - There are many string methods available, for example toUpperCase() and toLowerCase()
  - Finding a Character in a String indexOf() it returns the index position
  - String Concatenation + operator, concat() method to concatenate two strings*/

/* public class Main {
  public static void main(String[] args) {
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
    System.out.println(txt.length());
    System.out.println(txt.indexOf("World"));
    System.out.println(txt.concat("!"));
  }
}*/

/*================Math================= */ 

// The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

/* public class Main{
  public static void main(String[] args){
    System.out.println(Math.max(5, 10));  
    System.out.println(Math.min(5, 10));  
    System.out.println(Math.sqrt(81));
    System.out.println(Math.abs(-4.7));
    int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println(randomNum);
  }
} */

/*================Java Conditions and If Statements================= */ 

/*Syntax
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
*/

/* public class Main {
  public static void main(String[] args) {
    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 20) {
      System.out.println("Good day.");
    }  else {
      System.out.println("Good evening.");
    }
  }
}*/

// Short Hand If...Else (Ternary Operator)
// syntax : variable = (condition) ? expressionTrue :  expressionFalse;

/*public class Main {
  public static void main(String[] args) {   
    int time = 9;
    String result;
    result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
  }
} */

/*================Switch Statements================= */ 
// Use the switch statement to select one of many code blocks to be executed.

/*public class Main {
  public static void main(String[] args) {
    int day = 4;
    switch (day) {
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
    }    
  }
}*/


/*================While Loop================= */ 
// The while loop loops through a block of code as long as a specified condition is true

/*public class Main{
  public static void main(String[] args){
    int i=0;
    while(i<5){
      System.out.println(i);
      i++;
    }
  }
}*/
/*******Do while*********/
/* int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5); */


/*================For Loop================= */
// When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop

/* class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }  
  }
}*/

/*================Break and Continue================= */
// The break statement can also be used to jump out of a loop.
// The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
/*public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }  
  }
}*/

/*public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }  
  }
}*/

/*================Array================= */
// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
// To declare an array, define the variable type with square brackets

public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
  }
}


