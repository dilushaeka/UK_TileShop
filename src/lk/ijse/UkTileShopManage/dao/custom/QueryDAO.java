package lk.ijse.UkTileShopManage.dao.custom;

import lk.ijse.UkTileShopManage.dao.SuperDAO;
import lk.ijse.UkTileShopManage.entity.CustomEntity;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    ArrayList<CustomEntity> getOrderDetailsFromOID(String oid) throws ClassNotFoundException, SQLException;
}
