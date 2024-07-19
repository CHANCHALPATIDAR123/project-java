import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ConnectionCloseDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // Do Stuff
        } catch (Exception e) {
            // Exception handling stuff;
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                /* ignored */
                System.out.println("p");
            }
            try {
                ps.close();
            } catch (SQLException e) {
                /* ignored */
                System.out.println("p");
            }
            try {
                con.close();
            } catch (SQLException e) {
                /* ignored */
                System.out.println("p");
            }
        }
    }
}
