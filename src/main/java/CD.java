import java.util.ArrayList;

/**
 * Created by Guest on 8/8/17.
 */
public class CD {
    private String artist;
    private String title;
    private int year;
    private static ArrayList<CD> cdList = new ArrayList<>();

    public CD(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        cdList.add(this);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public static ArrayList<CD> getAllCDs() {
        return cdList;
    }

    public static void clearAllCds() {
        cdList.clear();
    }

}
