package lk.ijse.UkTileShopManage.bo.custom;
import lk.ijse.UkTileShopManage.bo.SuperBO;
import lk.ijse.UkTileShopManage.dto.ItemDTO;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface ItemBO extends SuperBO {

    boolean addItem(ItemDTO Item) throws ClassNotFoundException, SQLException;

    boolean deleteItem(String id) throws ClassNotFoundException, SQLException;

    boolean updateItem(ItemDTO id) throws ClassNotFoundException, SQLException;

    ItemDTO searchItem(String id) throws ClassNotFoundException, SQLException;

    ObservableList<ItemDTO> getAllItem() throws ClassNotFoundException, SQLException;

    int getRowCount()throws ClassNotFoundException,SQLException;

    //  boolean updateStock(ArrayList<ItemDTO> orderItems) throws SQLException, ClassNotFoundException;

}

