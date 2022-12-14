package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import model.CountryList;
import javafx.event.ActionEvent;

public class CompareCountryController
{
  @FXML private Button download;
  @FXML private Button back;
  @FXML private ListView listView;

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
    listView.getItems().clear();
    for(int i = 0; i < list.length(); i++)
    {
      listView.getItems().add(list.getCountryName(i));
    }
  }

  public void onClick(ActionEvent event)
  {
    if(event.getSource() == download)
    {

    }
    else if(event.getSource() == back)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE, list);
    }
  }
}
