package org.global.academy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Random; // Import Random class

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

// E1: Complete Flashcard class
class Flashcard extends JPanel {
    protected String front;
    protected String back;
    protected boolean learned;
    private boolean showingFront = true;
    private JLabel cardLabel;
    
    public Flashcard(String front, String back) {
        this.front = front;
        this.back = back;
        this.learned = false;
        
        // M1: Setup graphics for showCard functionality
        setupCard();
    }
    
    // Get/Set functions for variables
    public String getFront() {
        return front;
    }
    
    public void setFront(String front) {
        this.front = front;
    }
    
    public String getBack() {
        return back;
    }
    
    public void setBack(String back) {
        this.back = back;
    }
    
    public boolean isLearned() {
        return learned;
    }
    
    public void setLearned(boolean learned) {
        this.learned = learned;
    }
    
    // M1: showCard function with graphics
    private void setupCard() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 200));
        setBorder(BorderFactory.createRaisedBevelBorder());
        setBackground(Color.WHITE);
        
        cardLabel = new JLabel(front, SwingConstants.CENTER);
        cardLabel.setFont(new Font("Tahoma", Font.PLAIN, 18)); // M4: Use Tahoma font for Thai characters
        add(cardLabel, BorderLayout.CENTER);
        
        // Add click listener to flip card
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flipCard();
            }
        });
        
        // Add instruction label
        JLabel instructionLabel = new JLabel("Click to flip", SwingConstants.CENTER);
        instructionLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        instructionLabel.setForeground(Color.GRAY);
        add(instructionLabel, BorderLayout.SOUTH);
    }
    
    public void showCard() {
        showingFront = true;
        cardLabel.setText(front);
        repaint();
    }
    
    private void flipCard() {
        if (showingFront) {
            cardLabel.setText(back);
            showingFront = false;
        } else {
            cardLabel.setText(front);
            showingFront = true;
        }
        repaint();
    }
}

