import javafx.application.Application;
import javafx.stage.Stage;
import model.Attractiveness;
import model.Country;
import model.CountryList;
import model.Strength;
import view.ViewHandler;

public class Main extends Application
{
  private ViewHandler viewHandler;
  private static CountryList list = new CountryList();

  @Override public void start(Stage primaryStage)
  {
    viewHandler = new ViewHandler(primaryStage, list);
  }

  public static void main(String[] args)
  {
    list.add( new Country("Name",
        new Attractiveness(2,2,2,2,2,2,2),
        new Strength(2,2,2,2)));

    launch(args);
  }

}