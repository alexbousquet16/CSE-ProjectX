package ratings;


public class Song extends Ratable {

    private String songArtist;
    private String songId;


    public Song(String title, String songArtist, String songId) {
        super(title);
        this.songArtist = songArtist;
        this.songId = songId;
    }

    public String getArtist(){
        return songArtist;
    }

    public void setArtist(String songArtist){
        this.songArtist = songArtist;
    }

    public String getSongID(){
        return songId;
    }

    public void setSongID(String songId) {
        this.songId = songId;
    }


}


