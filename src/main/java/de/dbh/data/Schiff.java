package de.dbh.data;


public class Schiff {
    private Long id;
    private String name;
    private String imoNummer; // Eindeutige Nummer, z.B. "IMO 1234567"
    private String reederei;
    private String schiffstyp; // z.B. "Containerschiff", "Tanker"

    // Konstruktoren
    public Schiff() {}

    public Schiff(Long id, String name, String imoNummer, String reederei, String schiffstyp) {
        this.id = id;
        this.name = name;
        this.imoNummer = imoNummer;
        this.reederei = reederei;
        this.schiffstyp = schiffstyp;
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

    public String getImoNummer() {
        return imoNummer;
    }

    public void setImoNummer(String imoNummer) {
        this.imoNummer = imoNummer;
    }

    public String getReederei() {
        return reederei;
    }

    public void setReederei(String reederei) {
        this.reederei = reederei;
    }

    public String getSchiffstyp() {
        return schiffstyp;
    }

    public void setSchiffstyp(String schiffstyp) {
        this.schiffstyp = schiffstyp;
    }
}
