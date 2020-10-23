import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class Screen extends JPanel implements Runnable, KeyListener {

    public static final int WIDTH = 400, HEIGHT = 400;

    private Thread thread;
    private boolean running = false;

    private Body body;
    private ArrayList<Body> snake;

    private Food food;
    private ArrayList<Food> foods;

    private Random rand;

    private int xCoor = 10, yCoor = 10;
    private int size = 5;

    private boolean right = true, left = false, up = false, down =false;

    private int ticks = 0;

    public Screen() {
        setFocusable(true);

        addKeyListener(this);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        rand = new Random();

        snake = new ArrayList<BodyPart>();
        foods = new ArrayList<Food>();

        start();
    }

    public void tick() {
        if (snake.size() == 0) {
            body = new BodyPart(xCoor, yCoor, 10);
            snake.add(body);
        }
        if(foods.size() == 0) {
            int xCoor = rand.nextInt(39);
            int yCoor = rand.nextInt(39);

            food = new Food(xCoor, yCoor, 10);
            foods.add(food);
        }

        for(int i = 0; i < foods.size(); i++) {
            if(xCoor == foods.get(i).getxCoor() &&
                    yCoor == foods.get(i).getyCoor()) {
                size++;
                foods.remove(i);
                i++;
            }
        }

        for(int i =0; i < snake.size(); i++) {
            if(xCoor == snake.get(i).getxCoor() &&
                    yCoor == snake.get(i).getyCoor()) {
                if(i != snake.size() - 1) {
                    stop();
                }
            }
        }
        if(xCoor < 0 || xCoor > 39 || yCoor < 0 || yCoor > 39) {
            stop();
        }


        ticks++;

        if(ticks > 500000) {
            if(right) xCoor++;
            if(left) xCoor--;
            if(up) yCoor--;
            if(down) yCoor++;

            ticks = 0;

            body = new Body(xCoor, yCoor, 10);
            snake.add(body);

            if(snake.size() > size) {
                snake.remove(0);
            }
        }
    }

    public void paint(Graphics graph) {
        graph.clearRect(0, 0, WIDTH, HEIGHT);
        graph.setColor(Color.BLACK);
        graph.fillRect(0, 0, WIDTH, HEIGHT);

        graph.setColor(Color.BLACK);
        for (int i = 0; i < WIDTH / 10; i++) {
            graph.drawLine(i * 10, 0, i * 10, HEIGHT);
        }
        for (int i = 0; i < HEIGHT / 10; i++) {
            graph.drawLine(0, i * 10, WIDTH, i * 10);
        }

        for (int i = 0; i < snake.size(); i++) {
            snake.get(i).draw(graph);
        }
        for(int i = 0; i < foods.size(); i++) {
            foods.get(i).draw(graph);
        }

    }

    public void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (running) {
            tick();
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT && !left)
        {
            up = false;
            down = false;
            right = true;
        }
        if(key == KeyEvent.VK_LEFT && !right)
        {
            up = false;
            down = false;
            left = true;
        }
        if(key == KeyEvent.VK_UP && !down)
        {
            left = false;
            right = false;
            up = true;
        }
        if(key == KeyEvent.VK_DOWN && !up)
        {
            left = false;
            right = false;
            down = true;
        }
    }
    @Override
    public void keyReleased(KeyEvent arg0)
    {
    }
    public void keyTyped(KeyEvent arg0)
    {
    }
}
