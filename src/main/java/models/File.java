package models;


import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

    private int id;
    private String name;
    private String extension;
    private int size;
    private Folder folder;


    public File(){
    }

    public File(String name, String extension, int size, Folder folder){
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}




//A file should have a name, extension (e.g. txt, rb, java, ppt), size and folder.

