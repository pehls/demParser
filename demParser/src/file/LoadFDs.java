package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

import org.xerial.snappy.Snappy;

import com.google.protobuf.DescriptorProtos.FileDescriptorProto;

public class DemoFile {
	public static void main(String[] args) throws Exception {
		DemoFile lf = new DemoFile();
		System.out.println(lf.loadProto("utils/demo.proto"));
	}

		public String loadProto(final String filePath) throws Exception {
			try (final InputStream inputStream = new FileInputStream(filePath)) {
				return inputStream.toString();
			}
			// final ByteString byteString = ByteString.copyFrom();
			// final FileDescriptorProto result =
			// FileDescriptorProto.parseFrom(byteString);
			//
			// return result;
		}
	}

