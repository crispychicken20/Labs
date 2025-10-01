package week7Lab;

public class changeInterface implements IAdd{

    private int x;
    private int y;

    @Override
    public int add_aaa(int x, int y) {
        this.x = x;
        this.y = y;
        return x + y;
    }

    @Override
    public int get_x() {
        return x;
    }

    @Override
    public int get_y() {
        return y;
    }

    public void change_x(int new_value) {
        this.x = new_value;
    }

    public void change_y(int new_value) {
        this.y = new_value;
    }

    public static void main(String[] args) {
        
    }
    
}
