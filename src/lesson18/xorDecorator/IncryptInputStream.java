package lesson18.xorDecorator;

import java.io.*;

public class IncryptInputStream extends FilterInputStream {

    private byte[] password;
    private int currentPosition = 0;

    protected IncryptInputStream(InputStream in, byte[] password) {
        super (in);
        this.password = password;
    }

    @Override
    public int read() throws IOException {
        int b = super.read ();
        b = b^password[currentPosition % password.length];
        currentPosition++;
        return b;
    }

    @Override
    public int read(byte[] b) throws IOException {
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte)(b[i]^password[i % password.length]);
        }
        return super.read (b);
    }
}




