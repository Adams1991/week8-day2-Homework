import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder = new Folder("Downloads");
        DBHelper.save(folder);

        Folder folder2 = new Folder("Downloads");
        DBHelper.save(folder2);


        File file1 = new File("Bla", ".rb", 30, folder);
        DBHelper.save(file1);

        File file2 = new File("Bla", ".rb", 30, folder);
        DBHelper.delete(file2);

        List<File> files = DBHelper.getAll(File.class);

        File foundFile = DBHelper.find(File.class, file1.getId());


        file1.setName("bababa");
        DBHelper.update(file1);


    }
}
