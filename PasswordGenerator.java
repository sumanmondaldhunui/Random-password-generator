import java.util.Random;



 public class PasswordGenerator{
    static int lenthOfPass;

    static String CharAr="";
   String Password;
   String UserName;

     public PasswordGenerator(int length,String userName){
         lenthOfPass=length;
         this.UserName=userName;


         Password=generatePass();




     }


     public String getPassword() {
         return Password;
     }

     public void setPassword(String password) {
         Password = password;
     }

     public String getUserName() {
         return UserName;
     }

     public void setUserName(String userName) {
         UserName = userName;
     }

     static {
        CharAr=PassStr();
    }







     static String  PassStr(){
        String charArray="";
        for (int i=49;i<123;i++){
            charArray +=(char) i;

        }
     return  charArray;}



     static String  generatePass(){
         Random random=new Random();

         String Pass="";
         for(int i=0;i<lenthOfPass;i++){
             Pass +=CharAr.charAt(random.nextInt(CharAr.length()));
         }




    return Pass; }




 }
