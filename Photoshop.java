public class Photoshop {
    void open(Files f){
        System.out.println(f.display());
        if( f instanceof PngFile){
            PngFile png = (PngFile) f;
            System.out.println("Can move around: " + png.moveAround());
        }
        else {
            JpegFile jpeg = (JpegFile) f;
            System.out.println("Can move around: " + jpeg.moveAround());
        }
       
        
    }
    public static void main(String[] args) {
        Photoshop ps = new Photoshop();
        PngFile png = new PngFile("myimage", ".png", 123.45);
        JpegFile jpeg = new JpegFile("holiday", ".jpg", 234.56);
        ps.open(png);
        ps.open(jpeg);
    }
}
