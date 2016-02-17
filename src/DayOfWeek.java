import java.util.Scanner;

public class DayOfWeek {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter year: (e.g., 2012): ");
    int year = input.nextInt();
    System.out.print("Enter month: 1-12: ");
    int month = input.nextInt();
    System.out.print("Enter the day of the month: 1-31: ");
    int day_month = input.nextInt();
    
    if (month == 1){    
      month = 13;
      year = year - 1;
    } // if  
    if (month == 2){    
      month = 14;  
      year = year - 1;
    } // if  
    
    int day_week = (day_month + (26*(month + 1)/10) + (year%100)
    + ((year%100)/4) + ((year/100)/4) + (5*(year/100))) % 7;
    
    System.out.print("Day of the week is ");
    
    switch(day_week){
        case 0: System.out.print("Saturday\n"); break;
        case 1: System.out.print("Sunday\n"); break;
        case 2: System.out.print("Monday\n"); break;
        case 3: System.out.print("Tuesday\n"); break;
        case 4: System.out.print("Wednesday\n"); break;
        case 5: System.out.print("Thursday\n"); break;
        case 6: System.out.print("Friday\n"); break;
    } // switch
  } // main   
} //DayOfWeek
