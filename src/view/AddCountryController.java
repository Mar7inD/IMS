package view;

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
  public void init(ViewHandler viewHandler, CountryList list)
  {
    this.viewHandler = viewHandler;
    this.list = list;
    cSituation.getItems().addAll(
        "Heavy",
        "Medium",
        "Light"
    );
    cSituation.setValue("Value");
    infrastructure.getItems().addAll(
        "Good",
        "Medium",
        "Bad"
    );
    infrastructure.setValue("Value");

  }

  public void onClick(ActionEvent event)
  {
    if(event.getSource() == add)
    {
      list.add(new Country(name.getText(),
          new Attractiveness(convert(mSize.getText()), convert(mGrowth.getText()),0
              /*convert(cSituation.getText())*/, convert(eStability.getText()),
              convert(pStability.getText()),0/* convert(infrastructure.getText())*/,
              convert(cDifference.getText())),
          new Strength(convert(mShare.getText()), 0, 0,
              0 /*convert(cBehaviour.getText()),
              convert(cDemand.getText()), convert(dChannel.getText())*/)));
    }
    else if(event.getSource() == cancel)
    {
      viewHandler.changeScene(viewHandler.MAIN_SCENE);
    }
  }

  public int convert(String str)
  {
    return Integer.parseInt(str);
  }
}
