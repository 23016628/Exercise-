import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insert marks");
    int marks = scanner.nextInt();

    if (marks >= 80) {
      System.out.println("Level 7- Outstanding achievement");
    } else if (marks >= 70) {
      System.out.println("Level 6 - Meritorious achievement");
    } else if (marks >= 60) {
      System.out.println("Level 5 - Substantial achievement");
    } else if(marks >=50){
      System.out.println(" Level 4 - Modarate achievement");
    } else if(marks>=40){
        System.out.println("Level 3 - Adequate achievment");
  } else if (marks >=30){
      System.out.println("level 2 - Elementary achievement");
  } else {
      System.out.println("not achieved");
  }
  }}
