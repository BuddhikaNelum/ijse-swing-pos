/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.CustomerBO;
import lk.ijse.pos.dto.CustomerDTO;

/**
 *
 * @author ranjith-suranga
 */
public class ManageCustomersController {
    
    private static CustomerBO customerBO = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);
    
    public static List<CustomerDTO> getAllCustomers() throws Exception{
        return customerBO.getAllCustomers();
    }
    
    public static boolean saveCustomer(CustomerDTO customer) throws Exception{
        return customerBO.saveCustomer(customer);
    }
    
    public static boolean deleteCustomer(String customerId) throws Exception{
        return customerBO.deleteCustomer(customerId);
    }
    
}
