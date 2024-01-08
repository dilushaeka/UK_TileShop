package lk.ijse.UkTileShopManage.dao.custom;

import lk.ijse.UkTileShopManage.TM.dtmTM;
import lk.ijse.UkTileShopManage.dao.CrudDAO;
import lk.ijse.UkTileShopManage.entity.Item;

import java.sql.SQLException;

public interface ItemDAO extends CrudDAO<Item,String> {
    String getItemLastId() throws Exception;

    int getRowCount() throws ClassNotFoundException, SQLException;

    boolean updateStock(dtmTM orderDetail) throws ClassNotFoundException, SQLException;
}
