import java.util.*;

class Student{
    private int id;
    private String tel;
    public Student(int id, String tel){
        this.id=id;
        this.tel=tel;
    }
    public int getId() {
        return id;
    }
    public String getTel(){
        return tel;
    }
}

public class HashMapStudentEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<String, Student> h = new HashMap<>();
        h.put("쪙", new Student(1, "010-1234-4321"));
        h.put("민욱이", new Student(2, "010-1212-2323"));


        while(true){
            System.out.println("검색할 이름은?");
            String name = sc.next();
            if(name.equals("exit")){
                System.out.println("시스템을 종료합니다.");
                break;
            }
            Student stu = h.get(name);
            if(stu==null)
                System.out.println(name+"은 없는이름입니다.");
            else
                System.out.println(stu.getId()+","+stu.getTel());
        }

    }
}
