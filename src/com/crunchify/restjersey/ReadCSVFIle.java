package com.crunchify.restjersey;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.print.attribute.Size2DSyntax;

public class ReadCSVFIle {

	 public static void main(String[] args) {

	        String csvFile = "C:/Users/panuja/Desktop/Film.csv";
	        String line = "";
	        String cvsSplitBy = ",";
	        ArrayList<String> list = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] country = line.split(cvsSplitBy);
	                
	              
	                list.add(country[1]);
	                list.add(country[2]);
	                
	                //System.out.println("Film [Year= " + country[2] + " , Title=" + country[1] + "]");

	            }
	           
	            Random random = new Random();
                int index = random.nextInt(list.size());
                System.out.println(list.get(index)+"and"+list.get(index+1).replace("\"", ""));
                

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

}
