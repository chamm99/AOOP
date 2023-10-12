package strategy.aswer;//@startuml
//class FileInfo {
//    -name: String
//    -type: String
//    -size: int
//    -modifiedDate: Date
//    +FileInfo(name: String, type: String, size: int, modified: Date)
//    +getName(): String
//    +getType(): String
//    +getSize(): int
//    +getModifiedDate(): Date
//    +toString(): String
//}
//@enduml

import java.util.Date;

public class FileInfo {
    private String name;
    private String type;
    private int size;
    private Date modifiedDate;

    public FileInfo(String name, String type, int size, Date modifiedDate) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.modifiedDate = modifiedDate;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getSize() { return size; }
    public Date getModifiedDate() { return modifiedDate; }
    public String toString() {
        return "Name: " + name + "\n"
                + "Type: " + type + "\n"
                + "Size: " + size + "\n"
                + "ModifiedDate: " + modifiedDate.toString();
    }
}
