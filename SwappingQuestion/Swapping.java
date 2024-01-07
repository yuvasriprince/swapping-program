import java.util.Scanner;
public class Swapping {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int name1 = scanner.nextInt();
        System.out.println("enter the second name");
        int name2 = scanner.nextInt();
        System.out.println("before Swapping: "+name1);
        System.out.println("before Swapping: "+name2);
        name1=name1+name2;
        name2=name1-name2;
        name1=name1-name2;
        System.out.println("after the Swapping: "+name1);
        System.out.println("after the swapping: "+name2);
    }
 }

