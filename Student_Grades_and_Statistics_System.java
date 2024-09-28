package Student_Grades_and_Statistics_System;
import java.util.Scanner; 
import java.util.Arrays;
public class Student_Grades_and_Statistics_System {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int choice=0;
        int grade=0;
        int array[]=new int[5];

        do{
            System.out.println("Welcome to the Student Grades and Statistics System!");
            System.out.println("1.Input Grades");
            System.out.println("2. View Average Grade");
            System.out.println("3. View Highest Grade");
            System.out.println("4. View lowest Grade");
            System.out.println("5. View All Grades and letter Grades");
            System.out.println("6.Exit");
            System.out.println("enter your choice:");
            choice=sc.nextInt();
            switch(choice){
            case 1:{
                System.out.println("Enter grades for 5 students:");
                for(int i=0;i<5;i++){
                    System.out.println("enter grades for student"+(i+1)+":");
                    grade=sc.nextInt();
                    array[i]=grade;
                }
                System.out.println("Grades have been successfully entered!"); 
                break;
            }
            case 2:{
                int total=array[0]+array[1]+array[2]+array[3]+array[4];
                float avg=total/5;
                System.out.println("Average Grade:"+avg);
                break;
            }
            case 4:{
                int min=array[0];
                for (int i=1;i<array.length;i++){
                    if (array[i]<min){
                        min=array[i];
                    }

                }System.out.println("Lowest Grade:"+min);
                break;
            }
            case 3:{
                int max=array[0];
                for (int i=1;i<array.length;i++){
                    if (array[i]>max){
                        max=array[i];
                    }
                }System.out.println("Highest Grade:"+max);
                break;
            }
            case 5:{
                System.out.println(" Student Grades and Letter Grades ");
                for(int i=0;i<array.length;i++){
                    System.out.println("student"+" "+i+":"+array[i]);
                
                    if (array[i]>=90){
                        System.out.println("Letter Grade:"+""+"A");
                    }else if(array[i]>=80){
                        System.out.println("Letter Grade:"+""+"B");
                    }
                    else if(array[i]>=70){
                        System.out.println("Letter Grade:"+""+"C");
                    }else if(array[i]>=60){
                        System.out.println("Letter Grade:"+""+"D");
                    }
                    else{
                        System.out.println("Letter Grade:"+""+"F");
                    }
                }
                break;
            }
            case 6:{
               System.out.println("Exiting the system. Goodbye!\n");
               break;
            }
        }
    }while(choice!=6);
    }
}
