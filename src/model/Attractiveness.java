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

  public Attractiveness( double mSize, double mGrowth, double cSituation,
      double eStability, double pStability, double infrastructure, double cDifference)
  {
    category = "mSize";
    this.mSizePoints = generatePoints(mSize);
    category = "mGrowth";
    this.mGrowthPoints = generatePoints(mGrowth);
    category = "cSituation";
    this.cSituationPoints = generatePoints(cSituation);
    category = "eStability";
    this.eStabilityPoints = generatePoints(eStability);
    category = "pStability";
    this.pStabilityPoints = generatePoints(pStability);
    category = "infrastructure";
    this.infrastructurePoints = generatePoints(infrastructure);
    category = "cDifference";
    this.cDifferencePoints = generatePoints(cDifference);
  }

  public double generatePoints(double var)
  {
    if(category.equals("mSize"))
    {
      if(var >= 40)
      {
        return 5*0.30;
      }
      else if(var >= 30 && var < 40)
      {
        return 4*0.30;
      }
      else if(var >= 20 && var < 30)
      {
        return 3*0.30;
      }
      else if(var >= 10 && var < 20)
      {
        return 2*0.30;
      }
      else
      {
        return 1*0.30;
      }
    }
    else if(category.equals("mGrowth"))
    {
      if(var >= 10)
      {
        return 5*0.30;
      }
      else if (var >= 5 && var < 10)
      {
        return 3*0.30;
      }
      else if (var < 5)
      {
        return 1*0.30;
      }
    }
    //!!!---Na cSituation trqbva da e string?---!!!
    /*else if (category.equals("cSituation"))
    {
      if(var )
    }*/
    else if (category.equals("eStability"))
    {
      if(var >= 90000){
        return 5*0.08;
      }
      else if (var >= 70000 && var < 90000)
      {
        return 4*0.08;
      }
      else if (var >= 50000 && var < 70000)
      {
        return 3*0.08;
      }
      else if (var >= 30000 && var <50000)
      {
        return 2*0.08;
      }
      else if (var < 30000)
      {
        return 1*0.08;
      }
    }
    else if (category.equals("pStability"))
    {
      if(var >= 90){
        return 5*0.03;
      }
      else if (var >= 70 && var <90)
      {
        return 4*0.03;
      }
      else if (var >= 50 && var < 70)
      {
        return 3*0.03;
      }
      else if (var >= 30 && var < 50)
      {
        return 2*0.03;
      }
      else if (var < 30)
      {
        return 1*0.03;
      }
    }
    //!!!---Na infrastructure trqbva da e string?---!!!
    /*else if (category.equals("infrastructure"))
    {
      if (var )
    }*/
    else if (category.equals("cDifference"))
    {
      if(var == 0 && var < 10){
        return 5*0.13;
      }
      else if (var >= 10 && var < 30)
      {
        return 4*0.13;
      }
      else if (var >= 30 && var < 50)
      {
        return 3*0.13;
      }
      else if (var >= 50 && var <70)
      {
        return 2*0.13;
      }
      else if (var >= 70)
      {
        return 1*0.13;
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
