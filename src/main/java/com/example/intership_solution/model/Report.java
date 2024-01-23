package com.example.intership_solution.model;

import jakarta.persistence.*;

@Entity
public class Report extends Document{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int report_Id;

    //File model:
    private String fileName;
    private String fileType;
    @Lob
    private byte[] data;

    public int getReport_Id() {
        return report_Id;
    }

    public void setReport_Id(int report_Id) {
        this.report_Id = report_Id;
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