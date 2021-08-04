/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Admin
 */
public class BankCustomer {
    private String name;  
    private int custid;  
    private String password;
    private String emailid;
    private String phno;

     public int getCustid(){

         return custid;
    }
    public void setCustid(int custid){
        this.custid=custid;
    }
    public String getName(){

         return name;
    }
     public void setName(String name){

         this.name=name;
    }
   
    public String getPassword(){

         return password;
    }
     public void setPassword(String password){

         this.password=password;
    }
      public String getEmailid(){

         return emailid;
    }
     public void setEmailid(String emailid){
        this.emailid=emailid;
    }
    public String getPhno(){

         return phno;
    }
     public void setPhno(String phno){

         this.phno=phno;
    }
    @Override
    public String toString() {
        return "ID:"+custid +" " +"Name:"+name +" "+"password:"+password+ " "+"emailid:"+emailid+" "+"phone_number:"+phno;
    }
}
