package com.example.edmontonxplore;

import android.net.Uri;

public class Places {
    String title,description,longMessage,imagesTitle,Location;
    int imageId, imageOne,imagetwo;
    Uri locations;

    public Places(String title, String description, String longMessage, String imagesTitle, String location, int imageId, int imageOne, int imagetwo) {
        this.title = title;
        this.description = description;
        this.longMessage = longMessage;
        this.imagesTitle = imagesTitle;
        Location = location;
        this.imageId = imageId;
        this.imageOne = imageOne;
        this.imagetwo = imagetwo;

    }
// ithe j hau value tahi duji screen ch show huni a
    public  Places(String title, String description, int imageID,String longMessage,int imageOne,int imagetwo,Uri locations ) {
        this.title = title;
        this.description = description;
        this.imageId = imageID;
        this.longMessage = longMessage;
        this.imageOne = imageOne;
        this.imagetwo = imagetwo;
        this.locations = locations;


    }
}
