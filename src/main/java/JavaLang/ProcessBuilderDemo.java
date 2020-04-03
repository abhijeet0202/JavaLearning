package JavaLang;

final class ProcessBuilderDemo {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("notepad", "winamp.exe*32");
		try{
			pb.start();
		}catch (Exception ex){
			System.out.println(ex);
		}

	}

}
