/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snoopsnake;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author it
 */
public class Snake {
    
    {
        body = new ArrayList<Point>();
    }
    
    
    private ArrayList<Point> body;

    /**
     * @return the body
     */
    public ArrayList<Point> getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(ArrayList<Point> body) {
        this.body = body;
    }
}
