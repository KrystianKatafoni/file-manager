package com.katafoni.filemanager.file.exception;

public class FileHasIncorrectExtensionException extends RuntimeException {
    public FileHasIncorrectExtensionException(String extensionName) {
        super("File has incorrect format, extension:  " + extensionName);
    }
}
