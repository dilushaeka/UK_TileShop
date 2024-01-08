package lk.ijse.UkTileShopManage.dao.custom;

import dao.CrudDAO;
import entity.Suplay;

import java.sql.SQLException;

public interface SuplayDAO extends CrudDAO<Suplay,String> {
    String getSuplayLastId()throws Exception;
    int getRowCount()throws ClassNotFoundException, SQLException;

}
