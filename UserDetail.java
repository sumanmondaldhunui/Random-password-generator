import java.util.Scanner;

public class UserDetail {



   final static PasswordGenerator [] Student;
    static Scanner sc;
    static int NoUser;
    static boolean check;

    static {
        System.out.println("how many user you want to add");
        sc=new Scanner(System.in);
         NoUser=sc.nextInt();

        while (NoUser <=0){
            System.out.println("please enter at least one user");

            NoUser=sc.nextInt();

        }

        Student=new PasswordGenerator[NoUser];
        sc.nextLine();

    }
     public static void main(String[] args) {







         for (int i=0;i<NoUser;i++){
             System.out.println("enter user name");
             String userN=sc.nextLine();
             System.out.println("enter how long you generate password");
             int k=sc.nextInt();
             sc.nextLine();
             PasswordGenerator student=new PasswordGenerator(k,userN);
             Student[i]=student;

         }


         do {
             System.out.println("do you want to perform any operation");
             System.out.println("press\n1-display all data\n2-change password\n3-check password\n4-exit");



             int k = sc.nextInt();
             sc.nextLine();
             switch (k) {
                 case 1:
                     Display(Student);
                     break;
                 case 2:
                     System.out.println("enter user name whom password want to change");
                     String user = sc.nextLine();
                     ChangePassword(user);
                     break;

                 case 3:
                     System.out.println("enter user name whom password want to check");
                     String user1 = sc.nextLine();
                     getpass(user1);
                     break;
                 default:
                     System.out.println("press a right key");

             }
             System.out.println("continue operation\n press 1 for continue 0 for exit");
             int c=sc.nextInt();
             if (c==1){
                 check=true;

             }
             else {
                 check=false;
             }
             sc.nextLine();

         }while (check);
     }

     static void ChangePassword(String user){
        boolean kk=false;
         for (int i=0;i<Student.length;i++){
             if (user.equals(Student[i].UserName)){
                 System.out.println("user found\n now type a new password");
                 String pass=sc.nextLine();
                 Student[i].setPassword(pass);
                 kk=true;
                 break;



             }else {
                 continue;
             }

         }
         if (kk==false){
             System.out.println("NO USE MATCH");
         }
     }

     static void getpass(String user){
        boolean kk=false;

         for (int i=0;i<Student.length;i++){
             if (user.equals(Student[i].UserName)){
                 String pass=Student[i].getPassword();
                 System.out.println(pass);
                 kk=true;
                 break;

             }
             else {
                 continue;
             }


         }
         if (kk==false){
             System.out.println("NO USE MATCH");
         }


     }

     static void Display(PasswordGenerator [] student){
        for(PasswordGenerator i:student){
            System.out.println("username "+i.UserName+" password "+i.Password);
        }

     }

}
