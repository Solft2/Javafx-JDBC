package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem about; 
	@FXML
    public void onMenuItemSellerAction() {
    	System.out.println("Menu seller clicado");
    }
	@FXML
	public void onMenuItemDepartmentAction() {
    	System.out.println("Menu Department clicado");
    }
	@FXML
	public void onMenuItemaboutAction() {
    	System.out.println("Menu about clicado");
    }
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}

}
