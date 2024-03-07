package deneme2;

public class Console {
	 public static void clear() {
	        try {
	            if (System.getProperty("os.name").contains("Mac")) {
	                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
	            } else {
	                // Diğer işletim sistemlerinde temizleme işlemi burada yapılabilir
	                System.out.println("Konsol temizlendi.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
