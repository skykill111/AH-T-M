package Bai1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("E:\\LuuDuLieuSinhVien\\2001200266_DangTranKhoi_JAVA\\KTGK02-2001200266-DangTranKhoi\\src\\Bai1\\input.txt"));
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
