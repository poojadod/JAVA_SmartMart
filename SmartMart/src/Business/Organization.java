/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.Legal.LegalDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Orders.OrderDirectory;
import Business.Orders.HotelDirectory;
import Business.Grocery.GroceryDirectory;
import Business.GroceryManager.GroceryManagerDirectory;
//import Business.Event.EventDirectory;
import Business.EventManager.EventManagerDirectory;
import Business.Hotel.Hotel_Directory;
import Business.HotelManager.HotelManagerDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;

import Business.createNetwork;
import java.util.ArrayList;

/**
 *
 * @author poojadoddannavar
 */
public abstract class Organization {

    private String name;
 
    private EmployeeDirectory employeeDirectory;
    private GroceryDirectory groceryDirectory;
    
    private CustomerDirectory customerDirectory;
    private LegalDirectory legalDirectory;
    private UserAccountDirectory userAccountDirectory;
    private createNetwork createNetwork;
    private int organizationID;
    private static int counter = 0;
    private DeliveryManDirectory deliveryManDirectory;
    private GroceryManagerDirectory groceryManagerDirectory;
    private EventManagerDirectory eventManagerDirectory;
    private HotelDirectory hotelDirectory;
    private Hotel_Directory hotel_Directory;
    private HotelManagerDirectory hotelManagerDirectory;
    private OrderDirectory orderDirectory;

    public enum Type {
      
        HotelAdmin("HotelAdmin"),
      
        GroceryAdmin("GroceryAdmin"),
        
       
       
        Customer("Customer"),
        
        Legal("LegalAdmin"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
      
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        createNetwork = new createNetwork();
        groceryDirectory = new GroceryDirectory();
       
        hotelDirectory = new HotelDirectory();
        hotel_Directory = new Hotel_Directory();
        hotelManagerDirectory = new HotelManagerDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        customerDirectory = new CustomerDirectory();
        legalDirectory = new LegalDirectory();
        groceryManagerDirectory = new GroceryManagerDirectory();
        eventManagerDirectory = new EventManagerDirectory();
        orderDirectory = new OrderDirectory();
        organizationID = counter;
        ++counter;
    }

    public Organization() {
        System.out.println("organization..");
    }

   

    public EventManagerDirectory getEventManagerDirectory() {
        return eventManagerDirectory;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public HotelDirectory getHotelDirectory() {
        return hotelDirectory;
    }

    public HotelManagerDirectory getHotelManagerDirectory() {
        return hotelManagerDirectory;
    }

    public GroceryDirectory getGroceryDirectory() {
        return groceryDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public LegalDirectory getLegalDirectory() {
        return legalDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public createNetwork getcreateNetwork() {
        return createNetwork;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public GroceryManagerDirectory getGroceryManagerDirectory() {
        return groceryManagerDirectory;
    }

    public Hotel_Directory getHotel_Directory() {
        return hotel_Directory;
    }

    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public String toString() {
        return name;
    }

}
