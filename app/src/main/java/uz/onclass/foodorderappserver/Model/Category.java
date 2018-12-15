package uz.onclass.foodorderappserver.Model;

import android.media.Image;

public class Category {
    private String Name;
    private String Image;
    private static int id=11;

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Category() {
    }

    public Category(String name, String image) {

        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
