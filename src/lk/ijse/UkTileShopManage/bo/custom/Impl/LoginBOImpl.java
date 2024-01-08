package lk.ijse.UkTileShopManage.bo.custom.Impl;

import lk.ijse.UkTileShopManage.bo.custom.LoginBO;
import lk.ijse.UkTileShopManage.dao.DAOFactory;
import lk.ijse.UkTileShopManage.dao.custom.CashierDAO;
import lk.ijse.UkTileShopManage.dto.CashierDTO;
import lk.ijse.UkTileShopManage.entity.Cashier;

import java.sql.SQLException;

public class LoginBOImpl implements LoginBO {
    CashierDAO cashierDAO = (CashierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CASHIER);

    @Override
    public CashierDTO getValidated(String userName) throws SQLException, ClassNotFoundException {
//        Cashier validate = usersDAO.validate(userName);
//        return new UsersDTO(validate.getUser_name(),validate.getUser_password(),validate.getPosition());
        Cashier cus = cashierDAO.validate(userName);
        return new CashierDTO(cus.getCastID(),cus.getCastlogin(),cus.getCastPassword());
    }
}
