package view;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.CountryList;

public class MainSceneController
{
  private ViewHandler viewHandler;
  private CountryList list;
  @FXML private Button add;
  @FXML private Button remove;
  @FXML private Button compare;
  @FXML private Button exit;
  @FXML private Label number;

  public void init(ViewHandler viewHandler, CountryList list)
  {
    this.viewHandler = viewHandler;
    this.list = list;

  }

  public void update(CountryList list)
  {
    this.list = list;
    this. number.setText("Number of countries inputted: " + list.length());
  }

  public void onClick(ActionEvent event)
  {
    if(event.getSource() == add)
    {
      viewHandler.changeScene(viewHandler.ADD_COUNTRY, list);
    }
    else if(event.getSource() == remove)
    {
      viewHandler.changeScene(viewHandler.REMOVE_COUNTRY, list);
    }
    else if(event.getSource() == compare)
    {
      viewHandler.changeScene(viewHandler.COMPARE_COUNTRIES, list);
    }
    else if(event.getSource() == exit)
    {
      System.exit(1);
    }
  }

}
