package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 *
 * @author yangbo
 * @version v1.0.0
 * @date 2020-01-07 00:17
 */
public class TestJVM {

    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        // 测试分支
//        fillHeap(1000);
        // 第一次本地commit 第三次本地commit
        // 第二次本地commit
        // local first  // update first

        // local second

    }
}
