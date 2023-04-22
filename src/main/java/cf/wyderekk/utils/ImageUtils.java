package cf.wyderekk.utils;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageUtils {
    
    public static Image getImgFromUrl(String url, int width, int height) {
        try {
            URL imgURL = new URL(url);
            return ImageIO.read(imgURL).getScaledInstance(width, height, Image.SCALE_DEFAULT);
        } catch (IOException ignored)  {

        }
        return null;
    }

    public static Image getImgFromUrl(String url) {
        try {
            URL imgURL = new URL(url);
            return ImageIO.read(imgURL);
        } catch (IOException ignored)  {

        }
        return null;
    }
}