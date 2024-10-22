package com.campusdual.subclasses;

public class Item {

    private String tittle;
    private String publicationDate;
    private boolean chechedOut = false;

    public Item(String tittle, String publicationgDate) {
        this.tittle = tittle;
        this.publicationDate = publicationgDate;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublicationgDate() {
        return publicationDate;
    }

    public void setPublicationgDate(String publicationgDate) {
        this.publicationDate = publicationgDate;
    }

    public boolean isChechedOut() {
        return chechedOut;
    }

    public void setChechedOut(boolean chechedOut) {
        this.chechedOut = chechedOut;
    }
    public String getDetails(){
        return "Title: " + this.tittle + ", Publication date: " + this.publicationDate + " Checked Out" + this.chechedOut ;
    }
}
