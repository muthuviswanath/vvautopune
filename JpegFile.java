public class JpegFile extends Files{
    
    JpegFile(String filename, String extension, double size){
        super(filename, extension, size);
    }

    boolean moveAround(){
        return false;
    }
}
