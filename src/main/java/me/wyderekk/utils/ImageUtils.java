package me.wyderekk.utils;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageUtils {
    
    public static Image downloadImage(String url, int width, int height) {
        return downloadImage(url).getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public static Image downloadImage(String url) {
        try {
            URL imgURL = new URL(url);
            return ImageIO.read(imgURL);
        } catch (IOException ignored)  {

        }
        return null;
    }
}