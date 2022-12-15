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
  @FXML private Button compare;
  @FXML private ListView<String> countryList = new ListView<String>();

  @FXML private ListView<String> attractivenessList = new ListView<String>();
  @FXML private ListView<String> strengthList = new ListView<String>();
  @FXML private ListView<String> overallList = new ListView<String>();

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
    Object[][] copyList = list.toArray();
    countryList.getItems().clear();
    attractivenessList.getItems().clear();
    strengthList.getItems().clear();
    overallList.getItems().clear();
    for(int i = 0; i < copyList.length; i++)
    {
      countryList.getItems().add(copyList[i][0].toString());
      attractivenessList.getItems().add(Double.toString(Math.round((double)copyList[i][1])));
      strengthList.getItems().add(Double.toString(Math.round((double)copyList[i][2])));
      overallList.getItems().add(Double.toString(Math.round((double)copyList[i][1] + (double) copyList[i][2])));
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
      attractivenessList.getItems().clear();
      strengthList.getItems().clear();
      overallList.getItems().clear();

      for(int i = 0; i < copyList.length; i++)
      {
        double n = 0;
        int k = 0;
          for(int j = 0; j < copyList.length; j++)
          {
            if (n < (double) copyList[j][1] + (double) copyList[j][2])
            {
              n = (double) copyList[j][1] + (double) copyList[j][2];
              k = j;
            }
          }
          countryList.getItems().add(copyList[k][0].toString());
          attractivenessList.getItems().add(Double.toString(Math.round((double)copyList[k][1])));
          strengthList.getItems().add(Double.toString(Math.round((double)copyList[k][2])));
          overallList.getItems().add(Double.toString(Math.round((double)copyList[k][1] + (double) copyList[k][2])));
          copyList[k][1] = 0.0;
          copyList[k][2] = 0.0;
      }
    }
    else if(event.getSource() == back)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE, list);
    }
  }
}
