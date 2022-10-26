package xyz.shxiaj.pso;

import cn.hutool.core.io.FastByteArrayOutputStream;
import cn.hutool.core.io.IoUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author shxiaj.github.io
 * @Date 2022/10/24 20:09
 */

public class CmdTest {
    @Test
    public void Test1() throws Exception {
        ProcessBuilder pb = new ProcessBuilder();
        List<String> cmdArgs = new ArrayList<>();
        cmdArgs.add("ipconfig");
        cmdArgs.add("/all");
        pb.command(cmdArgs);
        Process ps = pb.start();
        FastByteArrayOutputStream fs = IoUtil.read(ps.getInputStream());
        String s = fs.toString("GBK");
        System.out.println(s);
    }
}
