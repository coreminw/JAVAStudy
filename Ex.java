class Cal{
    int x,y;
    public Cal(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int sum(){
        System.out.println(x+y+"는 부모에서 나왔습니다.");
        return x+y;
    }
    public void run(){
        sum();
    }
}
class calcu extends Cal{
    public calcu(int x, int y) {
        super(x, y);
    }
    @Override
    public int sum(){
        System.out.println(x+y+"는 자식에서 나왔습니다.");
        return x+y;
    }
}
class calcu2 extends Cal{
    public calcu2(int x, int y) {
        super(x, y);
    }
    @Override
    public int sum(){
        System.out.println(x+y+"은 자식두번째에서 나왔습니다.");
        return x+y;
    }
}

public class Ex{
    public static void execute(Cal cal){
        System.out.println("실행결과");
        cal.run();
    }
    public static void main(String[] args) {
        Cal c = new calcu(1,2);
        Cal c2 = new calcu2(1,2);

        execute(c);
        execute(c2);
    }
}