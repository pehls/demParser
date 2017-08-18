package file;

import java.io.File;
import java.util.Collection;

import utils.ProtoConverter;


public class ProtoLoader {

	public ProtoLoader() {
//		Ai_activity aa = Converter.create().toDomain(Ai_activity.class, new Collection("C:/Users/gabri/git/demParser/demParser/src/utils/ai_activity.proto"))
	}
	public static void main(String[] args) throws Exception {
		ProtoConverter.run();
	}

}
