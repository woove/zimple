package com.contoh.zmall.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVRead
{

   public static void main(String[] args)
   {
      String csvFile = "c:/temp/contoh.csv";
      BufferedReader br = null;
      String line = "";
      String cvsSplitBy = ",";

      try {
          br = new BufferedReader(new FileReader(csvFile));
          while ((line = br.readLine()) != null) {
              String[] country = line.split(cvsSplitBy);
              for (int i = 0; i< country.length; i++){
                 System.out.print(country[i] + "_");
              }
              System.out.println("");
              //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
          }

      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } finally {
          if (br != null) {
              try {
                  br.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
      System.out.println("DONE");
   }
}
