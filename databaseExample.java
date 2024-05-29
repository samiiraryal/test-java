import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
    class DBConnection{
        private Connection con;
        private Statement stm;
        private ResultSet result;
        public DBConnection() throws ClassNotFoundException{
            try{
                Class.forName("com.jdbc.mysql.cj.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
                stm=con.createStatement();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        public void useSQLForDatabase() throws SQLException{
            String sql="crete database it_4th";
            stm.executeUpdate(sql);
        }
        public void createTable() throws SQLException{
            String sql="create table it_4th_A(id int auto_increment primary key, name varchar(30), address varchar(30),email varchar(30)";
            stm.executeUpdate(sql);
        }
        public void insertIntoTable() throws SQLException{
            String sql="insert into it_4th_A(name,address) values ('ram','ktm')";
            stm.executeUpdate(sql);
        }
        public void getData() throws SQLException{
            String sql="select * from it";
            result =stm.executeQuery(sql);
            System.out.println("id\t\t\tname\t\t\taddress\t\t\temail:");
            while(result.next()){
                final int id=result.getInt(id);
                final String name=result.getString(name);
                final String address=result.getString(address);
                System.out.println(id+"\t\t\t"+name+"\t\t\t"+address);
            }
        }
    
        }
        class databaseExample{
            public static void main(String[] args) throws ClassNotFoundException, SQLException{
                DBConnection dbc=new DBConnection();
                dbc.useSQLForDatabase();
                dbc.createTable();
            }
        }
    

