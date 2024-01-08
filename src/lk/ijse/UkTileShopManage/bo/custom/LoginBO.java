package lk.ijse.UkTileShopManage.bo.custom;

import lk.ijse.UkTileShopManage.bo.SuperBO;
import lk.ijse.UkTileShopManage.dto.CashierDTO;

import java.sql.SQLException;

public interface LoginBO extends SuperBO {
    CashierDTO getValidated(String userName) throws SQLException, ClassNotFoundException;
}
