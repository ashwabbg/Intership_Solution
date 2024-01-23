package com.example.intership_solution.model;

import jakarta.persistence.*;

@Entity
public class CdC extends Document{

    //File model:
    private String fileName;
    private String fileType;
    @Lob
    private byte[] data;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}