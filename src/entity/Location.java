package entity;

public class Location {
    private int room_id;
    private String description;
    private String tag;
    private String tag_prolog;

    public Location(int room_id, String description, String tag, String tag_prolog) {
        this.room_id = room_id;
        this.description = description;
        this.tag = tag;
        this.tag_prolog = tag_prolog;
    }

    public Location() {
	}

	public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag_prolog() {
        return tag_prolog;
    }

    public void setTag_prolog(String tag_prolog) {
        this.tag_prolog = tag_prolog;
    }

    
}