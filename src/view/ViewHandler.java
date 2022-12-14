package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.CountryList;

import java.io.IOException;

public class ViewHandler
{
  private CountryList list;
  private Stage primaryStage;
  private Scene main;
  private Scene add;
  private Scene remove;
  private Scene compare;

  private AddCountryController addCountryController;
  private RemoveCountryController removeCountryController;
  private CompareCountryController compareCountryController;
  private MainSceneController mainSceneController;

  public static final String ADD_COUNTRY = "ADD_COUNTRY";
  public static final String REMOVE_COUNTRY = "REMOVE_COUNTRY";
  public static final String COMPARE_COUNTRIES = "COMPARE_COUNTRIES";
  public static final String MAIN_SCENE = "MAIN_SCENE";

  public ViewHandler(Stage primaryStage, CountryList list)
  {
    this.primaryStage = primaryStage;
    this.list = list;

    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("MainScene.fxml"));
    try
    {
      main = new Scene(loader.load());
      mainSceneController = loader.getController();
      mainSceneController.init(this, list);
    }
    catch (IOException e)
    {
      System.out.println("Failed to load MainScene.fxml");
      System.exit(1);
    }

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("AddCountry.fxml"));
    try
    {
      add = new Scene(loader.load());
      addCountryController = loader.getController();
      addCountryController.init(this,list);
    }
    catch(IOException e)
    {
      System.out.println("Failed to load AddCountry.fxml");
      System.exit(1);
    }

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("RemoveCountry.fxml"));
    try
    {
      remove = new Scene(loader.load());
      removeCountryController = loader.getController();
      removeCountryController.init(this,list);
    }
    catch(IOException e)
    {
      System.out.println("Failed to load RemoveCountry.fxml");
      System.exit(1);
    }

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("CompareCountries.fxml"));
    try
    {
      compare = new Scene(loader.load());
      compareCountryController = loader.getController();
      compareCountryController.init(this,list);
    }
    catch(IOException e)
    {
      System.out.println("Failed to load CompareCountry.fxml");
      System.exit(1);
    }

    changeScene(MAIN_SCENE, list);
  }


  public void changeScene(String sceneName, CountryList list)
  {
    this.list = list;
    if(MAIN_SCENE.equals(sceneName))
    {
      mainSceneController.update(list);
      primaryStage.setTitle("Main page");
      primaryStage.setScene(main);
      primaryStage.show();
    }
    else if(ADD_COUNTRY.equals(sceneName))
    {
      addCountryController.update(list);
      primaryStage.setTitle("Add page");
      primaryStage.setScene(add);
      primaryStage.show();
    }
    else if(REMOVE_COUNTRY.equals(sceneName))
    {
      removeCountryController.update(list);
      primaryStage.setTitle("Remove page");
      primaryStage.setScene(remove);
      primaryStage.show();
    }
    else if(COMPARE_COUNTRIES.equals(sceneName))
    {
      compareCountryController.update(list);
      primaryStage.setTitle("Compare page");
      primaryStage.setScene(compare);
      primaryStage.show();
    }
  }
}
