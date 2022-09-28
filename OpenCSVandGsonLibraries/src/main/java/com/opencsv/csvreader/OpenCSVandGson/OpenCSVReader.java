package com.opencsv.csvreader.OpenCSVandGson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class OpenCSVReader {
	public static final String SAMPLE_CSV_FILE_PATH = "/Users/OpenCSVandGsonLibraries/users.csv";
	
	public static void main(String[] args) throws IOException {
		try (
			Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
		) {
			CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder<CSVUser>(reader).withType(CSVUser.class).withIgnoreLeadingWhiteSpace(true).build();
			List<CSVUser> csvUsers = csvToBean.parse();
			for (CSVUser csvUser : csvUsers) {
				System.out.println("Name : " + csvUser.getName());
				System.out.println("Email : " + csvUser.getEmail());
				System.out.println("Phone : " + csvUser.getPhoneNumber());
				System.out.println("Country : " + csvUser.getCountry());
				System.out.println("==========================");
			}
		}
	}
}
