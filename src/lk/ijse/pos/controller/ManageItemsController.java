/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.ItemBO;
import lk.ijse.pos.business.custom.impl.ItemBOImpl;
import lk.ijse.pos.dto.ItemDTO;

/**
 *
 * @author ranjith-suranga
 */
public class ManageItemsController {
    
    private static ItemBO itemBO = (ItemBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ITEM);
    
    public static List<ItemDTO> getAllItems() throws Exception{
        return itemBO.getAllItems();
    }
    
    public static boolean saveItem(ItemDTO item) throws Exception{
        return itemBO.saveItem(item);
    }
    
    public static boolean deleteItem(String itemCode) throws Exception{
        return itemBO.deleteItem(itemCode);
    }    
    
}
