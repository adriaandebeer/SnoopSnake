/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snoopsnake;

import environment.Environment;
import environment.Grid;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author it
 */
class SnakeEnvironment extends Environment {

    private Grid grid;
    private int score;
    private Snake snake;

    {
        score = 0;
    }
    
    public SnakeEnvironment() {
    }

    @Override
    public void initializeEnvironment() {
        this.grid = new Grid();
        this.grid.setColor(Color.blue);
        this.grid.setColumns(64);
        this.grid.setRows(40);
        this.grid.setCellHeight(20);
        this.grid.setPosition(new Point(0, 100));
        this.setBackground(ResourceTools.loadImageFromResource("resources/Hulk.jpg"));
        
        this.snake = new Snake();        
        this.snake.getBody().add(new Point(5, 5));
        this.snake.getBody().add(new Point(5, 4));
        this.snake.getBody().add(new Point(5, 3));
        this.snake.getBody().add(new Point(4, 3));
        
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            score += 100;
        }

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (this.grid != null) {
            grid.paintComponent(graphics);
        }
        
        graphics.setFont(new Font("Comic Sans", Font.ITALIC, 26));
        graphics.drawString("Score: " + score, 30, 20);
    }
}
