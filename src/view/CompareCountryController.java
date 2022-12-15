package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import model.Country;
import model.CountryList;
import javafx.event.ActionEvent;

import java.util.ArrayList;

public class CompareCountryController
{
  @FXML private Button download;
  @FXML private Button back;
  @FXML private Button compare;
  @FXML private ListView countryList = new ListView<String>();

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
    countryList.getItems().clear();
    for(int i = 0; i < list.length(); i++)
    {
      countryList.getItems().add(list.getCountryName(i));
    }
  }

  public void onClick(ActionEvent event)
  {
    if(event.getSource() == download)
    {

    }
    else if(event.getSource() == compare)
    {
      Object[][] copyList = list.toArray();
      countryList.getItems().clear();

      for(int i = 0; i < copyList.length; i++)
      {
        double n = 0;
        int k = 0;
          for(int j = 0; j < copyList.length; j++)
          {
            if (n < (double) copyList[j][1])
            {
              n = (double) copyList[j][1];
              k = j;
            }
          }
        countryList.getItems().add(" Country name: " + copyList[k][0].toString()
            + " | Overall: " + Math.round((double)copyList[k][1]));
        copyList[k][1] = 0.0;
      }
    }
    else if(event.getSource() == back)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE, list);
    }
  }
}
