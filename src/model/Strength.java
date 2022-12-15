package model;

public class Strength
{
  private double mShare;
  private double cDemand;
  private double cBehaviour;
  private double dChannel;

  private String category;

  public Strength( double mShare, double cBehaviour, double cDemand, double dChannel)
  {
    category = "mShare";
    this.mShare = generatePoints(mShare);
    category = "cBehaviour";
    this.cBehaviour = generatePoints(cBehaviour);
    category = "cDemand";
    this.cDemand = generatePoints(cDemand);
    category = "dChannel";
    this.dChannel = generatePoints(dChannel);
  }
  public double generatePoints(double var)
  {
    if (category.equals("mShare"))
    {
      if (var >= 40)
      {
        return 5 * 0.20;
      }
      else if (var >= 30 && var < 40)
      {
        return 4 * 0.20;
      }
      else if (var >= 20 && var < 30)
      {
        return 3 * 0.20;
      }
      else if (var >= 20 && var < 30)
      {
        return 3 * 0.20;
      }
      else if (var >= 20 && var < 30)
      {
        return 3 * 0.20;
      }
    }
    else if(category.equals("cDemand") || category.equals("cBehaviour"))
    {
      return var*0.3;
    }
    else if(category.equals("dChannel"))
    {
      return var*0.2;
    }
    return 0;
  }

  public double getMShare()
  {
    return mShare;
  }

  public double getCDemand()
  {
    return cDemand;
  }

  public double getCBehaviour()
  {
    return cBehaviour;
  }

  public double getDChannel()
  {
    return dChannel;
  }

}
