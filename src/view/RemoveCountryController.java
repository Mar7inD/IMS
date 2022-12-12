package view;

import model.CountryList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class RemoveCountryController
{
  @FXML private Button cancel;
  @FXML private Button remove;
  private ViewHandler viewHandler;
  private CountryList list;
  public void init(ViewHandler viewHandler, CountryList list)
  {
    this.viewHandler = viewHandler;
    this.list = list;
  }

  public void onClick(ActionEvent event)
  {
    if(event.getSource() == remove)
    {

    }
    else if(event.getSource() == cancel)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE);
    }
  }

}
