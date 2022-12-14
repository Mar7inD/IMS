package view;


import javafx.scene.control.ComboBox;
import model.CountryList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class RemoveCountryController
{
  @FXML private Button cancel;
  @FXML private Button remove;
  @FXML private ComboBox options = new ComboBox();


  private ViewHandler viewHandler;
  private CountryList list;
  public void init(ViewHandler viewHandler, CountryList list)
  {
    this.viewHandler = viewHandler;
    this.list = list;
  }

  public void update(CountryList list)
  {
    this.list = list;
    options.getItems().clear();
    for(int i = 0; i < list.length(); i++)
    {
      options.getItems().add(list.getCountryName(i));
    }
    viewHandler.changeScene(ViewHandler.MAIN_SCENE, this.list);
  }

  public void onClick(ActionEvent event)
  {
    if(event.getSource() == remove)
    {
      for (int i = 0; i < list.length(); i++)
      {
        if(options.getValue() == list.getCountryName(i))
        {
          list.remove(i);
          options.getItems().remove(options.getValue());
          viewHandler.changeScene(ViewHandler.MAIN_SCENE, list);
        }
      }
    }
    else if(event.getSource() == cancel)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE, list);
    }
  }

}
