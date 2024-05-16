package controller;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class FileController {
    public void listFilesBySize(String caminho) {
        File diretorio = new File(caminho);
        if (!diretorio.exists() || !diretorio.isDirectory()) { //Valida se o caminho é valido
            System.out.println("O caminho do diretório não é válido.");
            return;
        }
        File[] arq = diretorio.listFiles(); // Lista de arquivos no diretório
        Arrays.sort(arq, Comparator.comparingLong(File::length)); // Ordena os arquivos pelo tamanho em ordem crescente
        System.out.println("Arquivos no diretório " + caminho + " em ordem de tamanho:"); // Exibe os arquivos ordenados por tamanho
        for (File file : arq) {
            double fileSizeMB = file.length() / (1024.0 * 1024.0); // Convertendo bytes para MB
            System.out.println(file.getName() + " - Tamanho: " + String.format("%.2f", fileSizeMB) + " MB");
        }
    }
}
