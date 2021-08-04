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
public class CustomerMain {


    public static void main(String[] args) {

       BankCustomer customer=new BankCustomer();
        customer.setCustid(110);
        customer.setName("janet");
        customer.setEmailid("janet@gmail.com");
        customer.setPassword("123##s");
        customer.setPhno("7010036437");
        System.out.println(customer);
        System.out.println("Account created successfully");       
    }
}
