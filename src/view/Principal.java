package view;

import controller.FileController;

public class Principal {
    public static void main(String[] args) {
        FileController controller = new FileController();

        String directoryPath = "C:\\Windows";
        controller.listFilesBySize(directoryPath);
    }
}
