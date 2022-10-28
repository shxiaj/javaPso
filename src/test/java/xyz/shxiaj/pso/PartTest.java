package xyz.shxiaj.pso;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Test
    public void Test2() {
        int ps = 30;
        double[] t = new double[ps];
        for (int i = 1; i < ps; i++) {
            t[i] = i * 1.0 / (ps - 1);
        }
        for (int i = 0; i < t.length; i++) {
            t[i] *= 5;
        }
        System.out.println(Arrays.toString(t));
        for (int i = 0; i < ps; i++) {
            double pc = 0.5 * (Math.exp(t[i]) - 1) / (Math.exp(t[ps - 1]) - 1);
            System.out.println(pc);
        }
    }
}
