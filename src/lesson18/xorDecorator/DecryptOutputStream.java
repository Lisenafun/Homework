package lesson18.xorDecorator;

import java.io.*;

public class DecryptOutputStream extends FilterOutputStream {

    private byte[] password;
    private int currentPosition = 0;

        protected DecryptOutputStream(OutputStream out, byte[] password) {
            super (out);
            this.password = password;
        }
        @Override
        public void write(byte[] b) throws IOException {
                for (int i = 0; i < b.length; i++) {
                    b[i] = (byte) (b[i] ^ password[i % password.length]);
                }
                super.write (b);
        }

    @Override
    public void write(int b) throws IOException {
        b = b ^ password[currentPosition % password.length];
        currentPosition++;
        super.write (b);
    }
}
