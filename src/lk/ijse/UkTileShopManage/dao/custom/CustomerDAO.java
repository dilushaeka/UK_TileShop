package lk.ijse.UkTileShopManage.dao.custom;

import lk.ijse.UkTileShopManage.dao.CrudDAO;
import lk.ijse.UkTileShopManage.entity.Customer;

import java.sql.SQLException;

public interface CustomerDAO extends CrudDAO<Customer,String> {
    String getCustomerLastId()throws Exception;
    int getRowCount()throws ClassNotFoundException, SQLException;
}
