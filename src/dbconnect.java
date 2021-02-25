import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class dbconnect {
    public static final String DEFAULT_ENCODING = "UTF-8"; 
      public static String CheckAccOne(String id) throws FileNotFoundException, IOException{ 
       String url = ".\\bank.dat";
        String ok ="";
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        fileInputStream = new FileInputStream(url);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                ok+=line;
                line = bufferedReader.readLine();
            }
            
              String dataOk = RunDecode(ok);
            
        String[] row = dataOk.split("#");
        for(int i =0; i<row.length; i++){
            String[] tmp = row[i].split("!");
            if(tmp[0].equals(id)){
                fileInputStream.close();
                bufferedReader.close();
                return tmp[0]+"!"+Decryption(tmp[1])+"!"+tmp[2]+"!"+tmp[3];
            }
        }
        fileInputStream.close();
        bufferedReader.close();
       return "null-null-null-0";
   }
    public static boolean CheckAcc(String id, String pass) throws FileNotFoundException, IOException{
        
       String ok = "";
        String url = ".\\user.dat";
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        fileInputStream = new FileInputStream(url);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = bufferedReader.readLine();
            while (line != null) {
                ok+=line;
                line = bufferedReader.readLine();
            }
        
        
        String dataOk = RunDecode(ok);
        System.out.println(dataOk);
        String[] row = dataOk.split("#");
        System.out.println(row.length);
        for(int i=0; i<row.length; i++){
            String[] tmp = row[i].split("!");
            if(tmp[0].equals(id)){
                fileInputStream.close();
                bufferedReader.close();
                return true;
            }
        }
        fileInputStream.close();
        bufferedReader.close();
       return false;
   }
    public static String ReadAccBank(String id, String pass) throws FileNotFoundException, IOException{
        String url = ".\\bank.dat";
        String ok ="";
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        fileInputStream = new FileInputStream(url);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                ok+=line;
                line = bufferedReader.readLine();
            }
            
              String dataOk = RunDecode(ok);
            
        String[] row = dataOk.split("#");
        for(int i =0; i<row.length; i++){
            String[] tmp = row[i].split("!");
            if(tmp[0].equals(id) && Decryption(tmp[1]).equals(pass)){
                fileInputStream.close();
                bufferedReader.close();
                return tmp[0]+"!"+Decryption(tmp[1])+"!"+tmp[2]+"!"+tmp[3];
            }
        }
        fileInputStream.close();
        bufferedReader.close();
       return "null-null-null-0";
   }   
    public static void WriteDataAcc(String id, String pas) throws IOException{
        String pass = Encrpytion(pas);
        String s = id+"!"+pass+"#";
        String dataEnd = RunEncode(s);
        byte b[] = dataEnd.getBytes();
      FileOutputStream fout=new FileOutputStream(new File(".\\user.dat"),true);
        try {
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
           
   }
    public static void WriteDataBank(String id, String pas, String name, String money) throws IOException{
         String pass = Encrpytion(pas);
        String s = id+"!"+pass+"!"+name+"!"+money+"#";
         String dataEnd = RunEncode(s);
        byte b[] = dataEnd.getBytes();
      FileOutputStream fout=new FileOutputStream(new File(".\\bank.dat"),true);
        try {
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
     }
    public static void updataDataBank(String id, String pass, String name, String money) throws IOException{
        String url = ".\\bank.dat";
        String s = "";
        String ok ="";
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        fileInputStream = new FileInputStream(url);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                ok+=line;
                line = bufferedReader.readLine();
            }
            
            String dataok = RunDecode(ok);
        String[] row = dataok.split("#");
        for(int i =0; i<row.length; i++){
            String[] tmp = row[i].split("!");
            if(tmp[0].equals(id) && Decryption(tmp[1]).equals(pass)){
              s+= tmp[0]+"!"+tmp[1]+"!"+tmp[2]+"!"+money+"#";
            }else{
                s+=row[i]+"#";
            }
        }
        fileInputStream.close();
        bufferedReader.close();
          
          String dataS = RunEncode(s);
          
        byte b[] = dataS.getBytes();
      FileOutputStream fout=new FileOutputStream(new File(".\\bank.dat"),false);
        try {
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
     }
    public static void DeleteBack(String id, String pass) throws IOException{
        String url = ".\\bank.dat";
        String s = "";
        String ok ="";
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        fileInputStream = new FileInputStream(url);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                ok+=line+"#";
                line = bufferedReader.readLine();
            }
            
            String dataOk = RunDecode(ok);
        String[] row = dataOk.split("#");
        for(int i =0; i<row.length; i++){
            String[] tmp = row[i].split("!");
            if(tmp[0].equals(id)){
            }else{
                s+=row[i];
            }
        }
        fileInputStream.close();
        bufferedReader.close();
          
          String dataokS  = RunEncode(s);
          
        byte b[] = dataokS.getBytes();
      FileOutputStream fout=new FileOutputStream(new File(".\\bank.dat"),false);
        try {
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
     } 
    public static void DeleteUser(String id, String pass) throws IOException{
        String url = ".\\user.dat";
        String s = "";
        String ok ="";
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        fileInputStream = new FileInputStream(url);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                ok+=line;
                line = bufferedReader.readLine();
            }
            
            String dataOK = RunDecode(ok);
            
        String[] row = dataOK.split("#");
        for(int i =0; i<row.length; i++){
            String[] tmp = row[i].split("!");
            if(tmp[0].equals(id) && tmp[1].equals(Decryption(pass))){
            }else{
                 String[] res = row[i].split("!");
                s+=res[0]+"!"+Decryption(res[1])+"!"+res[2]+"!"+res[3];
            }
        }
        fileInputStream.close();
        bufferedReader.close();
          
          String dataOKs =RunEncode(s);
          
        byte b[] = dataOKs.getBytes();
      FileOutputStream fout=new FileOutputStream(new File(".\\user.dat"),false);
        try {
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
     } 
    
    
      public static String ReadTMP() throws IOException{
         String url = ".\\tmp.dat";
        String ok ="";
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        fileInputStream = new FileInputStream(url);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                ok+=line;
                line = bufferedReader.readLine();
            }
         
        return ok;
   }
    public static void WriteTMP(String id, String pas) throws IOException{
        String s = id+"!"+pas;
        byte b[] = s.getBytes();
      FileOutputStream fout=new FileOutputStream(new File(".\\tmp.dat"),false);
        try {
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
           
   }
    // mã hóa password
    public static String Encrpytion(String text){
         int code = (int) Math.floor(((Math.random() * 899999) + 100000));
         return String.valueOf(code)+"@"+text;
    }
    //  Gỉai mã pass
    public static String Decryption(String text) {
        int code = (int) Math.floor(((Math.random() * 899999) + 100000));
           String[] y =text.split("@");
           if(y.length==1){
               return y[0];
           }
        return y[1];
    }
    
    
    
    public static String convertByteArraysToBinary(byte[] input) {
        StringBuilder result = new StringBuilder();
        for (byte b : input) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                result.append((val & 128) == 0 ? 0 : 1);      // 128 = 1000 0000
                val <<= 1;
            }
        }
        return result.toString();
    }
      public static String ENCODE(String binary, int blockSize, String separator) {
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;
        }

            return result.stream().collect(Collectors.joining(separator));
        }
     public static String DECODE(String s) {
         System.out.println(s);
         
       int charCode = Integer.parseInt(s, 2);
        String str = new Character((char)charCode).toString();
         System.out.println(str);
       return str;
        }
     
     public static String RunEncode(String s){
         String res = "";
         for(int i=0; i<s.length(); i++){
                 String input = ""+ s.charAt(i);
                String result = convertByteArraysToBinary(input.getBytes(StandardCharsets.UTF_8));
                res+=ENCODE(result, 8, " ");
         }
         return res;
     }
         public static String RunDecode(String s){
         String res = "";
         int dem =0;
         String ok = "";
         for(int i=0; i<s.length(); i++){
             dem++;
             ok+=s.charAt(i);
             if(dem == 8){
                  res+=DECODE(ok); 
                  dem=0;
                  ok="";
             }
                 
         }
         return res;
     }
}
