module javafxJdbc {
	requires javafx.controls;
	requires javafx.fxml;
	opens gui to javafx.fxml;
	exports gui;
	exports model.services;
	exports model.entities;
	opens application to javafx.graphics, javafx.fxml;
}
