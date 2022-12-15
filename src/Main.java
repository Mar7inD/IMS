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
  private CountryList list = new CountryList();

  @Override public void start(Stage primaryStage)
  {
    viewHandler = new ViewHandler(primaryStage, list);
  }

  public static void main(String[] args)
  {
    //The lines bellow are for quick tests
    /*
    list.add( new Country("Name1",
        new Attractiveness(1,1,1,1,1,1,1),
        new Strength(1,1,1,1)));
    list.add( new Country("Name2",
        new Attractiveness(2,2,2,2,2,2,2),
        new Strength(2,2,2,2)));
    list.add( new Country("Name3",
        new Attractiveness(8,8,8,8,8,8,8),
        new Strength(8,8,8,8)));
    list.add( new Country("Name4",
        new Attractiveness(12,12,12,12,12,12,12),
        new Strength(12,12,12,12)));
    list.add( new Country("Name5",
        new Attractiveness(5,5,5,5,5,5,5),
        new Strength(5,5,5,5)));*/

    launch(args);
  }

}