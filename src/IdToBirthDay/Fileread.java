package IdToBirthDay;

import java.io.*;

public class Fileread {
    /**
     * 功能描述:
     * <创建文件>
     *
     * @param filePath 1
     * @return void
     * @author zhoulipu
     * @date 2019/8/2 16:23
     */
    public static void createFile(String filePath) {
        try {
            File file = new File(filePath);
            // 判断文件是否存在
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述:
     * <追加写入>
     *
     * @param filePath 1
     * @param Content  2
     * @return void
     * @author zhoulipu
     * @date 2019/8/2 16:23
     */
    public static void writeFileAppend(String filePath, String Content) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(filePath, true);
            fw.write(Content);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.flush();
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 功能描述:
     * <覆盖写入>
     *
     * @param filePath 1
     * @param Content  2
     * @return void
     * @author zhoulipu
     * @date 2019/8/2 16:23
     */
    public static void writeFileOverlay(String filePath, String Content) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(filePath);
            pw.write(Content);
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.flush();
                pw.close();
            }
        }
    }

    /**
     * 功能描述:
     * <读取文件>
     *
     * @param filePath 1
     * @return void
     * @author zhoulipu
     * @date 2019/8/2 16:24
     */
    public static String readFile(String filePath) {
        InputStreamReader in = null;
        BufferedReader br = null;
        String res = "";
        try {
            File file = new File(filePath);
            in = new InputStreamReader(new FileInputStream(file), "utf-8");
            br = new BufferedReader(in);
            String s;
            // 逐行读取
            while ((s = br.readLine()) != null) {
                res += Trans.idToBirth(s) + "\n";
            }
            br.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return res;
    }
}
