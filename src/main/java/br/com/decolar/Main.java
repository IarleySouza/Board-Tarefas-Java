package br.com.decolar;

import br.com.decolar.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static br.com.decolar.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }
    }
}
