package br.com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClasseBuffered {
	public static void main(String[] args) {
		File arquivo = new File("BufferedReader_Writer1.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
			BufferedReader br = new BufferedReader(new FileReader(arquivo)); ) {

			bw.write("Escrevendo a primeira linha com BufferedWriter");
			bw.newLine();
			bw.write("Escrevendo mais uma linha");
			bw.newLine();
			bw.flush();

			String texto = null;
			while ((texto = br.readLine()) != null) {
				System.out.println(texto);
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
