package database;

//TODO
// Using the JDBC API and MySQl make the following queries as individual functions:
// 1. 1 Drop table MOVIES if there is one.    1
// 2.1  Create a table MOVIES with columns: id(primary key) of type INTEGER AUTO INCREMENT,title of type VARCHAR (255), genre of type VARCHAR (255),yearOfRelease of type INTEGER.
// 3.1 Add any three records to the MOVIES table
// 4. 1 Update one selected record's title field (use the PreparedStatement)
// 5.  Delete selected record with specified id
// 6. Display all other records in the database


import java.sql.*;


public class Task1 {

    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/javaee18";
        String username = "root";
        String password = "1234";
        try (Connection con = DriverManager.getConnection(dbURL, username, password)) {
            dropTable(con);
            createTable(con);
            insertData(con);
            readData(con);





        } catch (SQLException e) {
            e.printStackTrace();
        }

        }
    public static void dropTable(Connection con) throws SQLException{
        Statement dropStatement = con.createStatement();
        dropStatement.execute("DROP TABLE IF EXISTS movies"); }

    public static void createTable(Connection con) throws SQLException{
        Statement createStatement = con.createStatement();

        String sql = "CREATE TABLE IF NOT EXISTS movies ("
                + "	id integer AUTO_INCREMENT,"
                + "	title varchar(255) NOT NULL,"
                + "	genre varchar(255) NOT NULL, "
                + "yearOfRelease integer NOT NULL,"
                + "PRIMARY KEY(id))";

        createStatement.execute(sql);




    }
    public static void readData(Connection con) throws SQLException {

        String sql = "SELECT*FROM movies";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int row = 1;

        while (resultSet.next()) {


            String title = resultSet.getString("title");
            String genre = resultSet.getString("genre");
            String yearOfRelease = resultSet.getString("yearOfRelease");


            String output = "movie #%d:  %s - %s - %s #####";
            System.out.printf((output) + "%n", row++, title, genre, yearOfRelease);


        }

    }

    public static void insertData(Connection con) throws SQLException {
        Statement statement = con.createStatement();

        statement.executeUpdate("INSERT INTO movies " + " VALUES (id,'St wars','fantasy',1990)");
        statement.executeUpdate("INSERT INTO movies " + " VALUES (id,'St wars2','fantasy',1990)");
        statement.executeUpdate("INSERT INTO movies " + " VALUES (id,'St wars3','fantasy',1990)");


    }

    }


