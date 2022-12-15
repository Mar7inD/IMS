package model;

import java.util.ArrayList;

public class CountryList
{
  private ArrayList<Country> countries;

  public CountryList()
  {
    countries = new ArrayList<Country>();
  }

  public int length()
  {
    return countries.size();
  }

  public void add(Country country)
  {
    countries.add(country);
  }

  public String getCountryName(int index)
  {
    return countries.get(index).getName();
  }

  public double getAttractiveness(int index)
  {
    return countries.get(index).getAttractivenessResult();
  }

  public double getStrength(int index)
  {
    return countries.get(index).getStrengthResult();
  }
  public Object[][] toArray()
  {
    Object[][] arrayResult = new Object[countries.size()][3];
    for(int i = 0; i < arrayResult.length; i++)
    {
      arrayResult[i][0] = countries.get(i).getName();
      arrayResult[i][1] = countries.get(i).getAttractivenessResult();
      arrayResult[i][2] =countries.get(i).getStrengthResult();
    }
    return arrayResult;
  }

  public void remove(int index)
  {
    countries.remove(index);
  }

}
