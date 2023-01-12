package lesson_06;

// Template | Blueprint
// Functional Programming
public class MayGatDapLienHop {

    // What to solve, input output la gi
    public void gatLua(String cayLua){
        System.out.println("Dang gat " + cayLua);
    }

    public void xayLua(String hatLua){
        System.out.println("Dang xay " + hatLua);
    }

    public static void main(String[] args) {
        // tao object tu template
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop(); // Goi Constructor
        // .: dot notation
        mayGatDapLienHop.gatLua("Cay Lua");
        mayGatDapLienHop.xayLua("Hat Lua");
    }
}
