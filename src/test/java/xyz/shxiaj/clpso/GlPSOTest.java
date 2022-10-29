package xyz.shxiaj.clpso;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        System.out.println(f1 + " " + f2);
    }

    @Test
    public void Test4() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(r.nextDouble());
        }
    }

    @Test
    public void Test6() {
        File file = new File("./dat");
        if (!file.exists()) file.mkdir();
    }

    @Test
    public void Test7() {
        try {
            FileWriter fw = new FileWriter("./t.dat", true);
            fw.write("hello");
            fw.write("\r\n");
            fw.write("hee");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
