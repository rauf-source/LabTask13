import java.util.Scanner;
public class EmployeeTest {

        public static void main(String []args){
            int i;
            Scanner input= new Scanner(System.in);
            System.out.println("Enter name");
             String name=input.nextLine();
            System.out.println("Enter id");
             int id=input.nextInt();
            System.out.println("Enter Salary");
             int basicSalary=input.nextInt();
            System.out.println("Enter Gender(press 1 for Male/ press 2 for Female)");
            i=input.nextInt();
        if(i==1) {
            Employee obj = new Employee(name, id, basicSalary, Employee.Gender.Male);
           obj.calculateBonus();}
        else {
            Employee obj = new Employee(name, id, basicSalary, Employee.Gender.Female);
            obj.calculateBonus();
        }
        }
    }


