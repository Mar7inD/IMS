package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.CountryList;
import javafx.event.ActionEvent;

public class CompareCountryController
{
  @FXML private Button download;
  @FXML private Button back;

  private ViewHandler viewHandler;
  private CountryList list;
  public void init(ViewHandler viewHandler, CountryList list)
  {
    this.viewHandler = viewHandler;
    this.list = list;
  }

  public void onClick(ActionEvent event)
  {
    if(event.getSource() == download)
    {

    }
    else if(event.getSource() == back)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE);
    }
  }
}
