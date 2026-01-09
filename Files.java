public class Files {
    String filename;
    String extension;
    double size;

    Files(String filename, String extension, double size){
        this.filename = filename;
        this.extension = extension;
        this.size = size;
    }

    String display(){
        return this.filename + this.extension + " | " + "File Size: " + this.size +" kb";
    }
}
