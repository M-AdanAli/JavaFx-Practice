module com.adanali.javafx.javafxpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adanali.javafx.javafxpractice to javafx.fxml;
    exports com.adanali.javafx.javafxpractice;
}