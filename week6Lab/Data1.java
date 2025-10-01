package week6Lab;

public class Data1 {
    private int num;

    public Data1() {
        this.num = -1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        this.num = n;
    }

    @Override
    public boolean equals(Object OBJ) {
        if(this == OBJ) {
            return true;
        }

        if(OBJ == null || getClass() != OBJ.getClass()) {
            return false;
        }


        return this.num == ((Data1) OBJ).getNum();
    }
}

    