package cf.wyderekk.utils;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageUtils {
    
    public static Image getImgFromUrl(String url, int width, int height) {
        Image image;
        try {
            URL imgURL = new URL(url);
            image = ImageIO.read(imgURL);
        } catch (IOException ex) {
            return null;
        }
        Image newImage = image.getScaledInstance(width, height, Image.SCALE_DEFAULT);
        return newImage;
    }
    
    public static Image getImgFromUrl(String url) {
        Image image;
        try {
            URL imgURL = new URL(url);
            image = ImageIO.read(imgURL);
        } catch (IOException ex) {
            return null;
        }
        return image;
    }
}