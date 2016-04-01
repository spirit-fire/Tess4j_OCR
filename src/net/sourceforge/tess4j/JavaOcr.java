package net.sourceforge.tess4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;

public class JavaOcr {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File imageFile = new File("e:\\test_ocr.png");
		Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
			String path = "E:\\record.txt";
			byte[] bytes;
			try {
				bytes = result.getBytes("gb2312");
				FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
				fileOutputStream.write(bytes);
				fileOutputStream.flush();
				fileOutputStream.close();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		} catch (TesseractException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
