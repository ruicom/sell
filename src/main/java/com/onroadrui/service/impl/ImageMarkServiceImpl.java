package com.onroadrui.service.impl;

import com.onroadrui.service.MarkService;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageMarkServiceImpl implements MarkService {

    @Override
    public String watermark(File image, String fileName) {
        return null;
    }

    public  void pressImage(String pressImg, String targetImg) {
        try {
            File _file = new File(targetImg);
            Image src = ImageIO.read(_file);
            int wideth = src.getWidth(null);
            int height = src.getHeight(null);
            BufferedImage image = new BufferedImage(wideth, height,
                    BufferedImage.TYPE_INT_RGB);
            Graphics g = image.createGraphics();
            g.drawImage(src, 0, 0, wideth, height, null);

            // 水印文件
            File logoFile = new File(pressImg);
            BufferedImage logo = ImageIO.read(logoFile);

            //设置二维码大小，太大，会覆盖二维码，此处20%
            int logoWidth = logo.getWidth() > image.getWidth()*2 /10 ? (image.getWidth()*2 /10) : logo.getWidth();
            int logoHeight = logo.getHeight() > image.getHeight()*2 /10 ? (image.getHeight()*2 /10) : logo.getHeight(); //设置logo图片放置位置

            /** * logo放在中心 */
            int x = (image.getWidth() - logoWidth) / 2;
            int y = (image.getHeight() - logoHeight) / 2;

            g.drawImage(logo,
                    x, y, logoWidth, logoHeight, null);

            g.dispose();
            FileOutputStream out = new FileOutputStream("/tmp/test.jpeg");
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(image);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void pressImage1(String pressImg) {
        try {

            // 水印文件
            File logoFile = new File(pressImg);
            BufferedImage logo = ImageIO.read(logoFile);

            Graphics g = logo.createGraphics();
            g.drawImage(logo, 0, 0,500 ,500 , null);

            g.dispose();
            FileOutputStream out = new FileOutputStream("/tmp/test5.jpeg");
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(logo);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
