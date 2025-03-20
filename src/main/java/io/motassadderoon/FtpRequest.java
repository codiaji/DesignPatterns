package io.motassadderoon;

public class FtpRequest implements Request{
    @Override
    public void handleRequest() {
        System.out.println("FTP request");
    }
}
