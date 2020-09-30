package me.devksh930.image.demo.exception;

public class FileDownloadException extends RuntimeException {
    public FileDownloadException(String msg) {
        super(msg);
    }

    public FileDownloadException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
