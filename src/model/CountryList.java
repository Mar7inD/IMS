package model;

import java.util.ArrayList;

public class CountryList
{
  private ArrayList<Country> countries;

  private CountryList(Country country)
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

}
