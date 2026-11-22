import java.util.Random;
import java.util.Scanner;

public class h1 {

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //תרגיל 1

        //  System.out.println("enter three number");
        //  double a = scanner.nextDouble();
        //  double b = scanner.nextDouble();
        //   double c = scanner.nextDouble();
        // double num = b * b - 4 * a * c;
        //  if (num > 0) {
        //      System.out.println("נמצאו שני פתרונות למשוואה");
        //      System.out.println("x1 =" + (-b + Math.sqrt(num)) / (2 * a));
        //     System.out.println("x1 =" + (-b - Math.sqrt(num)) / (2 * a));
        //    }
        //  else if (num == 0) {
        //    System.out.println("נמצא פתרון אחד בלבד");
        //  System.out.println("x1 =" + -b / (2 * a));
        // }
        // else{
        //      System.out.println("לא נמצא פתרון עבור המשוואה הריבועית");
        // }

        // תרגיל 2
        //  System.out.println("הכנס את האיבר הראשון בסדרה");
        //  int num1 = scanner.nextInt();
        //  System.out.println("הכנס את ההפרש בסדרה");
        //  int num2 = scanner.nextInt();
        //  System.out.println("הכנס את כמות האיברים בסדרה");
        //   int num3 = scanner.nextInt();
        //  if(num3 > 0 && num3 % 1 == 0){
        //     for (int i = 0; i <num3 ; i++) {
        // System.out.print(num1 + ",");
        //       num1+= num2;
        //   }
        //  }

        //תרגיל 3

        //  System.out.println("enter a number");
        //  int x =scanner.nextInt();
        //   int sum = 0;
        //  while(x > 0){
        //      sum+= x % 10;
        //      x/= 10;
        // }
        //  System.out.println("סכום הספרות" + sum);

        //תרגיל 4
        //  System.out.println("enter a number");
        //  int n = scanner.nextInt();
        //  int number = 2;
        //   int i = 0;
        //  while (i < n){
        //    boolean isPrime = true;
        //     for (int j = 2; j < number; j++) {
        //         if (number % j == 0) {
        //            isPrime = false;
        //          break;
        //        }
        //    }
        //    if(isPrime){
        //       System.out.print(number + ",");
        //       i++;
        //    }
        //   number++;
        //  }

        //תרגיל 5
      // System.out.println("enter a number");
    //   int num = scanner.nextInt();
      // int previous = 0;
      //  int current = 1;
     //   boolean isIn = false;
     //   while (current <= num) {
       //     int next = previous + current;
       //     if (num == 0 || next == num) {
        //        isIn = true;
        //        break;
         //   }
           // else {
           //     previous = current;
           //     current = next;
          //  }
      //  }
      //  if(isIn) {
       //     System.out.println("המספר שהוקש הוא איבר בסדרת פיבונאצ'י ");
      //  }
      //  else {
       //     System.out.println(" המספר שהוקש אינו איבר בסדרת פיבונאצ'י ");
       // }

        //תרגיל 6
        //   int num;
      //  do {
        //    do {
        //        System.out.println("enter a positive odd number greater than 3");
        //         num = scanner.nextInt();
         //   }while(num % 2 == 0);
      //  }while(num <= 3);

      //  for (int i = 1; i <= num; i+=2) {
        //    for (int j = 1; j <= i; j++) {
       //         System.out.print("*");
       //     }
        //    System.out.println();
      //  }
     //   for (int i = num-2; i > 0; i-=2) {
      //      for (int j = 0; j < i; j++) {
        //        System.out.print("*");
        //    }
        //    System.out.println();
      //  }

        //תרגיל 7
        int sum1=0;
        int sum2=0;
        for (int i = 1; i <= 1000; i++) {
            int num = i;
            while(num > 0){
                sum1 = num % 10;
                sum2+= sum1 * sum1 * sum1;
                num/= 10;
            }
            if(sum2 == i){
                System.out.println(i);
            }
            sum1 = 0;
            sum2 = 0;


        }


    }





