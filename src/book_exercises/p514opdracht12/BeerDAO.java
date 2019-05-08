package book_exercises.p514opdracht12;

import java.sql.*;

public class BeerDAO {
    private String url;
    private String user;
    private String password;

    public BeerDAO() {
    }

    public BeerDAO(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Beer getBeerById(int id) throws BeerException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Beers WHERE Id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Beer beer = new Beer();
                    beer.setId(id);
                    beer.setName(resultSet.getString("Name"));
                    beer.setPrice(resultSet.getFloat("Price"));
                    beer.setAlchohol(resultSet.getFloat("Alcohol"));
                    beer.setStock(resultSet.getInt("Stock"));
                    return beer;
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            throw new BeerException(e);
        }
    }

    public void UpdateBeer(Beer beer) throws BeerException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Beers SET Name = ?, Price = ?, Alcohol = ?, Stock = ? WHERE Id = ?")) {
            preparedStatement.setString(1,beer.getName());
            preparedStatement.setFloat(2,beer.getPrice());
            preparedStatement.setFloat(3,beer.getAlchohol());
            preparedStatement.setInt(4,beer.getStock());
            preparedStatement.setInt(5,beer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new BeerException(e);
        }
    }
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
}
