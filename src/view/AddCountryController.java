package view;


import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import model.Attractiveness;
import model.Country;

import javafx.fxml.FXML;
import model.CountryList;

import javafx.event.ActionEvent;
import model.Strength;

public class AddCountryController
{
  @FXML private Button add;
  @FXML private Button cancel;
  @FXML private TextField name;
  @FXML private TextField mSize;
  @FXML private TextField mGrowth;
  @FXML private ComboBox cSituation;
  @FXML private TextField eStability;
  @FXML private TextField pStability;
  @FXML private ComboBox infrastructure;
  @FXML private TextField cDifference;
  @FXML private TextField mShare;
  @FXML private ComboBox cBehaviour;
  @FXML private ComboBox cDemand;
  @FXML private ComboBox dChannel;
  private ViewHandler viewHandler;
  private CountryList list;
  private boolean error = false;
  public void init(ViewHandler viewHandler, CountryList list)
  {
    this.viewHandler = viewHandler;
    this.list = list;
    this.cSituation.getItems().addAll("Good", "Medium", "Bad");
    this.infrastructure.getItems().addAll("Good", "Medium", "Bad");
    this.cBehaviour.getItems().addAll("Good", "Medium", "Bad");
    this.cDemand.getItems().addAll("Good", "Medium", "Bad");
    this.dChannel.getItems().addAll("Good", "Medium", "Bad");
  }

  public void update(CountryList list)
  {
    this.list = list;
    this.name.setText("");
    this.mShare.setText("");
    this.mGrowth.setText("");
    this.mSize.setText("");
    this.pStability.setText("");
    this.eStability.setText("");
    this.cDifference.setText("");
    this.cSituation.setValue("Value");
    this.infrastructure.setValue("Value");
    this.cBehaviour.setValue("Value");
    this.cDemand.setValue("Value");
    this.dChannel.setValue("Value");
  }

  public void onClick(ActionEvent event)
  {
    if(event.getSource() == add)
    {
      error = false;
      double mSize = textFieldConvert(this.mSize);
      double mGrowth = textFieldConvert(this.mGrowth);
      double cSituation = comboConvert(this.cSituation);
      double eStability = textFieldConvert(this.eStability);
      double pStability = textFieldConvert(this.pStability);
      double infrastructure = comboConvert(this.infrastructure);
      double cDifference = textFieldConvert(this.cDifference);
      double mShare = textFieldConvert(this.mShare);
      double cBehaviour = comboConvert(this.cBehaviour);
      double cDemand = comboConvert(this.cDemand);
      double dChannel = comboConvert(this.dChannel);

      if (!error)
      {
        list.add(new Country(name.getText(),
            new Attractiveness(mSize, mGrowth, cSituation, eStability,
                pStability, infrastructure, cDifference),
            new Strength(mShare, cBehaviour, cDemand, dChannel)));
        viewHandler.changeScene(ViewHandler.MAIN_SCENE, list);
      }
    }
    else if(event.getSource() == cancel)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE, list);
    }
  }

  public double textFieldConvert(TextField textField)
  {
    double result = 0;
    if(textField.getText().isEmpty())
    {
      error = true;
      Alert a = new Alert(Alert.AlertType.ERROR, "Important value not inserted");
      a.show();
    }
    else
    {
      try
      {
        result = Double.parseDouble(textField.getText());
      }
      catch (NumberFormatException e)
      {
        error = true;
        Alert a = new Alert(Alert.AlertType.ERROR, "Important value not inserted correctly");
        a.show();
      }
    }
    return result;
  }
  
  public double comboConvert(ComboBox comboBox)
  {
    if(comboBox.getValue() == "Good")
    {
      return 5;
    }
    else if(comboBox.getValue() == "Medium")
    {
      return 3;
    }
    else if (comboBox.getValue() == "Bad")
    {
      return 1;
    }
    else if (comboBox.getValue() == "Value")
    {
      error = true;
      Alert a = new Alert(Alert.AlertType.ERROR,"Important value not selected");
      a.show();
    }
    return 0;
  }
}
