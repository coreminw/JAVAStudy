public class TV {
    String name;
    int year;
    int inch;

    public void show(){
        System.out.print(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
    }
    public TV(String name, int year, int inch){
        this.name=name;
        this.year=year;
        this.inch=inch;
    }
    public static void main(String args[]){
        TV myTV= new TV("LG",2017,32);
        myTV.show();
    }
}
