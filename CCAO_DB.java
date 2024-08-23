package CCAO;

import java.sql.Connection;

    public class CCAO_DB {
        public static void main(String[] args) {
            DBFunctions db=new DBFunctions();
            Connection conn=db.connect_to_db("CCAODB","postgres","CCAO1234");

            //db.createTable(conn,"User_DB");
            // db.insert_row(conn,"User_DB","Rajat","raj123",0);
            // db.read_data(conn,"user_db");
            // db.search_User(conn,"user_db","rajat","raj123");


            //db.update_name(conn,"employee","Rahul","Raj");
            //db.delete_row_by_name(conn,"employee","abhishek");
            //db.delete_row_by_id(conn,"employee",4);
            //db.delete_table(conn,"employee");
    }
}
