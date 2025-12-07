package sucme;

import java.awt.*;
import javax.swing.*;

public class FundoPanel extends JPanel {
    private Image backgroundImage;

    public FundoPanel(String imagePath) {
        setImage(imagePath);
    }

    public void setImage(String imagePath) {
        java.net.URL imgURL = getClass().getResource(imagePath);
        if (imgURL != null) {
            backgroundImage = new ImageIcon(imgURL).getImage();
        } else {
            System.err.println("Imagem não encontrada: " + imagePath);
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(backgroundImage != null){
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
