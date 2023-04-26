import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		BufferedReader reader;
        try {
	    url = new java.net.URL("https://github.com/skykill111/AoHoa-DienToanDamMay/blob/main/input.txt");
            java.net.URLConnection uc;
            uc = url.openConnection();	
            reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line = reader.readLine();
            n = Integer.valueOf(line);
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
                if(line == null)
                	break;
            	if(line.length() <= n)
            		continue;
            	else
            		line = line.charAt(0) + Integer.toString(line.length() - 2) + line.charAt(line.length() - 1);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
