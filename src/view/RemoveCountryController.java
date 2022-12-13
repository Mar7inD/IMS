package view;


import model.CountryList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXML;

public class RemoveCountryController
{
  @FXML private Button cancel;
  @FXML private Button remove;
  @FXML private ComboBox options;

  private ViewHandler viewHandler;
  private CountryList list;
  public void init(ViewHandler viewHandler, CountryList list)
  {
    this.viewHandler = viewHandler;
    this.list = list;

    options = new ComboBox();
    for(int i = 0; i < list.length(); i++)
    {
      options.getItems().add(list.getCountryName(i));
    }
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
          init(this.viewHandler,list);
        }
      }
    }
    else if(event.getSource() == cancel)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE);
    }
  }

}
