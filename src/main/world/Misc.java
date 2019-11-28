package main.world;

import entity.Location;
import entity.Quest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Misc {

    private List<Location> locations = new ArrayList<>();
    private List<Player> player = new ArrayList<>();
    private List<Quest> quests = new ArrayList<>();
    static String loc = "locations.dat";
    static String playr = "players.dat";
    static String quest = "quests.dat";
    private File plyers = new File("players.txt");

    public static List<Location> recoveryLocations() {

        String linha = "";
        List<Location> lista = new ArrayList<>();
        try {

            FileReader arq = new FileReader(new File(loc));
            BufferedReader lerArq = new BufferedReader(arq);

            linha = lerArq.readLine();

            while (linha != null) {
                Location l = new Location();
                String values[] = linha.split(";");
                l.setTag(values[0]);
                l.setDescription(values[1]);
                l.setRoom_id(Integer.parseInt(values[2]));
                l.setTag_prolog(values[3]);

                lista.add(l);
                linha = lerArq.readLine();

            }
            arq.close();
        } catch (IOException ex) {
            System.out.println("Erro: Não foi possível ler o arquivo!");
        }
        return lista;
    }

    public static List<Quest> recoveryQuests() {

        String linha = "";
        List<Quest> quests = new ArrayList<>();
        try {

            FileReader arq = new FileReader(new File(quest));
            BufferedReader lerArq = new BufferedReader(arq);

            linha = lerArq.readLine();

            while (linha != null) {
                Quest q = new Quest();
                String values[] = linha.split(";");
                q.setQuest_id(Integer.parseInt(values[0]));
                q.setDescription(values[1]);
                q.setLocations(Integer.parseInt(values[2]));
                q.setExp(Integer.parseInt(values[3]));
                q.setIn_quest(Boolean.parseBoolean(values[4]));
                q.setQuest_finalize(Boolean.parseBoolean(values[5]));

                quests.add(q);
                linha = lerArq.readLine();

            }
            arq.close();
        } catch (IOException ex) {
            System.out.println("Erro: Não foi possível ler o arquivo!");
        }
        return quests;
    }

    public static List<Player> recoveryPlayer() {

        String linha = "";
        List<Player> players = new ArrayList<>();
        try {

            FileReader arq = new FileReader(new File(playr));
            BufferedReader lerArq = new BufferedReader(arq);

            linha = lerArq.readLine();

            while (linha != null) {
                Player p = new Player();
                String values[] = linha.split(";");
                p.setName(values[0]);
                p.setLevel(Integer.parseInt(values[1]));
                p.setHealth(Integer.parseInt(values[2]));
                p.setMax_health(Integer.parseInt(values[3]));
                p.setDamage(Integer.parseInt(values[4]));
                p.setMagic(Integer.parseInt(values[5]));
                p.setGold(Integer.parseInt(values[7]));
                p.setArmor(Integer.parseInt(values[8]));
                p.setMax_armor(Integer.parseInt(values[9]));
                p.setMana(Integer.parseInt(values[11]));
                p.setMax_mana(Integer.parseInt(values[12]));
                p.setEnergy(Integer.parseInt(values[13]));
                p.setMax_energy(Integer.parseInt(values[14]));
                p.setDefence(Integer.parseInt(values[15]));
                p.setStr(Integer.parseInt(values[16]));
                p.setIntellect(Integer.parseInt(values[17]));
                p.setDex(Integer.parseInt(values[18]));
                p.setSort(Integer.parseInt(values[19]));
                p.setPoints(Integer.parseInt(values[20]));
                p.setXp(Integer.parseInt(values[21]));

                players.add(p);
                linha = lerArq.readLine();

            }
            arq.close();
        } catch (IOException ex) {
            System.out.println("Erro: Não foi possível ler o arquivo!");
        }
        return players;
    }

    public void loadPlayer() {

        try {
            FileWriter fw2 = new FileWriter(plyers);
            BufferedWriter bw2 = new BufferedWriter(fw2);

            if (getPlayer() != null && !getPlayer().isEmpty()) {
                for (Player p : getPlayer()) {

                    bw2.write(p.getName() + ";" + p.getLevel() + ";" + p.getHealth() + ";" + p.getMax_health() + ";"
                            + p.getDamage() + ";" + p.getMagic() + ";" + p.getGold() + ";"
                            + p.getArmor() + ";" + p.getMax_armor() + ";" + p.getMana() + ";"
                            + p.getMax_mana() + ";" + p.getEnergy() + ";" + p.getMax_energy() + ";" + p.getDefence()
                            + ";" + p.getStr() + ";" + p.getIntellect() + ";" + p.getDex() + ";" + p.getSort() + ";"
                            + p.getPoints() + ";" + p.getXp());
                    bw2.newLine();

                }
            }

            bw2.close();
            fw2.close();

        } catch (Exception ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }

}
