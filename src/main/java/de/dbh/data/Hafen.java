package de.dbh.data;


public class Hafen {
    private Long id;
    private String name;
    private String land;
    private int maxLiegeplaetze;
    private String hafenId; // automatisch generiert

    // Konstruktoren
    public Hafen() {}

    public Hafen(Long id, String name, String land, int maxLiegeplaetze, String hafenId) {
        this.id = id;
        this.name = name;
        this.land = land;
        this.maxLiegeplaetze = maxLiegeplaetze;
        this.hafenId = hafenId;
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public int getMaxLiegeplaetze() {
        return maxLiegeplaetze;
    }

    public void setMaxLiegeplaetze(int maxLiegeplaetze) {
        this.maxLiegeplaetze = maxLiegeplaetze;
    }

    public String getHafenId() {
        return hafenId;
    }

    public void setHafenId(String hafenId) {
        this.hafenId = hafenId;
    }
}
