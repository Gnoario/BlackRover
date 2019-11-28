package entity;

public class Quest {
    private int quest_id;
    private String description;
    private boolean in_quest;
    private boolean quest_finalize;
    private int exp;
    private int locations;

    public Quest(int quest_id, String description, boolean in_quest, boolean quest_finalize, int exp, int locations) {
        this.quest_id = quest_id;
        this.description = description;
        this.in_quest = in_quest;
        this.quest_finalize = quest_finalize;
        this.exp = exp;
        this.locations = locations;
    }

    public Quest() {
	}

	public int getQuest_id() {
        return quest_id;
    }

    public void setQuest_id(int quest_id) {
        this.quest_id = quest_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIn_quest() {
        return in_quest;
    }

    public void setIn_quest(boolean in_quest) {
        this.in_quest = in_quest;
    }

    public boolean isQuest_finalize() {
        return quest_finalize;
    }

    public void setQuest_finalize(boolean quest_finalize) {
        this.quest_finalize = quest_finalize;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLocations() {
        return locations;
    }

    public void setLocations(int locations) {
        this.locations = locations;
    }

}