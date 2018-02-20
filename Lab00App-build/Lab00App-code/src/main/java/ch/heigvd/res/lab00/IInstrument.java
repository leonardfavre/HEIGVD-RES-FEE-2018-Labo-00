/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author lfavre15
 */
class IInstrument {
    int soundVolume;
    String sound = "";
    String color;
    
    public IInstrument(){
        
    }
    
    public String play(){
        return sound;
    }
    
    public int getSoundVolume(){
        return soundVolume;
    }
    
    public String getColor(){
        return color;
    }
}
