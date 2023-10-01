// 1. Make a method to check if a number is prime or not.

// import java.util.Scanner;

// public class questions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int a = sc.nextInt();
//         boolean isPrime = true;

//         if (a <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= Math.sqrt(a); i++) {
//                 if (a % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println(a + " is a prime number");
//         } else {
//             System.out.println(a + " is not a prime number");
//         }

//         sc.close();
//     }
// }



// 2. Make a method to check if a given number n is even or not.

// import java.util.Scanner;

// public class questions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int a = sc.nextInt();
//         boolean isPrime = true;

//         if (a %2== 0) {
//             isPrime = true;
//         } else {
//             if (a % 2!= 0) {
//                 isPrime = false;
                
//             }
//         }

//         if (isPrime) {
//             System.out.println(a + " is a even number");
//         } else {
//             System.out.println(a + " is not a even number");
//         }

//         sc.close();
//     }
// }


// 3. Make a method to print the table of a given number n.
// public class questions {
//     public static void printTable(int n) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }

//     public static void main(String[] args) {
//         int number = 5; // Change this to the desired number
//         printTable(number);
//     }
// }



// public class questions {
//     public static int multiply(int a, int b, int c) {
//         return a * b * c;
//     }

//     public static void main(String[] args) {
//         int num1 = 2;
//         int num2 = 3;
//         int num3 = 4;
//         int result = multiply(num1, num2, num3);
//         System.out.println("Result: " + result);
//     }
// }



// public class questions {
//     public static void calculateSimpleInterest(double principal, double rate, double time) {
//         double interest = (principal * rate * time) / 100;
//         System.out.println("Simple Interest: " + interest);
//     }

//     public static void main(String[] args) {
//         double principal = 1000;
//         double rate = 5;
//         double time = 2;
//         calculateSimpleInterest(principal, rate, time);
//     }
// }


// public class questions {
//     public static double calculateArea(double length, double width) {
//         return length * width;
//     }

//     public static void main(String[] args) {
//         double length = 5;
//         double width = 3;
//         double area = calculateArea(length, width);
//         System.out.println("Area of the rectangle: " + area);
//     }
// }



// public class questions {
//     public static long calculateFactorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         } else {
//             return n * calculateFactorial(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         int number = 5; // Change this to the desired number
//         long factorial = calculateFactorial(number);
//         System.out.println("Factorial of " + number + " is " + factorial);
//     }
// }
