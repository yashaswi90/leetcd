package sa;

import java.io.File;

public class FileRead {
    public static void main(String[] args) {
        String folder_name = "D:\\yskaam\\kanchuQ";
        File[] listFiles = new File(folder_name).listFiles();
        boolean fileNotFound = true;
        try {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    String fileName = listFiles[i].getName();
                    if (fileName.startsWith("CTC ") && fileName.endsWith(".xls")) {
                        System.out.println(("Found file"));
                        fileNotFound = false;
                    }
                }
            }
            if (fileNotFound) {
                System.out.println("File not exist");
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
