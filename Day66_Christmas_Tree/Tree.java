package Day66_Christmas_Tree;

public class Tree {
    int width;
    int leaf_sections;

    public Tree(int width, int leaves_per_section) {
        this.width = width;
        this.leaf_sections = leaves_per_section;
    }

    private String centre(int width, String string) {
        return String.format("%" + (width + string.length()) / 2 + "s", string);
    }

    private String makeLeaf(int separation) {
        if (separation == 0) {
            return "/\\";
        }
        return String.format("/%-" + separation + "s\\", "");
    }

    public void makeTree() {
        System.out.println(centre(width, "*"));

        for (int i = 1; i < width; i += 2) {
            System.out.println(centre(width, makeLeaf(i % leaf_sections)));
        }

        for (int i = 0; i < 3; i += 1) {
            System.out.println(centre(width, "|   |"));
        }

    }
}