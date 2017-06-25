package com.example.andre.myapplicationfirebase;

/**
 * Created by andre on 25-Jun-17.
 */

public class Artist {

    String artistId;
    String artistName;
    String artistGenre;

    public Artist(){
        //this constructor is required
    }

    public Artist(String artistId, String artistName, String artistGenre) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }
}
