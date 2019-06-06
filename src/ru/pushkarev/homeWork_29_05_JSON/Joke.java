package ru.pushkarev.homeWork_29_05_JSON;

import com.fasterxml.jackson.annotation.*;

@JsonAutoDetect
public class Joke {
    private int id;
    @JsonIgnore
    private String type;
    private String setup;
    private String punchline;

    public Joke(int id, String type, String setup, String punchline) {
        this.id = id;
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }

    public Joke() {
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", setup='" + setup + '\'' +
                ", punchline='" + punchline + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    @JsonProperty("Бред какой - то")
    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}


