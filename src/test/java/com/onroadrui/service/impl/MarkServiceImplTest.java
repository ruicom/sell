package com.onroadrui.service.impl;

import com.onroadrui.utils.ImageUtil;

import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Created by onroadrui on 17/11/9.
 */
public class MarkServiceImplTest {


    @Test
    public void test() throws IOException {
        ImageMarkServiceImpl markService = new ImageMarkServiceImpl();
        String filePath = "/tmp/timg.jpeg";
        File originalFile = new File(filePath);
        File markFile = new File("/tmp/timg1.JPEG");
        //markService.watermark(originalFile, markFile);

    }

    @Test
    public void test1() throws IOException {
        ImageMarkServiceImpl markService = new ImageMarkServiceImpl();
        String filePath2 = "/tmp/testResult.jpeg";
        ImageUtil.scale(filePath2, "/tmp/testResult4.jpeg", 300,300,true);
    }

    @Test
    public void test3() throws IOException {
        ImageMarkServiceImpl markService = new ImageMarkServiceImpl();
        String filePath2 = "/tmp/timg (3).jpeg";
        BufferedImage image = ImageUtil.scale(filePath2,200,200);
        ImageIO.write(image, "JPEG", new File("/tmp/testResult1.jpeg"));      //输出压缩图片
    }

}

