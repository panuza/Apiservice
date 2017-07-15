package com.crunchify.restjersey;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Utills {

	public static ArrayList<HashMap<String, String>> getList() {

		InputStream csvFile = Utills.class.getClassLoader().getResourceAsStream("Film");

		String line = "";
		String cvsSplitBy = ",";
		ArrayList<HashMap<String, String>> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] country = line.split(cvsSplitBy);
				HashMap<String, String> hash = new HashMap<>();
				hash.put(country[1], country[2]);

				list.add(hash);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
