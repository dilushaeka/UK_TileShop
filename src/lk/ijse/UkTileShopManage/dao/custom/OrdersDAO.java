package lk.ijse.UkTileShopManage.dao.custom;

import lk.ijse.UkTileShopManage.dao.CrudDAO;
import lk.ijse.UkTileShopManage.entity.Orders;

import java.sql.SQLException;

public interface OrdersDAO extends CrudDAO<Orders,String> {
    String getOrderLastId()throws Exception;
    int getRowCount()throws ClassNotFoundException, SQLException;
}
