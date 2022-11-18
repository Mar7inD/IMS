import com.sun.jdi.connect.AttachingConnector;

public class Attractiveness extends Country
{
  private double size;
  private double growth;
  private int competitiveness;
  private int eStability;
  private int pStability;
  private int infrastructure;
  private int cDifference;

  public Attractiveness(String name, double size, double growth, int competitiveness,
      int eStability, int pStability, int infrastructure, int cDifference)
  {
    super(name);
    this.size = size;
    this.growth = growth;
    this.competitiveness = competitiveness;
    this.eStability = eStability;
    this.pStability = pStability;
    this.infrastructure = infrastructure;
    this.cDifference = cDifference;
  }
}
