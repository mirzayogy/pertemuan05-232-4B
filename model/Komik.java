package model;

public class Komik extends Buku {
    private String ilustrator;
    private String chapter;


    public void setChapter(String chapter){
        this.chapter = chapter;
    }
    
    public String getChapter(){
        return this.chapter;
    }

    public void setIlustrator(String ilustrator) {
        this.ilustrator = ilustrator;
    }

    public String getIlustrator() {
        return this.ilustrator;
    }
}
