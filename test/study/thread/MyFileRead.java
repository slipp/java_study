package study.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class MyFileRead implements Runnable {
    
    private String filename;
    private String err;
    private String result;
    
    public void run() {
        StringBuffer sb = new StringBuffer();
        Scanner s;
        try {
            s = new Scanner(new File(filename));
            while (s.hasNextLine()) {
                sb.append(s.nextLine() + "\n");
            }
            s.close();
        } catch (FileNotFoundException e) {
            err = e.getMessage();
            //e.printStackTrace();
        } finally {
        }
        
        result = sb.toString();
        callback();
    }
    
    public void read(String filename) {
        Thread t = new Thread(this);
        this.filename = filename;
        t.start();
    }
    
    public abstract void callback();
    public String getErr() {
        return err;
    }
    public String getResult() {
        return result;
    }
}