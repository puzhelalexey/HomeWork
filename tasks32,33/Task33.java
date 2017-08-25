package tasks_32_33;

/* List the files and directories of the selected directory on the disk.
 Files and directories must be printed separately.
 */


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task33 {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\Drivers\\Audio alchd_full\\alchd");
        System.out.println("Список файлов и каталогов:");
        System.out.print(Arrays.toString(file.list()));
        System.out.println();
        System.out.println();

        List<File> listFiles = new ArrayList<>();
        List<File> listDir = new ArrayList<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                listDir.add(file1);
            } else {
                listFiles.add(file1);
            }
        }

        System.out.println("Каталоги: " + listDir);
        System.out.println();
        System.out.println("Файлы: " + listFiles);

    }
}
