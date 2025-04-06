//Ecosystem

package Business;

import Business.Customer.CustomerDirectory;
import Business.Legal.LegalDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Orders.OrderDirectory;
import Business.Orders.HotelDirectory;
import Business.Grocery.GroceryDirectory;
import Business.GroceryManager.GroceryManagerDirectory;
import Business.HotelManager.HotelManagerDirectory;

import Business.EventManager.EventManagerDirectory;
import Business.Hotel.Hotel_Directory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author poojadoddannavar
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private GroceryDirectory groceryDirectory;
   
    private CustomerDirectory customerDirectory;
    private LegalDirectory legalDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private GroceryManagerDirectory groceryManagerDirectory;
    private EventManagerDirectory eventManagerDirectory;
    private OrderDirectory orderDirectory;
    private Hotel_Directory hotel_Directory;
    private HotelDirectory hotelDirectory;
    private HotelManagerDirectory hotelManagerDirectory;

    public EcoSystem(HotelDirectory hotelDirectory, HotelManagerDirectory hotelManagerDirectory, LegalDirectory legalDirectory, EventManagerDirectory eventManagerDirectory, GroceryDirectory groceryDirectory, OrderDirectory orderDirectory, Hotel_Directory hotel_Directory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, GroceryManagerDirectory groceryManagerDirectory) {
        this.groceryDirectory = groceryDirectory;
        
        this.customerDirectory = customerDirectory;
        this.legalDirectory = legalDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.groceryManagerDirectory = groceryManagerDirectory;
        this.eventManagerDirectory = eventManagerDirectory;
        this.orderDirectory = orderDirectory;
        this.hotelDirectory = hotelDirectory;
        this.hotel_Directory = hotel_Directory;
        this.hotelManagerDirectory = hotelManagerDirectory;
        
        
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super("test");
    }

    public boolean checkIfUserIsUnique(String userName) {
        return false;
    }
}
