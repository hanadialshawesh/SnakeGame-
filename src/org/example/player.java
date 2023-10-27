package org.example;

public class player {
    
    
    private String playerName;
    private int position;

    
    public player( String name ){
        this.playerName = name;
        this.position = 0;
    }
    
    
    public String getPlayerName(){
        return playerName;
    }
    
    public int getposition(){
        return position;
    }
    
    public void setPlayerName( String name ){
        this.playerName = name;
    }
    
    public void setPosition( int num){
        this.position += num;
        
    }
    
}
