//hashset//

// You are using Java
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<String>set=new HashSet<>();
        int n =Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++){
            String a=sc.nextLine();
            set.add(a);
        }
        System.out.println("Names in the Set:");
        set.forEach((k)->System.out.println(k));
        String search=sc.nextLine();
        if(set.contains(search)){
            System.out.println("Name "+search+" found in the Set");
        }
        else{
            
            System.out.println("Name "+search+" not found in the Set");
        }
        String remove=sc.nextLine();
        if(set.contains(remove)){
            set.remove(remove);
            
            System.out.println("Name "+search+" deleted from the Set");
        }
        else{
            
            System.out.println("Name "+search+" not  found in the Set");
        }
        System.out.println("Names in the Set after deletion:");
        set.forEach((k)->System.out.println(k));
        
    }
}

//HashMap//

// You are using Java
import java.util.*;
class main{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String>map=new HashMap<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<n; i++){
            int a=Integer.parseInt(sc.nextLine());
            String b=sc.nextLine();
            map.put(a,b);
            
        }
        int s=Integer.parseInt(sc.nextLine());
        if(map.containsKey(s)){
            System.out.println(map.get(s)+"'s exists in with number :"+s);
        }
        else{
            System.out.println("No contact found with phone number: "+s);
            
        }
        
        System.out.println("Total number of students ;"+map.size());
        System.out.println("Students:");
        
        map.forEach((k,v)->System.out.println("roll Number :"+ k+","+" Name: "+v));
    }
}

//Exception//
// You are using Java
import java.util.*;
class InvalidAge extends Exception{
    InvalidAge(String msg){
        super(msg);
    }
}
class main {
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int age=Integer.parseInt(sc.nextLine());
        try{
            if(age<18){
                throw new InvalidAge ("Not Eligible Age must be 18 and above");
                
            }
            else{
                System.out.println("Eligible");
            }
        }catch(InvalidAge e){
           System.out.println(e);
        }
    }
}
//Interface//
import java.util.Scanner;

public interface Shape {
    double calculateArea();
}

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate area of a triangle
        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);
        System.out.println("Area of the triangle is: " + triangle.calculateArea());

        // Calculate area of a circle
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle is: " + circle.calculateArea());
    }
}


//HashMap with average//
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create HashMap to store student grades
        Map<String, Double> grades = new HashMap<>();

        // Function to add student grades
       // System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numStudents; i++) {
           // System.out.print("Enter student name: ");
            String name = scanner.nextLine();
           // System.out.print("Enter student grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            grades.put(name, grade);
        }

        // Function to search for a student's grade
        //System.out.print("Enter the name of the student to search: ");
        String searchName = scanner.nextLine();
        if (grades.containsKey(searchName)) {
            System.out.println("Grade found! Grade: " + grades.get(searchName));
        } else {
            System.out.println("Student not found in the system.");
        }

        // Function to display all student grades
        System.out.println("All Student Grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Function to display the average grade
        double sum = 0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        double averageGrade = sum / grades.size();
        System.out.println("Average Grade: " + averageGrade);

        // Function to remove a student from the system
       // System.out.print("Enter the name of the student to remove: ");
        String removeName = scanner.nextLine();
        if (grades.containsKey(removeName)) {
            grades.remove(removeName);
            System.out.println(removeName + " has been removed from the system.");
        } else {
            System.out.println(removeName + " does not exist in the system.");
        }

        // Print the map after deletion
        System.out.println("Map after deletion:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        scanner.close();
    }
}
// Interface //
import java.util.*;
interface Shape{
    double getArea();
    double getPerimeter();
}

class Rectangle implements Shape{
    double length;
    double breadth;
    
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    
    public double getArea(){
        return length*breadth;
    }
    public double getPerimeter(){
        
        return 2*(length*breadth);
    }
}

class main{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length");
        double length=sc.nextDouble();
        System.out.print("enter breadth");
        double breadth=sc.nextDouble();
        Rectangle r=new Rectangle(length,breadth);
        double resulta=r.getArea();
        double resultp=r.getPerimeter();
        System.out.println(resulta+" Area");
        System.out.println(resultp+" perimeter");
    }
}
//Interface circle trinagle//
// You are using Java
import java.util.*;
interface shape{
    public double getArea();
}
class Triangle implements shape{
    
    double base;
    double height;
    
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    
}
class Circle implements shape{
    double radius; 
    
    
    Circle(double radius){
        this.radius=radius;
        
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
}
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double radius=sc.nextDouble();
        Triangle t=new Triangle(base,height);
        Circle c=new Circle(radius);
        System.out.println(t.getArea());
        System.out.printf("sgshgs %.2f",c.getArea());
    }
}
//exception inputmismatch arithmetic//
// You are using Java
import java.util.InputMismatchException;
import java.util.Scanner;

    class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}
//exception//
[Saturday 09:42] Swathi Murali
// You are using Java

import java.util.*;

class InvalidateAgeException extends Exception{

    InvalidateAgeException(String msg){

        super(msg);

    }

}
 
class InvalidateAadharException extends Exception{

    InvalidateAadharException(String msg){

        super(msg);

    }

}
 
 
class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());

        boolean aadhar = Boolean.parseBoolean(sc.nextLine());

        try{

           if(age<18 && aadhar==true){

             throw new InvalidateAgeException("age is less than 18"); 

       } if(age>=18 && aadhar==false){

        throw new InvalidateAadharException("u r not having an aadhar card");

        }if(age<18 && aadhar==false){

        System.out.println("not eligible");

        }else{

        System.out.println("eligible");

        }

        }catch(InvalidateAgeException e){

            System.out.println(e);

        }catch(InvalidateAadharException e){

            System.out.println(e);

        }

    }

}
ArrayList

// You are using Java
import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String a=sc.nextLine();
            list.add(a);
        }
        String search=sc.nextLine();
        if(list.contains(search)){
            System.out.println(search+" is present in the list at "+list.indexOf(search));
            
        }else{
            System.out.println(search+" is not present in the list.");
            
        }
        System.out.println("Flowers present in the list");
        list.forEach((k)->System.out.println(k));
        String remove=sc.nextLine();
        int a=list.indexOf(remove);
        if(list.contains(remove)){
            list.remove(remove);
            System.out.println(remove+" has been removed from the list which was present at "+a);
        }else{
            System.out.println(remove+" does not exist in the list");
            
        }
        System.out.println("Flowers list after Updation: ");
        list.forEach((k)->System.out.println(k));
        
        
    }
}

JDBC
// You are using Java
import java.util.*;
import java.sql.*;
class main{
    static void Add(Connection con,Scanner sc){
        int  id=Integer.parseInt(sc.nextLine());
        String first_name=sc.nextLine();
        String last_name=sc.nextLine();
        String address=sc.nextLine();
        double marks=Double.parseDouble(sc.nextLine());
        boolean present=Boolean.parseBoolean(sc.nextLine());
        try(PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?,?,?,?)")){
            ps.setInt(1,id);
            ps.setString(2,first_name);
            ps.setString(3,last_name);
            ps.setString(4,address);
            ps.setDouble(5,marks);
            ps.setBoolean(6,present);
            int x=ps.executeUpdate();
            if(x>0){
                System.out.println("Added Sucessfully");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    static void update(Connection con, Scanner sc){
        String first_name=sc.nextLine();
        String last_name=sc.nextLine();
        String address=sc.nextLine();
        double marks=Double.parseDouble(sc.nextLine());
        boolean present=Boolean.parseBoolean(sc.nextLine());
        int  id=Integer.parseInt(sc.nextLine());
        try(PreparedStatement ps=con.prepareStatement("update students set first_name=?,last_name=?,address=?,marks=?,present=? where id=?")){
            ps.setString(1,first_name);
            ps.setString(2,last_name);
            ps.setString(3,address);
            ps.setDouble(4,marks);
            ps.setBoolean(5,present);
            ps.setInt(6,id);
            int x=ps.executeUpdate();
            if(x>0){
                System.out.println("Updated Sucessfully");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    static void delete(Connection con,Scanner sc){
        int id=Integer.parseInt(sc.nextLine());
        try(PreparedStatement ps=con.prepareStatement("delete from students where id=?")){
            ps.setInt(1,id);
            int x=ps.executeUpdate();
            
            if(x>0){
                System.out.println("Deleted Sucessfully");
            }
            
            
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
    static void display(Connection con){
        try(PreparedStatement ps=con.prepareStatement("select * from students")){
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("Student id:"+rs.getInt(1)+" ,first_name: "+rs.getString(2)+" ,last_name: "+rs.getString(3)+" ,address: "+rs.getString(4)+" ,marks:"+rs.getDouble(5)+" ,present:"+rs.getBoolean(6));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123")){
            Scanner sc=new Scanner(System.in);
            int choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    Add(con,sc);
                    display(con);
                    break;
                case 2:
                    display(con);
                    break;
                case 3:
                    update(con,sc);
                    display(con);
                case 4:
                    delete(con,sc);
                    display(con);
                    break;
                    
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}

Exception Handling
// You are using Java

import java.util.*;

class InvalidAge extends Exception{

    InvalidAge(String msg){

        super(msg);

    }

}

class main {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int age=Integer.parseInt(sc.nextLine());

        try{

            if(age<18){

                throw new InvalidAge ("Not Eligible Age must be 18 and above");

            }

            else{

                System.out.println("Eligible");

            }

        }catch(InvalidAge e){

           System.out.println(e);

        }

    }

}

HashMap

import java.util.*;
class main{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String>map=new HashMap<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<n; i++){
            int a=Integer.parseInt(sc.nextLine());
            String b=sc.nextLine();
            map.put(a,b);
            
        }
        int s=Integer.parseInt(sc.nextLine());
        if(map.containsKey(s)){
            System.out.println(map.get(s)+"'s exists in with number :"+s);
        }
        else{
            System.out.println("No contact found with phone number: "+s);
            
        }
        
        System.out.println("Total number of students ;"+map.size());
        System.out.println("Students:");
        
        map.forEach((k,v)->System.out.println("roll Number :"+ k+","+" Name: "+v));
    }
}

HashSet



import java.util.*;

class main{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        HashSet<String>set=new HashSet<>();

        int n =Integer.parseInt(sc.nextLine());

        for (int i=0;i<n;i++){

            String a=sc.nextLine();

            set.add(a);

        }

        System.out.println("Names in the Set:");

        set.forEach((k)->System.out.println(k));

        String search=sc.nextLine();

        if(set.contains(search)){

            System.out.println("Name "+search+" found in the Set");

        }

        else{

            System.out.println("Name "+search+" not found in the Set");

        }

        String remove=sc.nextLine();

        if(set.contains(remove)){

            set.remove(remove);

            System.out.println("Name "+search+" deleted from the Set");

        }

        else{

            System.out.println("Name "+search+" not  found in the Set");

        }

        System.out.println("Names in the Set after deletion:");

        set.forEach((k)->System.out.println(k));

    }

}
