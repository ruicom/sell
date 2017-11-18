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

/**
 * Created by onroadrui on 17/11/9.
 */
public class TextMarkServiceImpl implements MarkService {
    @Override
    public String watermark(File image,String fileName)  {
//        try {
//            Image image1 = ImageIO.read(image);
//            BufferedImage bufferedImage =
//                    new BufferedImage(image1.getWidth(null),
//                            image1.getHeight(null), BufferedImage.TYPE_INT_RGB);
//            Graphics2D graphics2D = bufferedImage.createGraphics();
//            graphics2D.drawImage(image1,
//                    image1.getWidth(null), image1.getHeight(null), null);
//
//            graphics2D.setFont(new Font("微软雅黑", Font.BOLD, 120));
//            graphics2D.setColor(Color.black);
//            graphics2D.drawString("hello", 10, 10+120);
//            graphics2D.dispose();
//            FileOutputStream os = new FileOutputStream("/var/"+fileName);
//            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);
//            encoder.encode(bufferedImage);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return null;
    }
}
