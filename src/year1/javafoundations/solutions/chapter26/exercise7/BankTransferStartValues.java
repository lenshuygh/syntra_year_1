package year1.javafoundations.solutions.chapter26.exercise7;

import java.sql.*;

public class BankTransferStartValues {
    private static final String QUERY = "select * from Accounts where number = ?";
    private static final String UPDATE = "update Accounts set amount = ? where number = ?";

    public static void main(String[] args) throws Exception {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student",
                "student123");
             PreparedStatement qstmt = con.prepareStatement(
                     QUERY);
             PreparedStatement ustmt = con.prepareStatement(
                     UPDATE)) {
            setAmount(ustmt, 1, 750);
            setAmount(ustmt, 2, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void setAmount(PreparedStatement ustmt,
                                 int number, double amount) throws SQLException {
        ustmt.setInt(2, number);
        ustmt.setDouble(1, amount);
        ustmt.executeUpdate();
    }

    public static double getAmount(PreparedStatement qstmt,
                                   int number) throws SQLException {
        double amount = 0;
        qstmt.setInt(1, number);
        try (ResultSet rs = qstmt.executeQuery()) {
            if (rs.next()) {
                amount = rs.getDouble("amount");
            }
        }
        return amount;
    }
}
