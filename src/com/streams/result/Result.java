package com.streams.result;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) throws IOException {
		
		//Creating a file named boy.txt
		File file=new File("boy.txt");
		
		PrintWriter printWriter=new PrintWriter(file);
		for(int i=0;i<100;i++)
		{
			Random random=new Random();
			printWriter.println(random.nextInt(50));
		}
		printWriter.close();
		
		//Creating an arraylist for reading and storing integers
		ArrayList<Integer> intList= new ArrayList<>(); 
		
		//Creating a scanner for the file and reading and sorting the file
		Scanner scanner=new Scanner(file);
		while(scanner.hasNextInt()) {
			intList.add(scanner.nextInt());
		}
		intList.stream().distinct().sorted().forEach(System.out::println);
		scanner.close();
	}

}