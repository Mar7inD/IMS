package model;

public class Attractiveness
{
  private double mSizePoints;
  private double mGrowthPoints;
  private double cSituationPoints;
  private double eStabilityPoints;
  private double pStabilityPoints;
  private double infrastructurePoints;
  private double cDifferencePoints;
  private String category;

  public Attractiveness( int mSize, int mGrowth, int cSituation,
      int eStability, int pStability, int infrastructure, int cDifference)
  {
    category = "mSize";
    this.mSizePoints = generatePoints(mSize);
    category = "mGrowth";
    this.mGrowthPoints = generatePoints(mGrowth);
    category = "mGrowth";
    this.cSituationPoints = generatePoints(cSituation);
    this.eStabilityPoints = generatePoints(eStability);
    this.pStabilityPoints = generatePoints(pStability);
    this.infrastructurePoints = generatePoints(infrastructure);
    this.cDifferencePoints = generatePoints(cDifference);
  }

  public double generatePoints(int var)
  {
    if(category.equals("mSize"))
    {
      if(var >= 40)
      {
        return 5*0.35;
      }
      else if(var >= 30 && var < 40)
      {
        return 4*0.35;
      }
      else if(var >= 20 && var < 30)
      {
        return 3*0.35;
      }
      else if(var >= 10 && var < 20)
      {
        return 2*0.35;
      }
      else
      {
        return 1*0.35;
      }
    }
    else if(category.equals("mGrowth"))
    {
      if(var >= 4)
      {
        return 5*0.25;
      }
    }
    return 0;
  }
  public double getMSize()
  {
    return mSizePoints;
  }

  public void setMSize(int mSize)
  {
    mSizePoints = generatePoints(mSize);
  }

  public double getMGrowth()
  {
    return mGrowthPoints;
  }

  public void setMGrowth(int mGrowth)
  {
    mGrowthPoints = generatePoints(mGrowth);
  }

  public double getCSituation()
  {
    return cSituationPoints;
  }

  public void setCSituation(int cSituation)
  {
    cSituationPoints = generatePoints(cSituation);
  }

  public double getEStability()
  {
    return eStabilityPoints;
  }

  public void setEStability(int eStability)
  {
    eStabilityPoints = generatePoints(eStability);
  }

  public double getPStability()
  {
    return pStabilityPoints;
  }

  public void setPStability(int pStability)
  {
    pStabilityPoints = generatePoints(pStability);
  }

  public double getInfrastructure()
  {
    return infrastructurePoints;
  }

  public void setInfrastructure(int infrastructure)
  {
    infrastructurePoints = generatePoints(infrastructure);
  }

  public double getCDifference()
  {
    return cDifferencePoints;
  }

  public void setCDifference(int cDifference)
  {
    cDifferencePoints = generatePoints(cDifference);
  }

}
