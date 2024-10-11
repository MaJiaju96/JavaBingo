package bingo.common.utils;

import com.spire.ocr.OcrException;
import com.spire.ocr.OcrScanner;
import com.spire.pdf.PdfDocument;
import com.spire.pdf.graphics.PdfImageType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception {

        PdfDocument pdf = new PdfDocument();
        pdf.loadFromFile("E:\\Work\\Doc\\ES\\病历模拟资料（Pdf）\\住院通知单 - 没对上\\组合原始文件_部分5.pdf");
        StringBuilder textBuilder = new StringBuilder();
        OcrScanner scanner = new OcrScanner();
        scanner.setDependencies("E:\\Work\\Doc\\ES\\dependencies\\");
        for (int i = 0; i < pdf.getPages().getCount(); i++) {
            //将页面保存为图片，并设置DPI分辨率
            BufferedImage image = pdf.saveAsImage(i, PdfImageType.Bitmap,500,500);
            //将图片保存为png格式
            String pngPath = String.format("E:\\Work\\Doc\\ES\\病历模拟资料（Pdf）\\病程记录\\"+("ToImage-img-%d.png123"), i);
            File file = new File(pngPath);
            ImageIO.write(image, "PNG", file);
            scanner.scan(pngPath);
            String text = scanner.getText().toString().replaceAll(" ", "").replaceAll("\\r", "").replaceAll("\\n", "");;
            textBuilder.append(text);
        }
        System.out.println(textBuilder.toString());
    }
}
