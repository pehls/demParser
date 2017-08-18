package dump;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.print.DocFlavor.BYTE_ARRAY;

import generatedProto.AiActivity;
import generatedProto.Demo;

public class DemoDump {
	public static void main(String[] args) throws Exception {
		ReadData();
	}

	public static void ReadData() throws Exception {
		byte[] data;
		File f = new File("C:/Users/gabri/git/demParser/demParser/src/utils/3137643518.dem");
		FileInputStream fin = null;
		FileChannel ch = null;
		
			fin = new FileInputStream(f);
			ch = fin.getChannel();
			int size = (int) ch.size();
			MappedByteBuffer buf = ch.map(MapMode.READ_ONLY, 0, size);
			byte[] bytes = new byte[size];
			buf.get(bytes);
			data = bytes;
			for (int i = 0; i<50; i++) {
				System.out.println(data[i]);
			}
		System.out.println(data.length);
		Demo.CDemoFileInfo.parseFrom(data);
	}

}
