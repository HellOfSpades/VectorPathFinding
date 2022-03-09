package Graphics;

public class Repainter extends Thread{

    Canvas canvas;

    public Repainter(Canvas canvas) {
        this.canvas = canvas;
    }

    public void run(){
        while (!interrupted()){
            try {

                canvas.repaint();

                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}
