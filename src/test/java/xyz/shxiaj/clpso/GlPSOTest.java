package xyz.shxiaj.clpso;

import org.junit.Test;

import java.util.List;
import java.util.Random;

/**
 * @Author shxiaj.github.io
 * @Date 2022/10/28 15:24
 */
public class GlPSOTest {
    // @Test
    // public void Test1() {
    //     Particle p = new Particle(0, 0.5, 5);
    //     System.out.println(p);
    //     System.out.println(Arrays.deepToString(p.XLim));
    //     System.out.println(Arrays.deepToString(p.VLim));
    // }
    @Test
    public void Test2() {
        Pso pso = new Pso();
        pso.initialParts();
        List<Particle> parts = pso.getParts();
        for (Particle p : parts) {
            // pso.reassignLearnPart(p);
            // System.out.println(p.id + Arrays.toString(p.learnPart));
            System.out.println(p.toString());
        }
    }
    @Test
    public void Test3() {
        Random r = new Random();
        int f1 = r.nextInt(28);
        int f2 = f1;
        while (f1 == f2) {
            f2 = r.nextInt(28);
        }
        System.out.println(f1+" "+f2);
    }
    @Test
    public void Test4() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(r.nextDouble());
        }
    }
}
