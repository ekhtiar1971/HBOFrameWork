package datasource;
import base.CommonAPI;
import databases.ConnectToSqlDB;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static base.CommonAPI.convertToString;

public class DatabaseOperation {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public  static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"HBOSearchTopics","topics");
    }
    public  static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Movies");
        itemsList.add("Sports");
        itemsList.add("Series");
        itemsList.add("Kids");
        itemsList.add("Specials");
        return itemsList;
    }

    public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("HBOSearchTopics", "topics");
        return list;
    }
    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
        ConnectToSqlDB.connectToSqlDatabase();
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("HBOSearchTopics","topics");
        for(String st:list){
            System.out.println(st);
        }
    }
}



