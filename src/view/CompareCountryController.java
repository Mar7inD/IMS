package view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import model.CountryList;
import javafx.event.ActionEvent;

import java.io.*;
import java.nio.file.Path;
import java.text.DecimalFormat;

public class CompareCountryController
{
  @FXML private Button download;
  @FXML private Button back;
  @FXML private Button compare;
  @FXML private ListView<String> countryList = new ListView<>();

  @FXML private ListView<String> attractivenessList = new ListView<>();
  @FXML private ListView<String> strengthList = new ListView<>();
  @FXML private ListView<String> overallList = new ListView<>();

  private ViewHandler viewHandler;
  private CountryList list;
  private int clicks;

  DecimalFormat f = new DecimalFormat("#0.00");
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
    for (Object[] objects : copyList)
    {
      countryList.getItems().add(objects[0].toString());
      attractivenessList.getItems().add(f.format(objects[1]));
      strengthList.getItems().add((f.format(objects[2])));
      overallList.getItems().add(f.format((double) objects[1] + (double) objects[2]));
    }
  }

  public void onClick(ActionEvent event)
  {
    //download button
    if(event.getSource() == download)
    {
      clicks++;
      PrintWriter write = null;
      try
      {
        FileOutputStream fileOut = new FileOutputStream(
            Path.of("").toAbsolutePath() + "/src/download/download" + clicks + ".txt");
        write = new PrintWriter(fileOut);
      }
      catch (FileNotFoundException e)
      {
        System.out.println("File not found, or could not be opened");
        System.exit(1);
      }

      write.println("Downloaded Compared List");
      write.println("");
      write.println("---");
      write.println("");

      Object[][] copyList = list.toArray();

      for(int i = 0; i < copyList.length; i++)
      {
        double n = 0;
        int k = 0;
        for (int j = 0; j < copyList.length; j++)
        {
          if (n < (double) copyList[j][1] + (double) copyList[j][2])
          {
            n = (double) copyList[j][1] + (double) copyList[j][2];
            k = j;
          }
        }
        write.println("Country name: " + copyList[k][0]);
        write.println("Country attractiveness: " + f.format(copyList[k][1]));
        write.println("Country strength: " + f.format(copyList[k][2]));
        write.println("Country overall: " + f.format(((double)copyList[k][1] + (double)copyList[k][2])));
        write.println("");
        write.println("---");
        write.println("");
        copyList[k][1] = 0.0;
        copyList[k][2] = 0.0;
      }
      Alert alert = new Alert(Alert.AlertType.INFORMATION, "New text file with name download" + clicks + ".txt has been downloaded");
      alert.show();
      write.close();
    }

    //compare button
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
          attractivenessList.getItems().add(f.format(((double)copyList[k][1])));
          strengthList.getItems().add(f.format((double)copyList[k][2]));
          overallList.getItems().add(f.format((double)copyList[k][1] + (double) copyList[k][2]));
          copyList[k][1] = 0.0;
          copyList[k][2] = 0.0;
      }
    }

    //back button
    else if(event.getSource() == back)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE, list);
    }

  }
}
