module com.zyrnzak.hotelbooking {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome;
    requires AnimateFX;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.zyrnzak.hotelbooking to javafx.fxml;
    opens com.zyrnzak.hotelbooking.Views to javafx.fxml;
    exports com.zyrnzak.hotelbooking;
    exports com.zyrnzak.hotelbooking.Views;
    exports com.zyrnzak.hotelbooking.Controllers;
    exports com.zyrnzak.hotelbooking.Controllers.Admin;
    exports com.zyrnzak.hotelbooking.Controllers.User;
    exports com.zyrnzak.hotelbooking.Models;

}