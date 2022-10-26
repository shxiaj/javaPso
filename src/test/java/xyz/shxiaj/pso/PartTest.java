package xyz.shxiaj.pso;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shxiaj.github.io
 * @Date 2022/10/26 11:03
 */
public class PartTest {
    @Test
    public void Test1() {
        List<Particle> parts = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            Particle particle = new Particle(i);
            parts.add(particle);
        }
        for (Particle p : parts) {
            System.out.println(p);
        }
    }
}
