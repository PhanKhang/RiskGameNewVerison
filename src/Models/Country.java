package Models;
import java.util.ArrayList;

import View_Components.*;


public class Country{


    private String name;


    private Continent cont;
    private Player owner;
    private int army = 1;

    public CountryButton countryButton;

    private ArrayList<Country> neighbours;


    public Country(int x, int y, String name, Continent continent, int innerDiameter) {
        this.name = name;
        this.cont = continent;
        countryButton = new CountryButton(x,y,this);

        this.neighbours = new ArrayList<>();

    }

    public void setArmy(int army) {
        this.army = army;
    }

    public void setOwner(Player player) {
        this.owner = player;
    }

    public void sendArmy() {
        this.army++;
    }


    public String getName(){
        return name;
    }

    public ArrayList<Country> getNeighbours(){return neighbours;}
    public void addNeighbour(Country country) {
        this.neighbours.add(country);
    }

    public Continent getCont() {
        return cont;
    }


    public Player getOwner () {
        return owner;

    }
    public int getArmy(){
        return army;
    }






}

