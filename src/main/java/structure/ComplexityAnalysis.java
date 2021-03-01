package structure;

/**
 * @author: hongliang_song
 * @date: 2021/2/26 5:13 下午
 * @Description: 复杂度分析
 */
public class ComplexityAnalysis {

    /**
     * 时间复杂度分析：
     * 1. 只关注循环执行次数最多的一段代码
     */
//    public int cal(int n){
//        int sum = 0;
//        int i = 1;
//        for (; i <= n; ++i) {
//            sum = sum + i;
//        }
//        return sum;
//    }

    /**
     * 2. 加法法则：总复杂度等于量级最大的那段代码的复杂度
     */
//    int cal(int n) {
//        int sum1 = 0;
//        int p = 1;
//        for (; p < 100; ++p) {
//            sum1 = sum1 + p;
//        }
//
//        int sum2 = 0;
//        int q = 1;
//        for (; q < n; ++q) {
//            sum2 = sum2 + q;
//        }
//
//        int sum3 = 0;
//        int i = 1;
//        int j = 1;
//        for (; i <= n; ++i) {
//            j = 1;
//            for (; j <= n; ++j) {
//                sum3 = sum3 + i * j;
//            }
//        }
//
//        return sum1 + sum2 + sum3;
//    }

    /**
     * 3. 乘法法则：嵌套代码的复杂度等于嵌套内外代码复杂度的乘积
     */
//    int cal(int n) {
//        int ret = 0;
//        int i = 1;
//        for (; i < n; ++i) {
//            ret = ret + f(i);
//        }
//        return ret;
//    }
//
//    int f(int n) {
//        int sum = 0;
//        int i = 1;
//        for (; i < n; ++i) {
//            sum = sum + i;
//        }
//        return sum;
//    }

    /**
     * 总结：常用的复杂度量级
     * 常量阶：O(1)
     * 对数阶：O(logn)
     * 线性阶：O(n)
     * 线性对数阶：O(nlogn)
     * 指数阶：O(2^n)
     * 阶乘阶：O(n!)
     * 平方阶：O(n^2)；立方阶：O(n^3)...k次方阶：O(n^k)
     */

    /**
     * 最好、最坏、平均、均摊时间复杂度
     */
    int find(int[] array, int n, int x) {
        int i = 0;
        int pos = -1;
        for (; i < n; ++i) {
            if (array[i] == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }


}
