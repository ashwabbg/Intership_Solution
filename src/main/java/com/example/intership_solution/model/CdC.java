package com.example.intership_solution.model;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class CdC extends Document{

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int cdc_Id;
    private String fileName;
    private String fileType;
    @Lob
    private byte[] data;

    public CdC() {

    }

    public CdC(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

    public int getCdc_Id() {
        return cdc_Id;
    }

    public String getStringCdc_Id() {
        return String.valueOf(cdc_Id);
    }

    public void setCdc_Id(int cdc_Id) {
        this.cdc_Id = cdc_Id;
    }

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