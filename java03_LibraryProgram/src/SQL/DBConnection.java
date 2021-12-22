import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DBConnection {
    private Connection conn; //DB 커넥션 연결 객체
    private static final String USERNAME = "20203025";//DBMS접속 시 아이디
    private static final String PASSWORD = "!!!!20203025";//DBMS접속 시 비밀번호
    private static final String URL = "jdbc:mysql://jdb.deu.monster:60001/j20203025";//DBMS접속할 db명
    
    public DBConnection() {
        try {
            System.out.println("생성자");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            System.out.println("드라이버 로딩 실패 ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
        
        
    }
}