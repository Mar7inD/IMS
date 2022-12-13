package model;

public class Country
{
  private String name;
  private double attractivenessResult;
  private double strengthResult;
  public Country(String name, Attractiveness attractiveness, Strength strength)
  {
    this.name = name;
    attractivenessResult = attractiveness.getMSize() +
        attractiveness.getMGrowth() + attractiveness.getEStability() +
        attractiveness.getPStability() + attractiveness.getCSituation() +
        attractiveness.getInfrastructure() + attractiveness.getCDifference();
    strengthResult = strength.getMShare() + strength.getCBehaviour() +
        strength.getCDemand() + strength.getDChannel();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

}
