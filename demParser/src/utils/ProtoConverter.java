package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.github.os72.protocjar.Protoc;

public class ProtoConverter {

	private static String [] protoName = null;

	public ProtoConverter ProtoConverter() {
		return this;
	}

	// public boolean run() throws Exception, InterruptedException {
	// if (this.protoName==null)
	// return false;
	// Protoc.runProtoc(protoName);
	// }]
	public static void run() throws Exception {
		protoName = new String [2];
		protoName[0] = "protoc " + " --proto_path=C:\\Users\\gabri\\git\\demParser\\demParser\\src\\utils  C:\\Users\\gabri\\git\\demParser\\demParser\\src\\utils\\";
		protoName[1] =  " --java_out=C:\\Users\\gabri\\git\\demParser\\demParser\\src\\generatedProto";
		
		executeCommand("C:\\protoc\\bin\\protoc.exe ");
		executeCommand(protoName[0] + "dota_commonmessages.proto " + protoName[1]);
//		executeCommand(protoName[0] + "demo.proto" + protoName[1]);
//		executeCommand(protoName[0] + "dota_commonmessages.proto" + protoName[1]);
//		executeCommand(protoName[0] + "dota_modifiers.proto" + protoName[1]);
//		executeCommand(protoName[0] + "dota_usermessages.proto" + protoName[1]);
//		executeCommand(protoName[0] + "netmessages.proto" + protoName[1]);
//		executeCommand(protoName[0] + "usermessages.proto" + protoName[1]);
	}

	private static void executeCommand(String command) throws Exception {

		Process process = Runtime.getRuntime().exec("cmd.exe");
		String line = "";
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		line = br.readLine();
		while (line.compareTo("") != 0) {
			System.out.println("Retorno do comando = [" + line + "]");
			line = br.readLine();
		}

		//setCurrentDirectory("C:\\protoc\\bin");
		
		process = Runtime.getRuntime().exec(command);

		is = process.getInputStream();
		isr = new InputStreamReader(is);
		br = new BufferedReader(isr);

		line = br.readLine();
		while (line != null) {
			System.out.println("Retorno do comando = [" + line + "]");
			line = br.readLine();
		}
		process.destroy();
		br.close();

	}
//	private static boolean setCurrentDirectory(String directory_name) {
//		    Boolean result = false; // Boolean indicating whether directory was set
//		    File directory = null; // Desired current working directory
//
//		    directory = new File(directory_name).getAbsoluteFile();
//		    if (directory.exists() || directory.mkdirs()) {
//		      result = (System.setProperty("user.dir", directory.getAbsolutePath()) != null);
//		    }
//			return result;
//	}
}
