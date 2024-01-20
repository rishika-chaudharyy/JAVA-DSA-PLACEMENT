//Write a program to simplify the path
import java.util.Stack;

public class Stacks_Path {
    public static String simplify(String path) {
        String paths[] = path.split("/");
        Stack<String> s = new Stack<>();

        for (int i = 0; i < paths.length; i++) {
            if (paths[i].equals(".") || paths[i].equals("")) {
                continue;
            } else if (paths[i].equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(paths[i]);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!s.isEmpty()) {
            String folder = s.pop();
            res.insert(0, "/" + folder);
        }

        if (res.length() == 0) {
            return "/";
        }
        return res.toString();
    }

    public static void main(String args[]) {
        String path = "/a/./b/../../c/";
        String simplifiedPath = simplify(path);
        System.out.println("Simplified Path: " + simplifiedPath);
    }
}
