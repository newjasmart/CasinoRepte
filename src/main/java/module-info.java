module cat.boscdelacoma.casinorepte {
    requires javafx.controls;
    requires javafx.fxml;

    opens cat.boscdelacoma.casinorepte to javafx.fxml;
    exports cat.boscdelacoma.casinorepte;
}
