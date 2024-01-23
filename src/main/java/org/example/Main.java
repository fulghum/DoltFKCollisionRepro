package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:11229/jan23", "root", "");
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("DROP TABLE IF EXISTS formstatusflow;");
        stmt.executeUpdate("CREATE TABLE `formstatusflow` ( `StatusflowID` int(11) UNSIGNED NOT NULL AUTO_INCREMENT , `SagID` int(11) UNSIGNED NOT NULL , `FromStatusID` int(11) UNSIGNED NOT NULL , `ToStatusID` int(11) UNSIGNED NOT NULL , `UUID` char(36) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL , `InSync` tinyint(1) NOT NULL DEFAULT 1 , `Timestamp` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP , PRIMARY KEY (`StatusflowID`), FOREIGN KEY (`FromStatusID`) REFERENCES `formstatus` (`StatusID`) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (`ToStatusID`) REFERENCES `formstatus` (`StatusID`) ON DELETE CASCADE ON UPDATE CASCADE, INDEX `Statusflow.ToStatusID` (`ToStatusID`) USING BTREE , INDEX `StatusFlow.FromStatusID` (`FromStatusID`) USING BTREE ) ENGINE=InnoDB DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci AUTO_INCREMENT=1");
        stmt.close();
        connection.close();
    }
}