package de.thws.Lektion16.Uebung1;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }

  public Brett kombiniere(Brett combine){
      for(int i = 1; i <= 8; i++){
          for(int j = 1; j <= 8; j++){
              if(gibFeld(i,j) == true){
                  combine.markiereFeld(i,j);
              }
          }
      }
      return combine;
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
}
