/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rarescrap.rsstats.utils;

import java.util.List;

/**
 *
 * @author rares
 */
public class DiceRoll {
    public int dice;
    private List<RollModificator> modificators;
    
    public DiceRoll(int dice) {
        this.dice = dice;
    }
    
    public void addModificatot(RollModificator rollModificator) {
        modificators.add(rollModificator);
    }
}