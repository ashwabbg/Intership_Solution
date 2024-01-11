package com.example.intership_solution.model;

import jakarta.persistence.*;

@Entity
public class CdC extends Document{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CdC_Id;

    //File model:
    private String fileName;
    private String fileType;
    @Lob
    private byte[] data;

    public int getCdC_Id() {
        return CdC_Id;
    }

    public void setCdC_Id(int cdC_Id) {
        CdC_Id = cdC_Id;
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