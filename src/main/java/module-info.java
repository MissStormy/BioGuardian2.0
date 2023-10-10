module bioguardian.bioguardian {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens bioguardian.bioguardian to javafx.fxml;
    exports bioguardian.bioguardian;
}