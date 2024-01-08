package lk.ijse.UkTileShopManage.dao.custom;

import lk.ijse.UkTileShopManage.dao.CrudDAO;
import lk.ijse.UkTileShopManage.entity.Cashier;

import java.sql.SQLException;

public interface CashierDAO extends CrudDAO<Cashier,String> {
    String getCashierLastId()throws Exception;
    int getRowCount()throws ClassNotFoundException, SQLException;
    Cashier validate(String userName) throws SQLException, ClassNotFoundException;
}
