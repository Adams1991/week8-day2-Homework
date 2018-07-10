import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder = new Folder("Downloads");
        DBHelper.save(folder);

        File file1 = new File("Bla", ".rb", 30, folder);
        DBHelper.save(file1);




    }
}
